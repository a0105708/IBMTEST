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
		<!-- start login -->
		<section id="main">
	<div class="new-product">
				<div class="new-product-top">
				<div class="pag-nav">
					<ul class="p-list">
						<li><a href="index.jsp">Home</a></li> &nbsp;&nbsp;/&nbsp;
						<li class="act">&nbsp;Contact</li>
					</ul>
				</div>
				<div class="coats">
			        <h3 class="c-head">contact-us</h3>
		        </div>
                                     <div class="clearfix"></div>
                        <!-- Map -->
            <div class="map" style="height:500px;">
                <iframe width="100%" height="100%" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3988.7993817759025!2d103.77371490000002!3d1.2949240999999985!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x9f0d02392be4dfbe!2sNational+University+of+Singapore+School+of+Computing!5e0!3m2!1sen!2ssg!4v1395479893308"></iframe>
                <br />
                <small>
                    <a href="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3988.7993817759025!2d103.77371490000002!3d1.2949240999999985!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x9f0d02392be4dfbe!2sNational+University+of+Singapore+School+of+Computing!5e0!3m2!1sen!2ssg!4v1395479893308" width="400" height="300" frameborder="0" style="border:0"></a>
                </small>
            </div>
            <!-- /Map -->
				<div class="singel_right">
			     <div class="lcontact span_1_of_contact">
                                 (Please login before you submit inquiry)
                                 <div class="clearfix"></div>
				      <div class="contact-form">
                                            <form method="post" action="contactPost.jsp">
                                                <p class="comment-form-author"><label for="author">Message:</label>
                                                    <textarea name="content" value="Enter your message here..." onfocus="this.value = '';" onblur="if (this.value === '') {this.value = 'Message';}">Enter your message here...</textarea>
                                                </p>
                                                <input name="submit" type="submit" id="submit" value="Submit">
                                            </form>
				       </div>
			     </div>
			     <div class="contact_grid span_2_of_contact_right">
					<h3>Address</h3>
				    <div class="address">
						<i class="pin_icon"></i>
					    <div class="contact_address">
                                               25 Lower Kent Ridge Road, SG119081
					    </div>
					    <div class="clearfix"></div>
					</div>
					<div class="address">
						<i class="phone"></i>
					    <div class="contact_address">
						   65-86134628
					    </div>
					    <div class="clearfix"></div>
					</div>
					<div class="address">
						<i class="mail"></i>
					    <div class="contact_email">
						  <a href="wangtian@comp.nus.edu.sg">WineXpress@gmail.com</a>
					    </div>
					    <div class="clearfix"></div>
					</div>
                                        
		        </div>
		       
		  
			</div>
			<div class="clearfix"></div>
		</div>
              <%@include file="templates/footer.jsp"%>
</body>
</html>