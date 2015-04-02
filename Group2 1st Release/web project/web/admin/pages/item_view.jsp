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
                    <h1 class="page-header">Item Management</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <%
                        String deleteResult = request.getParameter("deleteResult");
                        if(deleteResult!=null && deleteResult.equals("true")){
                        %>
                        <div class="alert alert-success">
                                 Item deleted successfully.             
                        </div>
                        
                        <%
                        }
                        %>
                        
                         <%
                        String editResult = request.getParameter("editResult");
                        if(editResult!=null && editResult.equals("true")){
                        %>
                        <div class="alert alert-success">
                                 Item edited successfully.             
                        </div>
                        
                        <%
                        }
                        %>
                        
                        <div class="panel-heading">
                            View items
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table id="dataTableID" class="table table-bordered table-hover table-striped" >
                                <thead>
                                    <tr>
                                        <th>Item ID</th>
                                        <th>Item Name</th>
                                        <th>Item Category</th>
                                        <th>Item Vintage</th>
                                        <th>Item Winery</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%-- start web service invocation --%>

                                    <%                                           
                                            wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
                                            wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
                                            // TODO process result here
                                            java.util.List<wss.ItemEntity> result = port.getAllItem();

                                            System.err.println("Webservice invoked");

                                            System.err.println("Array size is: " + result.size());
                                            for (int i = 0; i < result.size(); i++) {
                                                wss.ItemEntity item = result.get(i);
                                                Long id = item.getId();
                                                String name = item.getItemName();
                                                String category = item.getCategory().getCategoryName();
                                                String vintage = item.getVitage();
                                                String winery = item.getWinery().getWineryName();
                                                String rowNumber = (i % 2 == 0) ? "even" : "odd";

                                                out.println("<tr class=\"" + rowNumber + " gradeX\">");
                                                out.println("<td>" + id + "</td>");
                                                out.println("<td>" + name + "</td>");
                                                out.println("<td>" + category + "</td>");
                                                out.println("<td>" + vintage + "</td>");
                                                out.println("<td>" + winery + "</td>");
                                                out.println("<td> <div class=\"btn-group\"> <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">");
                                                out.println("Action <span class=\"caret\"></span>");
                                                out.println("</button><ul class=\"dropdown-menu\" role=\"menu\">");
                                                out.println("<li><a href=\"item_edit.jsp?itemId="+id+"\">Edit</a></li>");
                                                out.println("<li><a href=\"viewSingleComment.jsp?itemId=" +id + "\">View comments</a></li>");                                                                                                                                                
                                                out.println("<li><a href=\"postpages/productMgt/deletePost.jsp?itemId=" +id + "\">Delete</a></li>");
                                                out.println("</ul></div></td>");
                                                out.println("</tr>");
                                            }                                                                                                                                                      
                                    %>
                                    <%-- end web service invocation --%>
                                </tbody>
                            </table>
                            
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>               
            <!-- /.row -->
        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->
    <!-- Page-Level Demo Scripts - Tables - Use for reference -->


</body>

</html>
