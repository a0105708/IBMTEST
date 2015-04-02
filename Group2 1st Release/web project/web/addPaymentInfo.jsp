<%-- 
    Document   : addPaymentInfo
    Created on : Mar 28, 2015, 8:41:47 PM
    Author     : HanXiangyu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="templates/head.jsp"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <script type="text/javascript" src="http://cdn.jsdelivr.net/jquery.validation/1.13.1/jquery.validate.min.js"></script>

        <!-- If you're using Stripe for payments -->
        <script type="text/javascript" src="https://js.stripe.com/v2/"></script>
        <title>Add Payment Information</title>
    <body>
                <!-- header-section-starts -->
            <%-- start web service invocation --%><hr/>
    <%
	wss.PurchaseMgtWS_Service service = new wss.PurchaseMgtWS_Service();
	wss.PurchaseMgtWS port = service.getPurchaseMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Long accountId = Long.parseLong(session.getAttribute("userid").toString());
	// TODO process result here
	java.lang.Double result = port.checkOutItem(accountId);
    %>
    <%-- end web service invocation --%><hr/>
        
        <div class="header">
            <div class="top-header">
			<div class="wrap">
                            
				<div class="header-right">
					<ul>
						<li>
							<i class="user"></i>
							<%if (session.getAttribute("userid")!=null){ %>
                                                        <a href="viewAccount.jsp"><%out.print(session.getAttribute("useremail"));%></a>
                                                        <%} else{ %>
                                                        <a href="login.jsp">Login</a>
                                                        <% } %>
						</li>
                                                
                                                <%if (session.getAttribute("userid")!=null){ %>
                                                <li>
							<i class="cart"></i>
							<a href="order.jsp">My Orders</a>
						</li>
						
                                                <%}%>
                                                
						<li class="login">
							<i class="lock"></i>
							<%if (session.getAttribute("userid")!=null){ %>
							<a href="logout.jsp">Logout</a>
                                                        <%} else{ %>               
							<a href="register.jsp">Sign up</a>
                                                        <% } %>
						</li>
						
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="wrap">
                     
    
			<div class="header-bottom">
				<div class="logo">
					<a href="index.jsp"><img src="images/logo-4227.png" class="img-responsive" alt="" /></a>
				</div>
                            <div class="search">
					<div class="search2">
					  <form action="searchProduct.jsp" method="GET">
						<input type="submit" value="">
						<input type="text" name="productName" value="Search for a product, category or brand" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search for a product, category or brand';}"/>
					  </form>
					</div>
				</div>
				
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
        <!-- header-section-ends -->
        <div class="wrap">
          <%@include  file="templates\navigator.jsp" %>

        </div>
        <!-- start order -->
        
        <div class="container">
            <form role="form" id="payment-form" action="postPageWeb/payCartPost.jsp" method="POST"> 
            <div class="row">
                <div class="col-xs-12 col-md-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Shipping Address</h3>
                        </div>
                        <div class="panel-body">
                                                                                   
                                <div class="row">
                                    <div class="col-xs-7 col-md-7">
                                        <div class="form-group">
                                            <label for="cvCode">BLOCK NO</label>
                                            <input type="text" class="form-control" name="blockNo" required/>
                                        </div>
                                    </div>
                                    <div class="col-xs-5 col-md-5 pull-right">
                                        <div class="form-group">
                                            <label for="cvCode">ROOM NO</label>
                                            <input type="text" class="form-control" name="RoomNo" required/>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-12">
                                        <div class="form-group">
                                            <label for="couponCode">STREET</label>
                                            <input type="text" class="form-control" name="address" />
                                        </div>
                                    </div>                        
                                </div> 
                                <div class="row">
                                         <div class="col-xs-7 col-md-7">
                                        <div class="form-group">
                                            <label for="cvCode">POSTAL CODE</label>
                                            <input type="text" class="form-control" name="postalCode" required/>
                                        </div>
                                    </div>
                                    <div class="col-xs-5 col-md-5 pull-right">
                                        <div class="form-group">
                                            
                                        </div>
                                    </div>                   
                                </div>                            
                        </div>
                    </div>
                </div>
                <div class="col-xs-12 col-md-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title"><img class="pull-right" src="http://i76.imgup.net/accepted_c22e0.png">Payment Details</h3>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                    <div class="col-xs-12">
                                        <div class="form-group">
                                            <label for="cardNumber">CARD NUMBER</label>
                                            <div class="input-group">
                                                <input type="text" class="form-control" name="cardNumber" placeholder="Valid Card Number" required autofocus data-stripe="number" />
                                                <span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
                                            </div>
                                        </div>                            
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-xs-7 col-md-7">
                                        <div class="form-group">
                                            <label for="expMonth">EXPIRATION DATE</label>
                                            <div class="col-xs-6 col-lg-6 pl-ziro">
                                                <input type="text" class="form-control" name="expMonth" placeholder="MM" required data-stripe="exp_month" />
                                            </div>
                                            <div class="col-xs-6 col-lg-6 pl-ziro">
                                                <input type="text" class="form-control" name="expYear" placeholder="YY" required data-stripe="exp_year" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-xs-5 col-md-5 pull-right">
                                        <div class="form-group">
                                            <label for="cvCode">CV CODE</label>
                                            <input type="password" class="form-control" name="cvCode" placeholder="CV" required data-stripe="cvc" />
                                        </div>
                                    </div>
                                </div>
                             <div class="row">
                                    <div class="col-xs-12">
                                        <div class="form-group">
                                            <label for="couponCode">TOTAL COST:</label>
                                            <p>S$<%=request.getParameter("totalCost")%></p>
                                        </div>
                                    </div>
                                </div>      
                                <div class="row">
                                    <div class="col-xs-12">
                                        <input type="hidden" name="totalCost" value="<%=request.getParameter("totalCost")%>">
                                        <input type="hidden" name="accountId" value="<%=session.getAttribute("userid")%>">
                                        <button class="btn btn-success btn-lg btn-block" type="submit">Confirm</button>
                                    </div>
                                </div>
                                <div class="row" style="display:none;">
                                    <div class="col-xs-12">
                                        <p class="payment-errors"></p>
                                    </div>
                                </div>
                        </div>
                    </div>
                </div>
            </div>
            </form>
        </div>
        <%@include file="templates/footer.jsp"%>
    </body>
</html>
