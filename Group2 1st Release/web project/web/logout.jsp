<%-- 
    Document   : logout
    Created on : Mar 9, 2015, 4:54:24 PM
    Author     : chenliyuquan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <meta http-equiv="Refresh" content="5;url=index.jsp">
   <% 
      if(session.getAttribute("userid")!=null){
       session.setAttribute("userid", null);
       session.setAttribute("useremail", null);
      }
       %>
   
    <%@include file="templates\head.jsp" %>
    <head>
        <script src="https://apis.google.com/js/platform.js" async defer></script>
        <meta name="google-signin-client_id" content="500733989831-6gtnolups4ah7q10cirg4q1gs0u384pl.apps.googleusercontent.com">
        <script src="https://apis.google.com/js/client:platform.js?onload=render" async defer></script>
        <script src="https://apis.google.com/js/api:client.js"></script>
        <script>
            auth2 = gapi.auth2.init();
            function all_logout() {

                FB.logout(function(response) {
                    // user is now logged out
                });


                auth2.signOut().then(function() {
                    console.log('User signed out.');
                });

            }
        </script>
     </head>
    
    <body>
     <script>
            all_logout();
        </script>    
        <div class="header">
            <div class="top-header">
			<div class="wrap">
                            
				<div class="header-right">
					<ul>
						<li>
							<i class="user"></i>
							
                                                        <a href="login.jsp">Login</a>
                                                     
						</li>
                                                
                                                
                                                
						<li class="login">
							<i class="lock"></i>
							
							<a href="register.jsp">Sign up</a>
                                                       
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
        <div class="wrap">

            <%@include file="templates\navigator.jsp" %> 
            <section id="main" style="height: 300px">
        <div class="content">
            <div class="col-md-12 help text-center">
                
                <h3>See You Soon</h3>
                <p>You have successfully logged out. Thanks for your shopping!</p>
                <p>You will be redirected to our home page in 5 seconds.</p>
                <a href="login.jsp">Click here to login</a>
           
                
                
            </div>

        </div>
            </section>
        </div>
            
           <%@include file="templates/footer.jsp"%> 
           
    </body>
</html>


      
</html>
