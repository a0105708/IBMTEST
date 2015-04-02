<%@page import="org.json.JSONObject"%>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <%@include file="templates/head.jsp" %>
    <body>
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
            <%@include file="templates/navigator.jsp" %>
            <!-- start registration -->
            <section id="main">
                <div class="content">
                    <div class="pag-nav">
                        <ul class="p-list">
                            <li><a href="index.jsp">Home</a></li> 
                            <li class="act">Change Password</li>
                        </ul>
                    </div>
                
                               <script type="text/javascript">

            function checkForm(form)
            {
          
                if (form.oldPassword.value == "") {
                    alert("Please enter your password");
                    form.oldPassword.focus();
                    return false;
                }

                if (form.newPassword.value !=form.confirmedNewPassword.value ) {
                    alert("Please enter same password");
                    form.newPassword.focus();
                    return false;
                }

                
                return true;
            }

        </script>
                    
                    <form action="changePwd_result.jsp" method="POST" onsubmit="return checkForm(this);">

                            <div class="register-top-grid">
                                <h3>Change Password</h3>
                       
                                <div class="cus_info_wrap">
						<label class="labelTop">
						Old Password:
						<span class="require">*</span>
						</label>
						<input type="password" name="oldPassword">
					</div>
                                 <div></div>                         
                                 <div></div>  
                                 <div></div>                                  
                                 <div></div>  


                                <div class="cus_info_wrap">
						<label class="labelTop">
						New Password:
						<span class="require">*</span>
						</label>
						<input type="password" name="newPassword">
					</div>
                                 <div></div>
                                  <div></div>                         
                                 <div></div>  
                                 <div></div>                                  
                           
                                 
                                <div class="cus_info_wrap">
						<label class="labelTop">
						Confirm New Password:
						<span class="require">*</span>
						</label>
						<input type="password" name="confirmedNewPassword">
					</div>

                                <div></div>
                                  <div></div>

                                <div class="clearfix"></div>
                            </div>

                        <div class="clearfix"></div>

                        <div class="register-but">

                           
                            <br></br>
                            <input type="submit" name="choice" value="Submit" >
                            <input type="submit" name="choice" value="Back" >

                            <div class="clearfix"> </div>

                        </div>
                    </form>
                </div>
        </div>

           <%@include file="templates/footer.jsp" %>
    </body>
</html>