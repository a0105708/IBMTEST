/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.ReportMgt;

import Entity.AccountMgt.OrderEntity;
import Entity.AccountMgt.PurchaseEntity;
import Entity.ProductMgt.ItemEntity;
import Entity.ProductMgt.ReportEntity;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
@Stateless
public class ReportMgtBean {

    @PersistenceContext
    private EntityManager em;

    public void createMonthlyReport(Integer startYear, Integer startMonth, Integer endYear, Integer endMonth) {
        try {
            String RESULT;
            System.out.print("start");
            if (startYear.equals(endYear) && startMonth.equals(endMonth)) {
                RESULT = "d:/GeneralReport-" + startYear + "." + startMonth + ".pdf";
            } else {
                RESULT = "d:/GeneralReport-" + startYear + "." + startMonth + "-" + endYear + "." + endMonth + ".pdf";
            }
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            Document document = new Document();
            PdfWriter.getInstance(document, baos);
            document.open();
            Image image = Image.getInstance("d:/logo-4227.png");
            image.scaleAbsolute(150, 50);
            document.add(new Paragraph(""));
            document.add(image);
            Calendar targetPeriod = Calendar.getInstance();
            int month = targetPeriod.get(Calendar.MONTH) + 1;
            int year = targetPeriod.get(Calendar.YEAR);
            String reportTile;
            document.add(new Paragraph("WineXpress General Sales Report", FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.BLACK)));

            if (startYear.equals(endYear) && startMonth.equals(endMonth)) {
                reportTile = startYear + "." + startMonth;
                document.add(new Paragraph(reportTile, FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.RED)));
            } else {
                reportTile = startYear + "." + startMonth + "-" + endYear + "." + endMonth;
                document.add(new Paragraph(reportTile, FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.RED)));
            }

            document.add(new Paragraph("Generated Time: " + new Date().toString(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12, Font.PLAIN, BaseColor.BLACK)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------"));

            PdfPTable table = new PdfPTable(6);
            table.getDefaultCell().setBorder(0);
//            PdfPCell cell= new PdfPCell(new Paragraph("Wine Name"));
//           cell.setColspan(4);
//            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            cell.setBackgroundColor(BaseColor.BLACK);
//           table.addCell(cell);
            table.addCell("Item ID");
            table.addCell("Item Name");
            table.addCell("Sales   (bottle)");
            table.addCell("Revenue (SGD)");
            table.addCell("Cost    (SGD)");
            table.addCell("Profit  (SGD)");

            Integer totalSales = 0;
            Double totalRevenue = 0D;
            Double totalCost = 0D;
            Double totalProfit = 0D;

            Query q1;
            q1 = em.createQuery("select i from PurchaseEntity i");
            Query q2;
            q2 = em.createQuery("select i from ItemEntity i");
            System.out.print("2");
            List<ItemEntity> itemList = q2.getResultList();
            List<PurchaseEntity> purchaseList = q1.getResultList();
            System.out.print("3");
             startMonth -= 1;
                endMonth -= 1;
            for (ItemEntity i : itemList) {
                Integer sales = 0;
                Double revenue = 0D;
                Double cost = 0D;

                for (PurchaseEntity p : purchaseList) {

                    if ((p.getPurchasedDate().get(Calendar.YEAR) >= startYear) && (p.getPurchasedDate().get(Calendar.YEAR) <= endYear)
                            && (p.getPurchasedDate().get(Calendar.MONTH) >= startMonth) && (p.getPurchasedDate().get(Calendar.MONTH) <= endMonth)) {
                        System.out.print("looploop1");
                        Long orderId = p.getOrderId();
                        OrderEntity order = em.find(OrderEntity.class, orderId);
                        ItemEntity item = em.find(ItemEntity.class, order.getItemId());
                        System.out.print("looploop2");
                        if (item.getId().equals(i.getId())) {
                            sales += p.getQuantity();
                            revenue += p.getTotalPrice();
                            cost += p.getQuantity() * item.getCost();
                            System.out.print("looploop3");
                        }
                    }
                }
                Double profit = revenue - cost;
                totalSales += sales;
                totalRevenue += revenue;
                totalCost += cost;
                totalProfit += profit;
                table.addCell(i.getId().toString());
                table.addCell(i.getItemName());
                table.addCell(sales.toString());
                table.addCell(revenue.toString());
                table.addCell(cost.toString());
                table.addCell(profit.toString());
            }

            document.add(table);

            document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------"));

            PdfPTable table2 = new PdfPTable(6);
            table2.getDefaultCell().setBorder(0);

            table2.addCell(" ");
            table2.addCell(" ");
            table2.addCell(totalSales.toString());
            table2.addCell(totalRevenue.toString());
            table2.addCell(totalCost.toString());
            table2.addCell(totalProfit.toString());

            document.add(table2);
            document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------"));

            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Copyright © 2015 All rights reserved | WineXpress", FontFactory.getFont(FontFactory.TIMES_BOLD, 12, BaseColor.BLACK)));
            document.close();
            FileOutputStream fos = new FileOutputStream(RESULT);
            fos.write(baos.toByteArray());
            fos.close();
            System.out.println("created");

            Calendar generatedTime = Calendar.getInstance();

            ReportEntity report = new ReportEntity("GeneralReport-" + reportTile, "G", RESULT, generatedTime);
            em.persist(report);
            em.flush();

        } catch (Exception e) {
        }
    }

    public void createProductReport(Long productId,Integer startYear, Integer startMonth, Integer endYear, Integer endMonth) {
        try {
            System.out.print("start");
            ItemEntity item = em.find(ItemEntity.class, productId);
            String RESULT;
            String reportTitle;
            
            if (startYear.equals(endYear) && startMonth.equals(endMonth)) {
                RESULT = "d:/ProductReport-"+ item.getId()+"-" + startYear + "." + startMonth + ".pdf";
                reportTitle=startYear + "." + startMonth;
            } else {
                RESULT = "d:/ProductReport-" + item.getId()+"-"+ startYear + "." + startMonth + "-" + endYear + "." + endMonth + ".pdf";
                reportTitle=startYear + "." + startMonth + "-" + endYear + "." + endMonth;
            }
                     
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            Document document = new Document();
            PdfWriter.getInstance(document, baos);
            document.open();
            Image image = Image.getInstance("d:/logo-4227.png");
            image.scaleAbsolute(150, 50);
            document.add(image);

            document.add(new Paragraph("WineXpress Product Sales Report", FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.BLACK)));
            document.add(new Paragraph("Item " + item.getId() + ": " + item.getItemName() + ", " + item.getVitage(), FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.RED)));
            document.add(new Paragraph("Generated Time: " + new Date().toString(), FontFactory.getFont(FontFactory.TIMES_BOLD, 12, Font.PLAIN, BaseColor.BLACK)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------"));

            PdfPTable table = new PdfPTable(5);
            table.getDefaultCell().setBorder(0);
//            PdfPCell cell= new PdfPCell(new Paragraph("Wine Name"));
//           cell.setColspan(4);
//            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            cell.setBackgroundColor(BaseColor.BLACK);
//           table.addCell(cell);
            table.addCell("Period");
            table.addCell("Sales");
            table.addCell("Revenue");
            table.addCell("Cost");
            table.addCell("Profit");
            table.addCell(" ");
            table.addCell("(bottle)");
            table.addCell("(SGD)");
            table.addCell("(SGD)");
            table.addCell("(SGD)");

            Integer totalSales = 0;
            Double totalRevenue = 0D;
            Double totalCost = 0D;
            Double totalProfit = 0D;

            Query q1;
            q1 = em.createQuery("select i from PurchaseEntity i");
            Query q2;
            q2 = em.createQuery("select i from ItemEntity i");
            System.out.print("2");
            List<ItemEntity> itemList = q2.getResultList();
            List<PurchaseEntity> purchaseList = q1.getResultList();
            System.out.print("3");
       
            for(int y=startYear; y<=endYear; y++){

            for (int m = startMonth-1; m<=endMonth-1 ; m++) {
                Integer sales = 0;
                Double revenue = 0D;
                Double cost = 0D;
                System.out.print("loop");
                for (PurchaseEntity p : purchaseList) {
                    System.out.print("looploop1");
                    Long orderId = p.getOrderId();
                    OrderEntity order = em.find(OrderEntity.class, orderId);
                    ItemEntity item1 = em.find(ItemEntity.class, order.getItemId());
                    System.out.print("looploop2");
                    if (item1.getId().equals(item.getId()) && p.getPurchasedDate().get(Calendar.MONTH) == m&&  p.getPurchasedDate().get(Calendar.YEAR) == y) {
                        sales += p.getQuantity();
                        revenue += p.getTotalPrice();
                        cost += p.getQuantity() * item.getCost();
                        System.out.print("looploop3");
                    }
                }
                Double profit = revenue - cost;
                totalSales += sales;
                totalRevenue += revenue;
                totalCost += cost;
                totalProfit += profit;
                int n=m+1;
                table.addCell(y+"-" + n);
                table.addCell(sales.toString());
                table.addCell(revenue.toString());
                table.addCell(cost.toString());
                table.addCell(profit.toString());
            }
            }
            document.add(table);

            document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------"));

            PdfPTable table2 = new PdfPTable(5);
            table2.getDefaultCell().setBorder(0);

            table2.addCell(" ");
            table2.addCell(totalSales.toString());
            table2.addCell(totalRevenue.toString());
            table2.addCell(totalCost.toString());
            table2.addCell(totalProfit.toString());

            document.add(table2);
            document.add(new Paragraph("--------------------------------------------------------------------------------------------------------------------------"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Copyright © 2015 All rights reserved | WineXpress", FontFactory.getFont(FontFactory.TIMES_BOLD, 12, BaseColor.BLACK)));
            document.close();
            FileOutputStream fos = new FileOutputStream(RESULT);
            fos.write(baos.toByteArray());
            fos.close();
            System.out.println("created");

            Calendar generatedTime = Calendar.getInstance();
            ReportEntity report = new ReportEntity("ProductReport-" + item.getId()+"-"+reportTitle, item.getId().toString(), RESULT, generatedTime);
            em.persist(report);
            em.flush();

        } catch (Exception e) {
        }
    }

    public List<ReportEntity> listReport(String type) {

        Query q1;
        q1 = em.createQuery("select i from ReportEntity i");
        List<ReportEntity> reportList = q1.getResultList();
        List<ReportEntity> result = new ArrayList<>();
        for (ReportEntity r : reportList) {
            if (r.getReportType().equals(type)) {
                result.add(r);
            }
        }
        return result;
    }
}
