<%-- 
    Document   : single
    Created on : Oct 4, 2017, 12:05:56 PM
    Author     : Sameer Alam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Single Page</title>
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
						<p><i class="fa fa-volume-control-phone" aria-hidden="true"></i> +918030606244 </p>
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
							<li><a href="home.jsp" data-hover="Home">Home</a> </li>
								<li><a href="about.jsp" data-hover="About">About </a> </li>
								<li><a href="gallery.jsp"  data-hover="Gallery">Gallery</a></li>
                                                                <li><a href="buypro.jsp" data-hover="Menu">Menu </a> </li>
								
								<li><a href="contact.jsp" data-hover="Contact">Contact</a></li>
                                                                <li><a><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange"> <%= request.getSession().getAttribute("userdb") %></b></a></li>
                                                                  <li ><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
							  </ul>
							</div><!-- /.navbar-collapse -->
						</div>
			
					<div class="header-left">
						<ul>
							<li><i class="fa fa-envelope" aria-hidden="true"></i> <a href="mailto:info@example.com">sam.alam155@gmail.com</a></li>
							<li><i class="fa fa-fax" aria-hidden="true"></i> +1918700029646 </li>
						</ul>
					</div>
					<div class="clearfix"></div>	
				</div>
			</div>
			<div class="w3-agile-main-heading">
				<h2>Single Post</h2>
			</div>
		</div>
		<!-- //agileinfo-dot -->
	</div>
	<!-- //banner -->
	<!-- single -->
	<div class="single">
		<div class="container">
			<div class="agileits-single-img">
				<img src="images/6.jpg" alt="">
				
				<h4>Suspendisse ornare vitae ex nec aliquam. Nunc et massa ut purus porta euismod quis eu erat. Nam ornare faucibus elit sed tempor. Quisque iaculis odio nibh, et auctor tellus rhoncus vel.</h4>
				<div class="agileinfo-single-icons">
					<ul>
						<li><a href="#"><i class="fa fa-user" aria-hidden="true"></i> <span>Admin</span></a></li>
						<li><i class="fa fa-calendar" aria-hidden="true"></i><span>04.Nov.2015</span></li>
						<li><a href="#"><i class="fa fa-comments-o" aria-hidden="true"></i><span>20 Comments</span></a></li>
						<li><a href="#"><i class="fa fa-heart" aria-hidden="true"></i><span>300 Likes</span></a></li>
					</ul>				
				</div>
				<p>Vestibulum commodo posuere ipsum in elementum. Proin id nibh dictum, ornare purus quis, ullamcorper lectus. Nullam bibendum, dui eu ornare hendrerit, turpis odio tempor nulla, id tempus neque erat finibus risus. Nullam accumsan ipsum at nunc molestie, at pretium ipsum dignissim. Nullam lorem ligula, gravida sit amet tincidunt id, porta non turpis. Vestibulum tincidunt at lectus et egestas. Sed facilisis tempor tellus eget feugiat. Praesent ut est vel metus consequat consequat. Etiam interdum egestas posuere. Quisque at mi eget lorem malesuada ornare non non quam.</p>
			</div>
			
			<!-- comments -->
			<div class="agileits_three_comments">
				<h3>Comments</h3>
				<div class="agileits_three_comment_grid">
					<div class="agileits_tom">
						<img src="images/t2.jpg" alt=" " class="img-responsive">
					</div>
					<div class="agileits_tom_right">
						<div class="hardy">
							<h4>David Son</h4>
							<p>21 September 2017</p>
						</div>
						<div class="reply">
							<a href="#">Reply</a>
						</div>
						<div class="clearfix"> </div>
						<p class="lorem">"I have used Food Club more than 4 times now. The service is very great here in Gurgaon, starting with the customer service, I found the team really helpful and quick to reply, they give you the feeling they care about your views and experiences ordering from different restaurants. The delivery time has been spot on for me. I will certainly continue to use the app whenever I want to order food."</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="agileits_three_comment_grid agileits_three_comment_grid1">
					<div class="agileits_tom">
						<img src="images/t3.jpg" alt=" " class="img-responsive">
					</div>
					<div class="agileits_tom_right">
						<div class="hardy">
							<h4>Shane Watson</h4>
							<p>23 September 2017</p>
						</div>
						<div class="reply">
							<a href="#">Reply</a>
						</div>
						<div class="clearfix"> </div>
						<p class="lorem">"I visited Bangalore after being out of the country for a while. The city is really growing very fast and I was a bit undecided selecting a place to eat. Thanks to Food Club app, I was able to peruse the online menus of some popular restaurants. The food I ordered was delivered just at the right time. The Mobile app is great, the concept is superb and their communication is very friendly."</p>
					</div>
					<div class="clearfix"> </div>
				</div>
				<div class="agileits_three_comment_grid">
					<div class="agileits_tom">
						<img src="images/t4.jpg" alt=" " class="img-responsive">
					</div>
					<div class="agileits_tom_right">
						<div class="hardy">
							<h4>Steve Smith</h4>
							<p>24 September 2017</p>
						</div>
						<div class="reply">
							<a href="#">Reply</a>
						</div>
						<div class="clearfix"> </div>
						<p class="lorem">"I have used Food Club more than 4 times now. The service is very great here in Gurgaon, starting with the customer service, I found the team really helpful and quick to reply, they give you the feeling they care about your views and experiences ordering from different restaurants."</p>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<!-- //comments -->
			<!-- leave-comments -->
			<div class="w3_leave_comment">
				<h3>Leave your comment</h3>
				<form action="#" method="post">
					<input type="text" name="Name" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
					<input type="email" name="Email" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
					<input type="text" name="Phone" value="Phone" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone';}" required="">
					<textarea name="Message" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Message...';}" required="">Message...</textarea>
					<input type="submit" value="Send">
				</form>
			</div>
			<!-- //leave-comments -->
		</div>
	</div>
	<!-- //single -->
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