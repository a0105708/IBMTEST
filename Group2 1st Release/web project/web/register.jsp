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
	<!-- header-section-starts -->
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
	<!-- header-section-ends -->
	<div class="wrap">
            <%@include file="templates/navigator.jsp" %>
		<!-- start registration -->
		<section id="main">
	<div class="content">
		<div class="pag-nav">
			<ul class="p-list">
				<li><a href="index.jsp">Home</a></li> &nbsp;&nbsp;/&nbsp;
				<li class="act">&nbsp;Register</li>
			</ul>
		</div>
		<div class="coats">
			<h3 class="c-head">create an account</h3>
			<p>Please fill in all the following blanks, and your email will be used as your account ID.</p>
		</div>
            <script type="text/javascript">

            function checkForm(form)
            {
                if (form.first.value == "") {
                    alert("Please enter your name");
                    form.first.focus();
                    return false;
                }
                
                if (form.last.value == "") {
                    alert("Please enter your name");
                    form.last.focus();
                    return false;
                }
                if (form.email.value == "") {
                    alert("Please enter your email");
                    form.email.focus();
                    return false;
                }
                if (form.gender.value == "") {
                    alert("Please select your gender");
                    form.gender.focus();
                    return false;
                }
                if (form.password.value == "") {
                    alert("Please enter your password");
                    form.password.focus();
                    return false;
                }
                if (form.password1.value == "") {
                    alert("Please confirm your password");
                    form.password1.focus();
                    return false;
                }
                if (form.password1.value !=form.password.value ) {
                    alert("Please enter same password");
                    form.password1.focus();
                    return false;
                }
                var x = form.email.value;
                var atpos = x.indexOf("@");
                var dotpos = x.lastIndexOf(".");
                if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length) {
                    alert("Please enter a valid email address");
                    return false;
                }
                
                return true;
            }

        </script>
            <form action="register_result.jsp" method="POST" onsubmit="return checkForm(this);">
		<div class="register">
                    
			 <div class="register-top-grid">
				<h3>PERSONAL INFORMATION</h3>
				 <div>
					<span>First Name</span>
					<input type="text" name="first"> 
				 </div>
				 <div>
					<span>Last Name</span>
					<input type="text" name="last"> 
				 </div>
				 <div>
					 <span>Email Address</span>
					 <input type="text" name="email"> 
				 </div>
                                <div>
					 <span>Gender</span>
                                         <input type="radio" name="gender" value="Male"><span>Male</span>
                                         <input type="radio" name="gender" value="Female"><span>Female</span>
                                </div>
				  </div>
				  
				 </div>
				 
				 
			     <div class="register-bottom-grid">
					    <h3>LOGIN INFORMATION</h3>
						 <div>
							<span>Password</span>
							<input type="password" name="password">
						 </div>
						 <div>
							<span>Confirm Password</span>
							<input type="password" name="password1">
						 </div>
				 </div>
			
			<div class="clearfix"> </div>
			<div class="register-but">
			   
                            <input type="submit" value="Submit">
				   <div class="clearfix"> </div>
			   
			</div>
            </form>
	   </div>
	</div>
	</div>
	</div>
	    <%@include file="templates/footer.jsp" %>
</body>
</html>