<%-- 
    Document   : report_productReportList
    Created on : Apr 5, 2015, 10:23:36 PM
    Author     : Administrator
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.awt.Frame"%>
<%@page import="java.awt.FileDialog"%>
<%@page import="java.awt.Desktop"%>
<%@page import="java.io.File"%>
<%@page import="java.util.Calendar"%>
<!DOCTYPE html>


<%@include file="templates/Head.jsp" %>

<script src="../bower_components/bootstrap/dist/css/dataTables.bootstrap.css"></script>

<!-- jQuery -->
<script src="../bower_components/jquery/dist/jquery-1.11.1.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

<!-- DataTables JavaScript -->
<script src="../bower_components/DataTables/media/js/jquery.dataTables.js"></script>
<script src="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../dist/js/sb-admin-2.js"></script>

<script type="text/javascript">
    $(document).ready(function () {
        $('#dataTableID').dataTable({
            "pagingType": "full_numbers"
        });
    });

    function geneServerTable() {

        var t = $('#dataTableID').dataTable({
            "info": true,
            "pagingType": "full_numbers"
        });
    }
</script>  

<body>

    <div id="wrapper">

        <%@include file="templates/Navigator.jsp" %>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Report management</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <%                        
                        wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
                        wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
                        String itemId = request.getParameter("itemId");
                        if(itemId==null)
                            itemId=session.getAttribute("itemId").toString();
                        wss.ItemEntity item = port.getItemById(itemId);
                        session.setAttribute("itemId", itemId);
                        
                        String createResult = request.getParameter("addReportResult");
                        if (createResult != null && createResult.equals("true")) {
                    %>
                    <div class="alert alert-success">
                        Report Created Successfully.             
                    </div>

                    <%
                        }
                    %>

                    <%
                        String editResult = request.getParameter("editResult");
                        if (editResult != null && editResult.equals("true")) {
                    %>
                    <div class="alert alert-success">
                        Item edited successfully.             
                    </div>

                    <%
                        }
                    %>

                    <div class="panel-heading">
                        Report List of Product  <%  
                      System.out.println(item.getId());
                        item.getId();
                        %>
                        <div class="botton5">
                            <form action="create_productReport.jsp">
                                <input type="submit" value="Create Product Report" class="botton100" >
                            </form>

                        </div>
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <table id="dataTableID" class="table table-bordered table-hover table-striped" >

                            <thead>
                                <tr>
                                    <th>Report</th>
                                    <th>Generated Time</th>
                                    <th>View</th>
                                </tr>
                            </thead>
                            <tbody>

                                <%                                        try { //get list of all accounts

                                      

                                        wss.ReportMgtWS_Service service1 = new wss.ReportMgtWS_Service();
                                        wss.ReportMgtWS port1 = service1.getReportMgtWSPort();
                                        
                                        java.util.List<wss.ReportEntity> result = port1.listReport(item.getId().toString());

                                        // TODO process result here
                                        System.err.println("Webservice invoked");
                                        System.err.println(result.size());
                                        for (int i = result.size() - 1; i >= 0; i--) {
                                            System.err.println("iteration " + i);

                                            String name = result.get(i).getReportName();
                                            //   Calendar generatedTime = result.get(i).getGeneratedTime().toGregorianCalendar();
                                            long reportId = result.get(i).getId();
                                            int rowNum = i + 1;
                                            String rowNumber = String.valueOf(rowNum);
                                            Date date = result.get(i).getGeneratedTime().toGregorianCalendar().getTime();
                                            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                                            String date1 = format1.format(date);

                                            out.println("<tr class=\"" + rowNumber + " gradeX\">");
                                            out.println("<td>" + name + "</td>");
                                            out.println("<td>" + date1 + "</td>");

                                            //out.println("<td>" + cateId + "</td>");
                                            out.println("<td> <div class=\"btn-group\"> <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">");
                                            out.println("Action <span class=\"caret\"></span>");
                                            out.println("</button><ul class=\"dropdown-menu\" role=\"menu\">");

                                            out.println("<li><a href=\"postpages/productMgt/viewReport.jsp?reportName=" + name + "\">View</a></li>");
                                            out.println("<li><a href=\"postpages/productMgt/viewReport.jsp?reportName=" + name + "\">Delete</a></li>");

                                            out.println("</ul></div></td>");
                                            out.println("</tr>");
                                        }
                                    } catch (Exception ex) {
                                        // TODO handle custom exceptions here
                                    }
                                %>

                            </tbody>
                        </table>



                    </div>
                    <!-- /.col-lg-6 -->
                    <!-- /.row -->
                </div>
                <!-- /#page-wrapper -->
            </div>
        </div>
    </div>
    <!-- /#wrapper -->
    <!-- Page-Level Demo Scripts - Tables - Use for reference -->


</body>

</html>
