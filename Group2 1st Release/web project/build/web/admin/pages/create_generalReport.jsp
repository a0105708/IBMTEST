<%-- 
    Document   : create_generalReport
    Created on : Apr 5, 2015, 8:50:09 PM
    Author     : Administrator
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
                    <h1 class="page-header">Create General Report</h1>
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
                            <form action="postpages/productMgt/createGeneralReportPost.jsp" action="POST">
                                                           
                                <div class="form-group">
                                    <label>Start Period</label>
                                    <select name="startYear" class="form-control">
                                        <%        
                                            for (int i = 2010; i < 2016; i++) {
                                               
                                        %>
                                        <option><%out.print(i);%></option>
                                        <%
                                            }
                                        %>                                                                       
                                    </select>

                                </div>
                                <div class="form-group">
                                    <select name="startMonth" class="form-control">
                                       <%        
                                            for (int i = 1; i < 13; i++) {
                                               
                                        %>
                                        <option><%out.print(i);%></option>
                                        <%
                                            }
                                        %>                                          
                                    </select>
                                </div>
                                    
                                 <div class="form-group">
                                    <label>End Period</label>
                                    <select name="endYear" class="form-control">
                                        <%        
                                            for (int i = 2010; i < 2016; i++) {
                                               
                                        %>
                                        <option><%out.print(i);%></option>
                                        <%
                                            }
                                        %>                                                                       
                                    </select>

                                </div>
                                <div class="form-group">
                                    <select name="endMonth" class="form-control">
                                       <%        
                                            for (int i = 1; i < 13; i++) {
                                               
                                        %>
                                        <option><%out.print(i);%></option>
                                        <%
                                            }
                                        %>                                          
                                    </select>
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
