<%@page import="wss.WineryEntity"%>
<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
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
                    <h1 class="page-header">Winery management</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <%
                        String deleteResult = request.getParameter("deleteResult");
                        String updateResult = request.getParameter("updateResult");
                        if(deleteResult!=null && deleteResult.equals("true")){
                        %>
                        <div class="alert alert-success">
                                 Region deleted successfully.             
                        </div>
                        
                        <%
                        }else if(updateResult!=null && updateResult.equals("true")){
                        %>
                        <div class="alert alert-success">
                                 Region Updated successfully.             
                        </div>                      
                        <%}
                        %>
                        <div class="panel-heading">
                            Basic Region Information
                        </div>
                        
                        <div class="panel-body">
                            <table id="dataTableID" class="table table-bordered table-hover table-striped" >
                               
                                <thead>
                                    <tr>
                                        <th>Region Name</th>
                                        <th>Country</th>
                                        <th>Region Specification</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <%                                                try { //get list of all accounts

                                            wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
                                            wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
                                            // TODO process result here
                                            System.err.println("Webservice invoked");

                                            java.util.List<wss.RegionEntity> result = port.getAllRegion();

                                            for (int i = 0; i < result.size(); i++) {

                                                String name = result.get(i).getRegionName();
                                                String address = result.get(i).getCountry();
                                                String contact = result.get(i).getRegionSpec();
                                                String regionId = result.get(i).getId().toString();
                                                int rowNum = i + 1;
                                                String rowNumber = String.valueOf(rowNum);

                                                out.println("<tr class=\"" + rowNumber + " gradeX\">");
                                                out.println("<td>" + name + "</td>");
                                                out.println("<td>" + address + "</td>");
                                                out.println("<td>" + contact + "</td>");
                                                out.println("<td> <div class=\"btn-group\"> <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">");
                                                out.println("Action <span class=\"caret\"></span>");
                                                out.println("</button><ul class=\"dropdown-menu\" role=\"menu\">");

                                                out.println("<li><a href=\"region_update.jsp?regionId=" + regionId + "\">Edit</a></li>");
                                                out.println("<li><a href=\"postpages/productMgt/deleteRegionPost.jsp?regionId=" + regionId + "\">Delete</a></li>");
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
                    </div>
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
