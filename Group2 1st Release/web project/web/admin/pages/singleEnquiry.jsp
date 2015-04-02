<%@page import="org.json.JSONObject"%>
<%@page import="org.json.JSONArray"%>
<!DOCTYPE html>


<%@include file="templates/Head.jsp" %>

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

<body>
    <%@include file="templates/Navigator.jsp" %>

    <div id="wrapper">
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">View Enquiry</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->

                <div class="col-lg-12">
                    <div class="panel panel-default">

                        <div class="panel-body">
                            <%
                                String enquiry = request.getParameter("enquiryId");
                                Long enquiryId = Long.parseLong(enquiry);

                                wss.EnquiryWebService_Service service = new wss.EnquiryWebService_Service();
                                wss.EnquiryWebService port = service.getEnquiryWebServicePort();
                                // TODO initialize WS operation arguments here
                                java.lang.Long adminId = Long.valueOf(1);
                                // TODO process result here
                                wss.EnquiryEntity result = port.viewOneEnquiry(adminId, enquiryId);
                                String content = result.getContent();
                                Boolean replied = result.isReplied();
                                String date = result.getDate().toString().substring(0, 10);

                            %>

                            <div class="coats">
                                <h4 class="c-head">Reply Enquiry ( Enquiry ID = <% out.print(enquiryId); %> )</h4>
                                <div class="clearfix"></div>

                                <h4 class="c-">Enquiry Date
                                    <small> <% out.print(date);%></small>
                                </h4>
                                <div class="clearfix"></div>

                                <h4 class="c-">Enquiry Content
                                </h4>
                                <div class="clearfix"></div>

                                <h5><code>
                                        <% out.print(content);%> 
                                    </code>
                                </h5>
                                <div class="clearfix"></div>

                            </div>
                        </div>
                        <div class="panel-body">
                         <%
                          if(replied){
                              
                         %>
                         <div class="alert alert-info">
                             The enquiry has been replied.
                            </div>
                         <%
                          } else {
                         %>
                         <form action="postpages/accMgt/enquiryPost.jsp?enquiryId=<%out.print(enquiryId);%>" method="POST">
                         <div class="form-group">
                                            <h4>Reply Message:</h4>
                                            <textarea name="message" class="form-control" rows="3"></textarea>
                         </div>
                         
                         <button type="submit" class="btn btn-default">Submit</button>
                         </form>
                         <%
                          }
                         %>
                        </div>   


                    </div>
                </div>    
            </div>
            <!-- /.container-fluid -->
        </div>
    </div>
                        
   <script src="../bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>
</body>

</html>
