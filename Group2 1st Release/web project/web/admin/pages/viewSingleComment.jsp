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
                    <h1 class="page-header">View comments - item (<%out.print(request.getParameter("itemId"));%>)</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <%                                String deleteResult = request.getParameter("deleteCommentResult");
                            if (deleteResult != null && deleteResult.equals("true")) {
                        %>
                        <div class="alert alert-success">
                            Comment delete success.
                        </div>

                        <%
                            }

                        %>
                        <div class="panel-heading">
                            Tables
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table id="dataTableID" class="table table-bordered table-hover table-striped" >
                                <thead>
                                    <tr>
                                        <th>Comment ID</th>
                                        <th>User</th>
                                        <th>Comment content</th>
                                        <th>Rating</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%-- start web service invocation --%>
                                    <%      
                                            String id = request.getParameter("itemId");
                                            wss.ProductMgtWS_Service service = new wss.ProductMgtWS_Service();
                                            wss.ProductMgtWS port = service.getProductMgtWSPort();
                                            // TODO initialize WS operation arguments here
                                            java.lang.Long itemId = Long.valueOf(id);
                                            // TODO process result here
                                            java.util.List<wss.CommentEntity> result = port.viewAllCommentsOfProduct(itemId);

                                            System.err.println("Array size is: " + result.size());
                                            for (int i = 0; i < result.size(); i++) {
                                                wss.CommentEntity comment = result.get(i);

                                                Long commentId = comment.getId();
                                                Long userId = comment.getAccountId();
                                                String content = comment.getContents();
                                                double rating = comment.getRating();
                                                String rowNumber = (i % 2 == 0) ? "even" : "odd";
                                                
                                                out.println("<tr class=\"" + rowNumber + " gradeX\">");
                                                out.println("<td>" + commentId + "</td>");
                                                out.println("<td>" + userId + "</td>");
                                                out.println("<td>" + content + "</td>");
                                                out.println("<td>" + rating + "</td>");
                                                out.println("<td> <div class=\"btn-group\"> <button type=\"button\" class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">");
                                                out.println("Action <span class=\"caret\"></span>");
                                                out.println("</button><ul class=\"dropdown-menu\" role=\"menu\">");                                                
                                                out.println("<li><a href=\"postpages/productMgt/deleteCommentPost.jsp?itemId="+ id +"&commentId=" + commentId + "\">Delete</a></li>");
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
