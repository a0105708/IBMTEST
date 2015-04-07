<%-- 
    Document   : createGeneralReportPost
    Created on : Apr 5, 2015, 9:42:16 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
    String startYear = request.getParameter("startYear");
    String startMonth = request.getParameter("startMonth");
    String endYear = request.getParameter("endYear");
    String endMonth = request.getParameter("endMonth");
   
        wss.ReportMgtWS_Service service = new wss.ReportMgtWS_Service();
        wss.ReportMgtWS port = service.getReportMgtWSPort();
         // TODO initialize WS operation arguments here
        java.lang.Integer StartYear = Integer.valueOf(startYear);
        java.lang.Integer StartMonth = Integer.valueOf(startMonth);
        java.lang.Integer EndYear = Integer.valueOf(endYear);
        java.lang.Integer EndMonth=Integer.valueOf(endMonth);
        // TODO process result here
        port.createMonthlyReport(StartYear,StartMonth,EndYear,EndMonth);
        
        response.sendRedirect("../../report_general.jsp?addReportResult=true");
  %>

</html>

