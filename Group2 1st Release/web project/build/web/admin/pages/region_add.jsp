<%-- 
    Document   : category_add
    Created on : Mar 16, 2015, 10:33:07 PM
    Author     : Ser3na
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="templates/Head.jsp"%>

    <body>

        <%@include file="templates/Navigator.jsp" %>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Add New Category</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <%
                        String deleteResult = request.getParameter("addResult");
                        if(deleteResult!=null && deleteResult.equals("true")){
                        %>
                        <div class="alert alert-success">
                                 Region added successfully.             
                        </div>                       
                        <%
                        }
                        %>
                        <div class="panel-heading">
                            Basic region information
                        </div>
                        <div class="panel-body">
                            <form action="postpages/productMgt/addRegionPost.jsp" action="POST">
                                <div class="form-group">
                                    <label>Region Name</label>
                                    <input name="regionName" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>Country</label>
                                    <input name="country" class="form-control">
                                </div>  
                                <div class="form-group">
                                    <label>Specifications</label>
                                    <input name="regionSpec" class="form-control">
                                </div>                            
                                <button type="submit" class="btn btn-default">Submit</button>
                            </form>

                            <!-- /.col-lg-6 (nested                            <!-- /.row (nested) -->
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
      
        <script src="../bower_components/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="../dist/js/sb-admin-2.js"></script>
    </body>
</html>


