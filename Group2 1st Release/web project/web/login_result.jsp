<!DOCTYPE html>
<html>
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

        <%
            try {
                wss.AccountMgt_Service service = new wss.AccountMgt_Service();
                wss.AccountMgt port = service.getAccountMgtPort();
                // TODO initialize WS operation arguments here
                String email_para = request.getParameter("email");
                String pwd_para = request.getParameter("password");
                java.lang.String email = email_para;
                java.lang.String password = pwd_para;
                // TODO process result here
                String result = "";
                if (email_para != null && !email_para.equals("")) {
                    result = port.memberLogin(email, password);
                } else {

                    wss.AdditionalFeatureWS_Service service1 = new wss.AdditionalFeatureWS_Service();
                    wss.AdditionalFeatureWS port1 = service1.getAdditionalFeatureWSPort();
                    // TODO initialize WS operation arguments here
                    java.lang.String hiddenEmail = request.getParameter("hiddenEmail");
                    java.lang.String hiddenName = request.getParameter("hiddenName");
                    java.lang.String hiddenId = request.getParameter("hiddenId");
                    // TODO process result here
                    if (hiddenEmail != null && !hiddenEmail.equals("")) {

                        result = port1.fBandGPsignin(hiddenEmail, hiddenName, hiddenId);
                    } else {
                        result = "NO";
                    }
                }

                out.println("Result = " + result);

                if (result.startsWith("YES")) {
                    response.sendRedirect("index.jsp");
                    session.setAttribute("userid", result.split(" ")[1]);
                    session.setAttribute("useremail", result.split(" ")[2]);
                } else { %>
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
                                <input type="text" name="productName" value="Search for a product, category or brand" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Search for a product, category or brand';
                                        }"/>
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
                        <%if (result.equalsIgnoreCase("wrong") || result.equalsIgnoreCase("no") || result.equalsIgnoreCase("blocked")) { %>
                        <h3>An error happens</h3>
                        <p>The email or the password is incorrect</p>
                        <a href="login.jsp">Click here to re-login</a>
                        <% } else {%>
                        <h3>An error happens</h3>
                        <p>Your account is not activated yet</p>
                        <a href="activate.jsp">Click here to activate</a>  
                        <% }
                                }

                                    //out.println("Result = "+result);
                            } catch (Exception ex) {
                                System.err.println("An error occurs" + ex);
                            }%>


                    </div>

                </div>
            </section>
        </div>

        <%@include file="templates/footer.jsp"%>



    </body>
</html>
