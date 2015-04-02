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
	java.lang.String regionId = request.getParameter("regionId");
	// TODO process result here
	wss.RegionEntity result = port.getRegionById(regionId);
        
        java.lang.String wineryName = result.getRegionName();
        java.lang.String address = result.getCountry();
        java.lang.String contact = result.getRegionSpec();
    %>
    <%-- end web service invocation --%><hr/>

        
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Update Region</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Update Region information
                        </div>
                        <div class="panel-body">
                            <form action="postpages/productMgt/updateRegionPost.jsp" method="POST">
                                <div class="form-group">
                                    <label>Region Name</label>
                                    <input name="regionName" value=<%=wineryName%> class="form-control">
                                </div> 
                                 <div class="form-group">
                                    <label>Country</label>
                                    <input name="country" value=<%=address%> class="form-control">
                                </div>  
                                 <div class="form-group">
                                    <label>Region Specification</label>
                                    <input name="regionSpec" value=<%=contact%> class="form-control">
                                </div>  
                                <input name="regionId" type="hidden" value=<%=regionId%>>
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


