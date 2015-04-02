
<!DOCTYPE html>
<html>
 <%@include file="templates\head.jsp" %>
    <body>   
    <%
    
	wss.AccountMgt_Service service = new wss.AccountMgt_Service();
	wss.AccountMgt port = service.getAccountMgtPort();
	 // TODO initialize WS operation arguments here
	java.lang.String email = request.getParameter("email1");
	java.lang.String newGeneratedPassword = "";
	// TODO process result here
	java.lang.String result = port.memberResetPassword(email, newGeneratedPassword);    
    %>
    
  

        
    
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
                
                <%if(result.equals("YES")){%>
                <h3>Congratulations!</h3> 
                <p>You have successfully reset password of your account. </p>
                <p>Please check your email for new password. </p>
                <p>After login, please change password to your own one for security. Thanks!</p>
                <a href="login.jsp">Click here to login now</a>
                <%}else if(result.equals("LOCKED")){%>
                <h3>Sorry!</h3> 
                <p>Your account has not been activated before. </p>
                <p>Please activate before reset password.</p>
                <a href="activate.jsp">Click here to activate your account</a>
                
                <%}else{%>
                <h3>Oops!</h3> 
                <p>The email address is incorrect. </p>
                <p>Please make sure you have entered correct information.</p>
                <a href="login.jsp">Click here to reset again</a>
                <%}%>
            </div>
        
        </div>
            </section>
        </div>
            
            <%@include file="templates/footer.jsp"%>
   </body>
</html>
