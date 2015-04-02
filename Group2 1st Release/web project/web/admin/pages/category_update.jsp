<%-- 
    Document   : category_add
    Created on : Mar 16, 2015, 10:33:07 PM
    Author     : Han Xiangyu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="templates/Head.jsp"%>

    <body>

        <%@include file="templates/Navigator.jsp" %>
            <%-- start web service invocation --%><hr/>
    <%
	wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
	wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String categoryId = request.getParameter("cateId");
	// TODO process result here
	wss.CategoryEntity result = port.getCategoryById(categoryId);
        
        java.lang.String cateName = result.getCategoryName();
        java.lang.String cateSpec = result.getCategorySpec();
    %>
    <%-- end web service invocation --%><hr/>

        
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Update Category</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Update Category information
                        </div>
                        <div class="panel-body">
                            <form action="postpages/productMgt/updateCategoryPost.jsp" method="POST">
                                <div class="form-group">
                                    <label>Category Name</label>
                                    <input name="cateName" value=<%=cateName%> class="form-control">
                                </div> 
                                 <div class="form-group">
                                    <label>Category Specification</label>
                                    <input name="cateSpec" value=<%=cateSpec%> class="form-control">
                                </div>                                
                                <input name="categoryId" type="hidden" value=<%=categoryId%>>
                                <button type="submit" name="choice" value="update" class="btn btn-default">Update</button>
                                <button type="submit" name="choice" value="back" class="btn btn-default">Back</button>

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


