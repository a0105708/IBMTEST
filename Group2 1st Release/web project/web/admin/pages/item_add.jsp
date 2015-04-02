<%-- 
    Document   : item_add
    Created on : Mar 16, 2015, 5:24:05 PM
    Author     : chenliyuquan
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
                    <h1 class="page-header">Add Item</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Basic item information
                        </div>
                        <div class="panel-body">
                            <form action="postpages/productMgt/addItemPost.jsp" action="POST">
                                <div class="form-group">
                                    <label>Name</label>
                                    <input name="name" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>Price</label>
                                    <input name="tastingNote" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label>Vintage</label>
                                    <input name="vintage" class="form-control">
                                </div>                                                
                                <div class="form-group">
                                    <label>Upload picture</label>
                                    <input type="file">
                                </div>                              
                                <div class="form-group">
                                    <label>Category</label>
                                    <select name="category" class="form-control">
                                        <%        wss.CatelogueMgtWS_Service service = new wss.CatelogueMgtWS_Service();
                                            wss.CatelogueMgtWS port = service.getCatelogueMgtWSPort();
                                            // TODO process result here
                                            java.util.List<wss.CategoryEntity> result = port.getAllCategory();

                                            for (int i = 0; i < result.size(); i++) {
                                                wss.CategoryEntity category = result.get(i);
                                                String name = category.getCategoryName();
                                        %>
                                        <option><%out.print(name);%></option>
                                        <%
                                            }
                                        %>                                                                       
                                    </select>
                                    <a href="category_add.jsp" class="alert-link">Can't find a category? create one</a>    

                                </div>
                                <div class="form-group">
                                    <label>Winery</label>
                                    <select name="winery" class="form-control">
                                        <%
                                            // TODO process result here
                                            java.util.List<wss.WineryEntity> result1 = port.getAllWinery();
                                            for (int i = 0; i < result1.size(); i++) {
                                                wss.WineryEntity winery = result1.get(i);
                                                String name = winery.getWineryName();
                                        %>
                                        <option><%out.print(name);%></option>

                                        <%
                                            }
                                        %>                                    
                                    </select>
                                    <a href="winery_add.jsp" class="alert-link">Can't find a winery? create one</a>    

                                </div>
                                <div class="form-group">
                                    <label>Country</label>
                                    <select name="country" class="form-control">

                                        <%
                                            java.util.List<wss.RegionEntity> result2 = port.getAllRegion();
                                            for (int i = 0; i < result2.size(); i++) {
                                                wss.RegionEntity region = result2.get(i);
                                                String country = region.getRegionName();
                                        %>                                              
                                        <option><%out.print(country);%></option>                                         
                                        <%
                                            }
                                        %>

                                    </select>   
                                    <a href="region_add.jsp" class="alert-link">Can't find a country? create one</a>    

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
