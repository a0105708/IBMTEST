<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <head>
        <title>WineXpress, professional wine provider</title>
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!-- Custom Theme files -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="BOX SHOP Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--webfont-->
        <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <!-- start menu -->
        <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
        <script type="text/javascript" src="js/megamenu.js"></script>
        <script>$(document).ready(function () {
                $(".megamenu").megamenu();
            });</script>
        <link rel="stylesheet" href="css/etalage.css">
        <script src="js/jquery.etalage.min.js"></script>
        <script>
            jQuery(document).ready(function ($) {

                $('#etalage').etalage({
                    thumb_image_width: 300,
                    thumb_image_height: 400,
                    source_image_width: 800,
                    source_image_height: 1000,
                    show_hint: true,
                    click_callback: function (image_anchor, instance_id) {
                        alert('Callback example:\nYou clicked on an image with the anchor: "' + image_anchor + '"\n(in Etalage instance: "' + instance_id + '")');
                    }
                });

            });
        </script>
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
        <script type="text/javascript">
            $(window).load(function () {
                $("#flexiselDemo").flexisel({
                    visibleItems: 4,
                    animationSpeed: 1000,
                    autoPlay: true,
                    autoPlaySpeed: 3000,
                    pauseOnHover: true,
                    enableResponsiveBreakpoints: true,
                    responsiveBreakpoints: {
                        portrait: {
                            changePoint: 480,
                            visibleItems: 1
                        },
                        landscape: {
                            changePoint: 640,
                            visibleItems: 2
                        },
                        tablet: {
                            changePoint: 768,
                            visibleItems: 3
                        }
                    }
                });

            });
        </script>
        <script type="text/javascript" src="js/jquery.flexisel.js"></script>
        <script src="https://apis.google.com/js/platform.js" async defer></script>
    </head>
    <body>
        <div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&appId=774442855996134&version=v2.3";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>
        <!-- header-section-starts -->
        <div class="header">
            <div class="top-header">
                <div class="wrap">

                    <div class="header-right">
                        <ul>
                            <li>
                                <i class="user"></i>
                                <%if (session.getAttribute("userid") != null) { %>
                                <a href="viewAccount.jsp"><%out.print(session.getAttribute("useremail"));%></a>
                                <%} else { %>
                                <a href="login.jsp">Login</a>
                                <% } %>
                            </li>

                            <%if (session.getAttribute("userid") != null) { %>
                            <li>
                                <i class="cart"></i>
                                <a href="order.jsp">My Orders</a>
                            </li>

                            <%}%>

                            <li class="login">
                                <i class="lock"></i>
                                <%if (session.getAttribute("userid") != null) { %>
                                <a href="logout.jsp">Logout</a>
                                <%} else { %>               
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
        <!-- header-section-ends -->
        <div class="wrap">
            <%@include  file="templates\navigator.jsp" %>
            <!-- start main -->
            <div class="main_bg">
                <div class="main">	   		           	         
                    <!-- start span1_of_1 -->
                    <div class="left_content">
                        <div class="span_1_of_left">
                            <div class="grid images_3_of_2">

                                <% String itemST = request.getParameter("id");
                                    if (Long.valueOf(itemST) % 2 == 0) {%>
                                <ul id="etalage">
                                    <li>
                                        <a href="optionallink.jsp">
                                            <img class="etalage_thumb_image" src="images/d1.jpg" class="img-responsive" />
                                            <img class="etalage_source_image" src="images/d1.jpg" class="img-responsive" title="" />
                                        </a>
                                    </li>
                                    <li>
                                        <img class="etalage_thumb_image" src="images/d2.jpg" class="img-responsive" />
                                        <img class="etalage_source_image" src="images/d2.jpg" class="img-responsive" title="" />
                                    </li>
                                    <li>
                                        <img class="etalage_thumb_image" src="images/d3.jpg" class="img-responsive"  />
                                        <img class="etalage_source_image" src="images/d3.jpg"class="img-responsive"  />
                                    </li>
                                    <li>
                                        <img class="etalage_thumb_image" src="images/d4.jpg" class="img-responsive"  />
                                        <img class="etalage_source_image" src="images/d4.jpg"class="img-responsive"  />
                                    </li>
                                </ul>
                                <%} else {%>
                                <ul id="etalage">
                                    <li>
                                        <a href="optionallink.jsp">
                                            <img class="etalage_thumb_image" src="images/d5.jpg" class="img-responsive" />
                                            <img class="etalage_source_image" src="images/d5.jpg" class="img-responsive" title="" />
                                        </a>
                                    </li>
                                    <li>
                                        <img class="etalage_thumb_image" src="images/d6.jpg" class="img-responsive" />
                                        <img class="etalage_source_image" src="images/d6.jpg" class="img-responsive" title="" />
                                    </li>
                                    <li>
                                        <img class="etalage_thumb_image" src="images/d7.jpg" class="img-responsive"  />
                                        <img class="etalage_source_image" src="images/d7.jpg"class="img-responsive"  />
                                    </li>
                                    <li>
                                        <img class="etalage_thumb_image" src="images/d8.jpg" class="img-responsive"  />
                                        <img class="etalage_source_image" src="images/d8.jpg"class="img-responsive"  />
                                    </li>
                                </ul>
                                <%} %>


                                <div class="clearfix"></div>		
                            </div>

                            <!-- start span1_of_1 -->
                            <div class="span1_of_1_des">
                                <div class="desc1">
                                    <%
                                        wss.ProductMgtWS_Service service = new wss.ProductMgtWS_Service();
                                        wss.ProductMgtWS port = service.getProductMgtWSPort();

                                        wss.CatelogueMgtWS_Service service2 = new wss.CatelogueMgtWS_Service();
                                        wss.CatelogueMgtWS port2 = service2.getCatelogueMgtWSPort();
                                        // TODO initialize WS operation arguments here
                                        java.lang.String itemId_str = request.getParameter("id");
                                        // TODO process result here
                                        wss.ItemEntity item = port2.getItemById(itemId_str);

                                    %>
                                    <h3><% out.print(item.getItemName()); %></h3>
                                    <p>100% Authentic,  Free Returns, Free Shipping for Order Over $200. For enquiry, please contact us.  </p>

                                    <div class="available">
                                        <h4>Wine Specifications:</h4>
                                        <ul>
                                            <li>Winery: <%out.print(item.getWinery().getWineryName());%>
                                            </li>
                                            <li>Region: <%out.print(item.getRegion().getCountry());%>

                                            </li>
                                            <li>Category:<%out.print(item.getCategory().getCategoryName());%>

                                            </li>
                                        </ul>
                                        <div class="btn_form">
                                            <form action="order.jsp">
                                                <input type="submit" value="add to cart" title="" />
                                            </form>
                                        </div>
                                            <div class="g-plusone" data-size="tall" data-annotation="inline" data-width="400" data-href="http://127.0.0.1:8080/web%20project/single.jsp?id=1"></div>
                                            <div class="fb-like" data-href="http://127.0.0.1:8080/web%20project/single.jsp?id=1" data-layout="standard" data-action="like" data-show-faces="true" data-share="true" data-width="400"></div>
                                    </div>
                                    <div class="filter-by-color">
                                        <h3>Rating this product:</h3>
                                        <ul class="w_nav2">                          
                                            <form method="post" action="singleAfterRating.jsp?id=<%out.print(request.getParameter("id"));%>">
                                                <p class="comment-form-author"><label for="author">Rating:</label>
                                                    <select name="mark">
                                                        <option>1</option>
                                                        <option>2</option>
                                                        <option>3</option>
                                                        <option>4</option>
                                                        <option>5</option>
                                                    </select>
                                                </p>

                                                <p class="comment-form-author"><label for="author">Comment:</label>
                                                    <textarea name="content" value="Enter your comment here..." cols="50" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                                this.value = 'Message';
                                                            }">Enter your comment here...</textarea>
                                                </p>
                                                <input name="submit" type="submit" id="submit" value="Submit">
                                            </form>                             
                                        </ul>
                                    </div>

                                </div>
                            </div>
                            <div class="clearfix"></div>
                        </div>
                        <div class="device">
                            <div class="course_demo">
                                <table BORDER="1" CELLPADDING="5" CELLSPACING="5" class="flatTable">
                                    <thead>
                                        <tr class="headingTr">
                                            <th>
                                                Contents
                                            </th>
                                            <th>
                                                Marks
                                            </th>
                                        </tr>
                                    </thead>                                  
                                    <tbody>
                                        <%-- start web service invocation --%> 
                                        <%

                                            // TODO initialize WS operation arguments here
                                            String itemIdST = request.getParameter("id");
                                            java.lang.Long itemId = Long.valueOf(itemIdST);
                                            // TODO process result here
                                            java.util.List<wss.CommentEntity> result = port.viewAllCommentsOfProduct(itemId);
                                            if (result.size() == 0) {
                                                out.println("<tr>Sorry, no comments so far..</tr>");
                                                out.println("<h5>Overall Rating: 0.0</h5>");
                                            }

                                            java.lang.String content;
                                            java.lang.Double mark;
                                            java.lang.Double average = 0.0;

                                            for (Object o : result) {
                                                mark = ((wss.CommentEntity) o).getRating();
                                                content = ((wss.CommentEntity) o).getContents();
                                                average += mark;%>
                                        <tr>
                                            <td><%=content%></td>
                                            <td><%=mark%></td> 
                                        </tr>
                                        <%}
                                            out.println("<h5>Rating: </h5>" + String.format("%.2f", average / result.size()));

                                        %>
                                        <%-- end web service invocation --%> 

                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="device">
                            <div class="course_demo">
                                <ul id="flexiselDemo">	
                                    <li>
                                        <div class="ipad text-center">
                                            <img src="images/phone.jpg" alt="" />
                                            <h4>Wine</h4>
                                            <h3>$49</h3>
                                            <ul>
                                                <li><i class="cart-1"></i></li>
                                                <li><a class="cart" href="#">Add To Cart</a></li>
                                            </ul>
                                            <div class="clearfix"></div>
                                            <ul>
                                                <li><i class="heart"></i></li>
                                                <li><a class="cart" href="#">Add To Wishlist</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="ipad text-center">
                                            <img src="images/phone1.jpg" alt="" />
                                            <h4>Wine</h4>
                                            <h3>$29</h3>
                                            <ul>
                                                <li><i class="cart-1"></i></li>
                                                <li><a class="cart" href="#">Add To Cart</a></li>
                                            </ul>
                                            <div class="clearfix"></div>
                                            <ul>
                                                <li><i class="heart"></i></li>
                                                <li><a class="cart" href="#">Add To Wishlist</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="ipad text-center">
                                            <img src="images/phone2.jpg" alt="" />
                                            <h4>Wine</h4>
                                            <h3>$19</h3>
                                            <ul>
                                                <li><i class="cart-1"></i></li>
                                                <li><a class="cart" href="#">Add To Cart</a></li>
                                            </ul>
                                            <div class="clearfix"></div>
                                            <ul>
                                                <li><i class="heart"></i></li>
                                                <li><a class="cart" href="#">Add To Wishlist</a></li>
                                            </ul>
                                        </div>
                                    </li>	
                                    <li>
                                        <div class="ipad text-center">
                                            <img src="images/phone3.jpg" alt="" />
                                            <h4>Wine</h4>
                                            <h3>$89</h3>
                                            <ul>
                                                <li><i class="cart-1"></i></li>
                                                <li><a class="cart" href="#">Add To Cart</a></li>
                                            </ul>
                                            <div class="clearfix"></div>
                                            <ul>
                                                <li><i class="heart"></i></li>
                                                <li><a class="cart" href="#">Add To Wishlist</a></li>
                                            </ul>
                                        </div>
                                    </li>	
                                    <li>
                                        <div class="ipad text-center">
                                            <img src="images/phone4.jpg" alt="" />
                                            <h4>Wine</h4>
                                            <h3>$199</h3>
                                            <ul>
                                                <li><i class="cart-1"></i></li>
                                                <li><a class="cart" href="#">Add To Cart</a></li>
                                            </ul>
                                            <div class="clearfix"></div>
                                            <ul>
                                                <li><i class="heart"></i></li>
                                                <li><a class="cart" href="#">Add To Wishlist</a></li>
                                            </ul>
                                        </div>
                                    </li>							    	  	       	   	  									    	  	       	   	    	
                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="sub-cate single-subcate">
                        <div class=" top-nav rsidebar span_1_of_left">
                            <h3 class="cate">CATEGORIES</h3>
                            <ul class="menu">
                                <li class="item1"><a href="#">Reds<img class="arrow-img img-left-arrow" src="images/arrow1.png" alt=""/> </a>
                                    <ul class="cute">
                                        <li class="subitem1"><a href="products.jsp">Cute Kittens </a></li>
                                        <li class="subitem2"><a href="products.jsp">Strange Stuff </a></li>
                                        <li class="subitem3"><a href="products.jsp">Automatic Fails </a></li>
                                    </ul>
                                </li>
                                <li class="item2"><a href="#">Rose <img class="arrow-img img-left-arrow " src="images/arrow1.png" alt=""/></a>
                                    <ul class="cute">
                                        <li class="subitem1"><a href="products.jsp">Cute Kittens </a></li>
                                        <li class="subitem2"><a href="products.jsp">Strange Stuff </a></li>
                                        <li class="subitem3"><a href="products.jsp">Automatic Fails </a></li>
                                    </ul>
                                </li>
                                <li class="item3"><a href="#">Whites </a>
                                    <ul class="cute">
                                        <li class="subitem1"><a href="products.jsp">Cute Kittens </a></li>
                                        <li class="subitem2"><a href="products.jsp">Strange Stuff </a></li>
                                        <li class="subitem3"><a href="products.jsp">Automatic Fails</a></li>
                                    </ul>
                                </li>
                                <li class="item4"><a href="#">Sparkling</a>
                                    <ul class="cute">
                                        <li class="subitem1"><a href="products.jsp">Cute Kittens </a></li>
                                        <li class="subitem2"><a href="products.jsp">Strange Stuff </a></li>
                                        <li class="subitem3"><a href="products.jsp">Automatic Fails </a></li>
                                    </ul>
                                </li>
                                <li>
                                    <ul class="kid-menu">
                                        <li><a href="products.jsp">Ports</a></li>
                                        <li ><a href="product.jsp">Spirits</a></li>
                                        <li ><a href="product.jsp">Dessert</a></li>
                                    </ul>
                                </li>
                                <ul class="kid-menu ">
                                    <li><a href="products.jsp">Maderia</a></li>
                                    <li ><a href="products.jsp">Sake</a></li>
                                    <li><a href="products.jsp">Sherries</a></li>
                                    <li><a href="products.jsp">White Blend</a></li>
                                    <li ><a href="products.jsp">Red Blend</a></li>

                                    <li class="menu-kid-left"><a href="contact.jsp">Contact us</a></li>
                                </ul>
                            </ul>
                        </div>
                        <!--initiate accordion-->
                        <script type="text/javascript">
                            $(function () {
                                var menu_ul = $('.menu > li > ul'),
                                        menu_a = $('.menu > li > a');
                                menu_ul.hide();
                                menu_a.click(function (e) {
                                    e.preventDefault();
                                    if (!$(this).hasClass('active')) {
                                        menu_a.removeClass('active');
                                        menu_ul.filter(':visible').slideUp('normal');
                                        $(this).addClass('active').next().stop(true, true).slideDown('normal');
                                    } else {
                                        $(this).removeClass('active');
                                        $(this).next().stop(true, true).slideUp('normal');
                                    }
                                });

                            });
                        </script>
                        <div class=" chain-grid menu-chain text-center">
                            <a href="products.jsp"><img class="img-responsive chain" src="images/phonei.jpg" alt=" " /></a>	   		     		
                            <div class="grid-chain-bottom chain-watch">
                                <span class="actual dolor-left-grid">$159</span>
                                <span class="reducedfrom">$199</span>  
                                <h6>Light Grape White Blend </h6>  		     			   		     										
                            </div>
                        </div>
                        <a class="view-all all-product" href="products.jsp">VIEW ALL PRODUCTS<span> </span></a> 	
                        <div class="clearfix"> </div>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>	
        <%@include file="templates/footer.jsp"%>
    </body>
</html>