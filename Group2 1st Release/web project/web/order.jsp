<%@page import="wss.ItemEntity"%>
<%@page import="wss.OrderEntity"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <%@include file="templates/head.jsp"%>
    <body>
        <!-- header-section-starts -->
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
							<a href="order.jsp">My Shopping Cart</a>
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
        
        <div class="wrap">
            <section id="main">
	<div class="content">
		<div class="pag-nav">
			<ul class="p-list">
				<li><a href="index.jsp">Home</a></li> &nbsp;&nbsp;/&nbsp;
                                <li class="act"><a href="purchaseHistory.jsp" class="cart-button"><h5>&nbsp;Purchase History </h5></a></li>
			</ul>
		</div>
		<div class="coats">
			<h3 class="c-head">View Orders in My Shopping Cart</h3>
                        <br>
		</div>
        
            
            <div class="container">
                                  <%
                        String deleteResult = request.getParameter("deleteResult");
                        if(deleteResult!=null && deleteResult.equals("true")){
                        %>
                        <div class="alert alert-success">
                                 Item deleted from your shopping cart successfully!            
                        </div>                       
                        <%
                        }
                        %>
                      
                     <%-- start web service invocation --%><hr/>
    <%
    try {
	wss.PurchaseMgtWS_Service service = new wss.PurchaseMgtWS_Service();
	wss.PurchaseMgtWS port = service.getPurchaseMgtWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.Long accountId = Long.parseLong(session.getAttribute("userid").toString());
	// TODO process result here
	java.util.List<wss.OrderEntity> result = port.viewShoppingCart(accountId);
        Double totalCost = 0.0, total = 0.0;
        int  totalQuantity =0;
	%>
    
                <div class="panel" style="background-color: #F6F6F6">
                   
                <div class="row">
                    
                    <div class="col-sm-12 col-md-10 col-md-offset-1">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Date: 2015-03-15   Order #: 8986150315</th>
                                    <th>Quantity</th>
                                    <th class="text-center">Price</th>
                                    <th class="text-center">Total</th>
                                    <th> </th>
                                </tr>
                            </thead>
                            <tbody>
                            <%for(OrderEntity o: result){
                                   int quantity = o.getQuantity();
                                   String date = o.getDate().toString();
                                   String itemId = o.getItemId().toString();
                            %>
                            
                                <%-- start web service invocation --%><hr/>
    <%
	wss.CatelogueMgtWS_Service service2 = new wss.CatelogueMgtWS_Service();
	wss.CatelogueMgtWS port2 = service2.getCatelogueMgtWSPort();
	 // TODO initialize WS operation arguments here
	// TODO process result here
	wss.ItemEntity item = port2.getItemById(itemId);
	String itemName = item.getItemName();
        String vitage = item.getVitage();
        String price = item.getTastingNote();
        Double totalItemP = Double.parseDouble(price) * quantity;
        total += totalItemP;
        totalQuantity += (quantity*0.8);
        totalCost = total + totalQuantity;
    %>
    <%-- end web service invocation --%><hr/>

                            <tr>
                                <form action="postPageWeb/deleteItemPost.jsp" action="POST">
                                    <td class="col-sm-8 col-md-6">
                                        <div class="media">
                                            <a class="thumbnail pull-left" href="#"> <img class="media-object" src="https://winestore-cdn.r.worldssl.net/img/wines/img_190_s.png" style="width: 36px; height: 72px;"> </a>
                                            <div class="media-body">
                                                <h4 class="media-heading"><a href="#"><%=itemName%></a></h4>
                                                <h5 class="media-heading"><a href="#">Vitage: <%=vitage%></a></h5>
                                                <span>Status: </span><span class="text-warning"><strong><%=date%></strong></span>
                                            </div>
                                        </div></td>
                                    <td class="col-sm-1 col-md-1" style="text-align: center">
                                        <strong><%=quantity%></strong>
                                    </td>
                                    <td class="col-sm-1 col-md-1 text-center"><strong>S$<%=price%></strong></td>
                                    <td class="col-sm-1 col-md-1 text-center"><strong>S$<%=totalItemP%></strong></td>
                                    <td class="col-sm-1 col-md-1">
                                        <input type="hidden" name="userId" value="<%=session.getAttribute("userid")%>">
                                        <input type="hidden" name="itemId" value="<%=itemId%>">
                                        <button type="submit" class="btn btn-danger">
                                            <span class="glyphicon glyphicon-remove"></span> Delete
                                        </button>
                                    </td>
                                </form>
                            </tr>
                            <%    
                            }
                            %> 
                                <tr>
                                    <td>   </td>
                                    <td>   </td>
                                    <td>   </td>
                                    <td><h5>Subtotal</h5></td>
                                    <td class="text-right"><h5><strong>S$<%=total%></strong></h5></td>
                                </tr>
                                <tr>
                                    <td>   </td>
                                    <td>   </td>
                                    <td>   </td>
                                    <td><h5>Shipping Cost</h5></td>
                                    <td class="text-right"><h5><strong>S$<%=totalQuantity%></strong></h5></td>
                                </tr>
                                <tr>
                                    <td>   </td>
                                    <td>   </td>
                                    <td>   </td>
                                    <td><h4>Total</h4></td>
                                    <td class="text-right"><h4><strong>S$<%=totalCost%></strong></h4></td>
                                </tr> 
                                <tr>
                                    <td>   </td>
                                    <td>   </td>
                                    <td>   </td>
                                    <td>   </td>
                                    <td class="text-right">
                                         <div class="button">
                                            <form action="addPaymentInfo.jsp" action="POST">
                                                <span>
                                                    <img src="images/cart.jpg" alt="" />
                                                    <input type="hidden" name="totalCost" value="<%=totalCost%>">
                                                    <input type="submit" value="Check Out">
                                                </span> 
                                            </form>
                                         </div>
                                    </td>
                                </tr> 
                            </tbody>
                        </table>                                                
                    </div>
                    </div>
                </div>
                <br>
            <%} catch (Exception ex) {
	out.println("Sorry, No item in your cart now!");
    }
    %>
    <%-- end web service invocation --%><hr/>
            </div>
            </div>
            
            <!-- view purchase history here!  --!>
            </section>
        </div>
        <!-- ends order -->
        <%@include file="templates/footer.jsp"%>
    </body>
</html>