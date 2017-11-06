<%-- 
    Document   : home
    Created on : Oct 4, 2017, 12:04:40 PM
    Author     : Sameer Alam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords" content="Food Club Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap-css -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--// bootstrap-css -->
<!-- css -->
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<!--// css -->
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<!-- font -->
<link href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Great+Vibes&amp;subset=latin-ext" rel="stylesheet">
<!-- //font -->
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script> 

<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<![endif]-->
</head>
<body>
	<!-- banner -->
	<div class="banner jarallax">
		<!-- agileinfo-dot -->
		<div class="agileinfo-dot">
			<div class="w3layouts-header-top">
				<div class="w3-header-top-grids">
					<div class="w3-header-top-left">
						<p><i class="fa fa-volume-control-phone" aria-hidden="true"></i> +918130606244 </p>
					</div>
					<div class="w3-header-top-right">
						<div class="agileinfo-social-grids">
							<ul>
								<li><a href="https://www.facebook.com"><i class="fa fa-facebook"></i></a></li>
								<li><a href="https://www.twitter.com"><i class="fa fa-twitter"></i></a></li>
								<li><a href="https://www.rss.com/"><i class="fa fa-rss"></i></a></li>
								<li><a href="https://www.wikipedia.org/"><i class="fa fa-vk"></i></a></li>
							</ul>
						</div>
						<div class="w3-header-top-right-text">
							<p><i class="fa fa-home" aria-hidden="true"></i> 1st Street , New Delhi</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="head">
				<div class="head-nav-grids">
					<div class="navbar-top">
							<!-- Brand and toggle get grouped for better mobile display -->
							<div class="navbar-header">
							  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							  </button>
								 <div class="navbar-brand logo ">
									<h1><a href="home.jsp">Food <span>Club</span></a></h1>
								</div>

							</div>

							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							 <ul class="nav navbar-nav link-effect-4">
							<li class="active"><a href="home.jsp" data-hover="Home">Home</a> </li>
								<li><a href="about.jsp" data-hover="About">About </a> </li>
								<li><a href="gallery.jsp"  data-hover="Gallery">Gallery</a></li>
                                                                <li><a href="buypro.jsp" data-hover="Menu">Menu </a> </li>
								
								<li><a href="contact.jsp" data-hover="Contact">Contact</a></li>
                                                                 <li><a><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome :</b><b style="color:Orange"><%= request.getSession().getAttribute("userdb") %></b></a></li>
                                                                  <li ><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout </a></li>
     
							  </ul>
							</div><!-- /.navbar-collapse -->
						</div>
			
					<div class="header-left">
						<ul>
							<li><i class="fa fa-envelope" aria-hidden="true"></i> <a href="mailto:info@example.com">sam.alam155@gmail.com</a></li>
							<li><i class="fa fa-fax" aria-hidden="true"></i> +918700029646 </li>
						</ul>
					</div>
					<div class="clearfix"></div>	
				</div>
			</div>
			<div class="w3layouts-banner-slider">
				<div class="w3layouts-banner-top-slider">
					<div class="slider">
						<div class="callbacks_container">
							<ul class="rslides callbacks callbacks1" id="slider4">
								<li>
									<div class="agileits-banner-info">
										<h3>Food CLub <span>How can we help you today?</span></h3>
										<div class="w3-button">
											<a href="single.jsp">More</a>
										</div>
									</div>
								</li>
								<li>
									<div class="agileits-banner-info">
										<h3>Food CLub <span>Welcome in Food Club</span></h3>
										<div class="w3-button">
											<a href="single.jsp">More</a>
										</div>
									</div>
								</li>
							</ul>
						</div>
						<div class="clearfix"> </div>
						<script src="js/responsiveslides.min.js"></script>
						<script>
							// You can also use "$(window).load(function() {"
							$(function () {
							  // Slideshow 4
							  $("#slider4").responsiveSlides({
								auto: true,
								pager:true,
								nav:true,
								speed: 500,
								namespace: "callbacks",
								before: function () {
								  $('.events').append("<li>before event fired.</li>");
								},
								after: function () {
								  $('.events').append("<li>after event fired.</li>");
								}
							  });
						
							});
						 </script>
						<!--banner Slider starts Here-->
					</div>
				</div>
			</div>
		</div>
		<!-- //agileinfo-dot -->
	</div>
	<!-- //banner -->
	<!-- welcome -->
	<div class="welcome">
		<div class="container">
			<div class="agileinfo-heading">
				<h3>Welcome</h3>
			</div>
			<div class="agileits-welcome-grids">
				<div class="col-md-5 agileits-welcome-left">
					<img src="images/2.jpg" alt="" />
				</div>
				<div class="col-md-7 agileits-welcome-left">
					<h2>Food Club is all about solving the distance between your food and you.</h2>
					<div class="agile-border"> </div>
					<p>Food Club is a food ordering and delivery company based out of Delhi, India. Food CLub was inspired by the thought of providing a complete food ordering and delivery solution from the best neighbourhood restaurants to the urban foodie. A single window for ordering from a wide range of restaurants, we have our own exclusive fleet of delivery personnel to pickup orders from restaurants and deliver it to customers.<span>Having our own fleet gives us the flexibility to offer customers a no minimum order policy on any restaurant and accept online payments for all partner restaurants that we work with. Our delivery personnel carry one order at a time which ensures we get reliable and fast deliveries.</span></p>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //welcome -->
	<!-- special -->
	<div class="special">
		<div class="container">
			<div class="agileinfo-heading">
				<h3>Specialities</h3>
			</div>
			<div class="special-top-grids">
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
							<img class="img-responsive" src="images/s1.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
									<p>A samosa is a fried or baked dish with a savoury filling</p>
								</div>
								<div class="wthree-special-info">
									<h4>Samoshe</h4>
								</div>
							</div>
						</div>
					</div>					
					<div class="col-md-3 special-grids">
						<div class="special-img">
							<img class="img-responsive" src="images/s2.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
									<p>A sandwich consisting of Vegitable only</p>
								</div>
								<div class="wthree-special-info">
									<h4>Burger</h4>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 special-grids">
						<div class="special-img">
							<img class="img-responsive" src="images/s3.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
									<p>Breakfast is the first meal of a day</p>
								</div>
								<div class="wthree-special-info">
									<h4>BreakFast</h4>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 special-grids">
						<div class="special-img">
							<img class="img-responsive" src="images/s4.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
									<p>A snack is a portion of food, smaller than a regular meal</p>
								</div>
								<div class="wthree-special-info">
									<h4>Snacks</h4>
								</div>
							</div>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="w3-agile-special">
					<div class="col-md-3 special-grids">
						<div class="special-img">
							<img class="img-responsive" src="images/s5.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
									<p>Lunch is commonly the second meal of the day, after breakfast</p>
								</div>
								<div class="wthree-special-info">
									<h4>Lunch</h4>
								</div>
							</div>
						</div>
					</div>					
					<div class="col-md-3 special-grids">
						<div class="special-img">
							<img class="img-responsive" src="images/s4.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
									<p>It may mean a meal of any size eaten at any time of the day</p>
								</div>
								<div class="wthree-special-info">
									<h4>Dinner</h4>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 special-grids">
						<div class="special-img">
							<img class="img-responsive" src="images/s1.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
									<p>A snack is a portion of food, smaller than a regular meal</p>
								</div>
								<div class="wthree-special-info">
									<h4>Snacks</h4>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-3 special-grids">
						<div class="special-img">
							<img class="img-responsive" src="images/s2.jpg" alt="">
							<div class="captn">
								<div class="captn-top">
									<p>We know you're going to want to throw back</p>
								</div>
								<div class="wthree-special-info">
									<h4>Junk Food</h4>
								</div>
							</div>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	</div>
	<!-- //special -->
	<!-- history -->
	<div class="history jarallax">
		<div class="history-dot">
			<div class="container">
				<div class="agileinfo-history-grids">
					<div class="slider">
						<div class="callbacks_container">
							<ul class="rslides" id="slider3">
								<li>
									<div class="wthree-history-info">
                                                                            <h4>Food CLub</h4>
										<p>At Food CLub, we're building an on-demand food delivery startup that is delighting many customers across India with time-guaranteed deliveries and an obsession with keeping customer service levels ridiculously high. We are changing the course of online food delivery in the country, one city at a time.</p>
										<a href="about.jsp">Read More</a>
									</div>
								</li>
								<li>
									<div class="wthree-history-info">
										<h4>Food Club</h4>
										<p>Food Club offers you an exciting and challenging environment in which you can grow and thrive. We are offering you roles in which you will be fundamentally impacting the success of the company.</p>
										<a href="about.jsp">Read More</a>
									</div>
								</li>
								<li>
									<div class="wthree-history-info">
										<h4>Food Club</h4>
										<p>At Food CLub, we are looking for people who are concerned about the customer at all times. Customer centricity is a key tenet of all our processes.</p>
										<a href="about.jsp">Read More</a>
									</div>
								</li>
							</ul>
						</div>
					</div>
					<script>
									// You can also use "$(window).load(function() {"
									$(function () {
									  // Slideshow 4
									  $("#slider3").responsiveSlides({
										auto: true,
										pager:false,
										nav:false,
										speed: 500,
										namespace: "callbacks",
										before: function () {
										  $('.events').append("<li>before event fired.</li>");
										},
										after: function () {
										  $('.events').append("<li>after event fired.</li>");
										}
									  });
								
									});
								 </script>
								<!--banner Slider starts Here-->
				</div>
			</div>
		</div>
	</div>
	<!-- //history -->
	<!-- subscribe -->
	<div class="wthree-subscribe">
		<div class="container">
			<div class="agileinfo-heading">
				<h3>Newsletter</h3>
			</div>
			<div class="w3-agileits-subscribe-form">
				<form action="#" method="post">
					<input type="text" placeholder="Subscribe" name="Subscribe" required="">
					<button class="btn1">Subscribe</button>
				</form>
			</div>
		</div>
	</div>
	<!-- //subscribe -->
	<!-- footer -->
	<div class="w3-agile-footer">
		<div class="container">
			<div class="footer-grids">
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h3><a href="home.jsp">Food <span>Club</span></a></h3>
					</div>
					<div class="agile-footer-info">
						<p>We work hard to keep Food Club secure, and make every effort to keep on top of the latest threats by working with our inhouse security team. If you think we've made a security mistake or have a vulnerability, please share with us right away.</p>
					</div>
					<div class="social">
						<ul>
							<li><a href="https://www.facebook.com"><i class="fa fa-facebook"></i></a></li>
								<li><a href="https://www.twitter.com"><i class="fa fa-twitter"></i></a></li>
								<li><a href="https://www.rss.com/"><i class="fa fa-rss"></i></a></li>
								<li><a href="https://www.wikipedia.org/"><i class="fa fa-vk"></i></a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Address</h4>
					</div>
					<div class="footer-grid-info">
						<p>Food Club
							<span>South Extension Part-2, New Delhi-110074.</span>
						</p>
						<p class="phone">Phone : +918130606244
							<span>Email : <a href="mailto:example@email.com">sam.alam155@gmail.com</a></span>
							<span>FAX : 123 456 7890</span>
						</p>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Navigation</h4>
					</div>
					<div class="footer-grid-info">
						<ul>
							<li><a href="home.jsp">Home</a></li>
							<li><a href="about.jsp">About</a></li>
							<li><a href="gallery.jsp">Gallery</a></li>
							<li><a href="icons.jsp">Icons</a></li>
                                                        <li><a href="buypro.jsp">Menu </a> </li>
							<li><a href="codes.jsp">Short Codes</a></li>
							<li><a href="contact.jsp">Contact</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-3 footer-grid">
					<div class="footer-grid-heading">
						<h4>Twitter Posts</h4>
					</div>
					<div class="agile-footer-grid">
						<ul class="w3agile_footer_grid_list">
							<li>Ut aut reiciendis voluptatibus maiores <a href="#">http://example.com</a> alias, ut aut reiciendis.
								<span><i class="fa fa-twitter" aria-hidden="true"></i> 02 days ago</span></li>
							<li>Itaque earum rerum hic tenetur a sapiente delectus <a href="#">http://example.com</a><span><i class="fa fa-twitter" aria-hidden="true"></i> 03 days ago</span></li>
						</ul>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<div class="agileits-w3layouts-copyright">
				<p>© 2017 Food Club . All Rights Reserved | Design by <a href="http://w3layouts.com/"> Sameer Alam </a> </p>
			</div>
		</div>
	</div>
	<!-- //footer -->
	<script src="js/jarallax.js"></script>
	<script src="js/SmoothScroll.min.js"></script>
	<script type="text/javascript">
		/* init Jarallax */
		$('.jarallax').jarallax({
			speed: 0.5,
			imgWidth: 1366,
			imgHeight: 768
		})
	</script>
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
	<!-- //here ends scrolling icon -->
</body>	
</html>