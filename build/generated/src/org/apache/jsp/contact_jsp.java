package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Contact Page</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"keywords\" content=\"Food Club Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- bootstrap-css -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!--// bootstrap-css -->\n");
      out.write("<!-- css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!--// css -->\n");
      out.write("<!-- font-awesome icons -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("<!-- //font-awesome icons -->\n");
      out.write("<!-- font -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Great+Vibes&amp;subset=latin-ext\" rel=\"stylesheet\">\n");
      out.write("<!-- //font -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script> \n");
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("  <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!-- banner -->\n");
      out.write("\t<div class=\"banner jarallax\">\n");
      out.write("\t\t<!-- agileinfo-dot -->\n");
      out.write("\t\t<div class=\"agileinfo-dot\">\n");
      out.write("\t\t\t<div class=\"w3layouts-header-top\">\n");
      out.write("\t\t\t\t<div class=\"w3-header-top-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"w3-header-top-left\">\n");
      out.write("\t\t\t\t\t\t<p><i class=\"fa fa-volume-control-phone\" aria-hidden=\"true\"></i> +918130606244</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"w3-header-top-right\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agileinfo-social-grids\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.facebook.com\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.twitter.com\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.rss.com/\"><i class=\"fa fa-rss\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.wikipedia.org/\"><i class=\"fa fa-vk\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"w3-header-top-right-text\">\n");
      out.write("\t\t\t\t\t\t\t<p><i class=\"fa fa-home\" aria-hidden=\"true\"></i> 1st Street , New Delhi</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t<div class=\"head-nav-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar-top\">\n");
      out.write("\t\t\t\t\t\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t\t  <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t  </button>\n");
      out.write("\t\t\t\t\t\t\t\t <div class=\"navbar-brand logo \">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1><a href=\"home.jsp\">Food <span>Club</span></a></h1>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t <ul class=\"nav navbar-nav link-effect-4\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"home.jsp\" data-hover=\"Home\">Home</a> </li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"about.jsp\" data-hover=\"About\">About </a> </li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"gallery.jsp\"  data-hover=\"Gallery\">Gallery</a></li>\n");
      out.write("                                                                <li><a href=\"buypro.jsp\" data-hover=\"Menu\">Menu </a> </li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\"><a href=\"contact.jsp\" data-hover=\"Contact\">Contact</a></li>\n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t\t\t\t</div><!-- /.navbar-collapse -->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"header-left\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i> <a href=\"mailto:info@example.com\">sam.alam155@gmail.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><i class=\"fa fa-fax\" aria-hidden=\"true\"></i> +918700029646 </li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3-agile-main-heading\">\n");
      out.write("\t\t\t\t<h2>Contact Us</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- //agileinfo-dot -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //banner -->\n");
      out.write("\t<!-- contact -->\n");
      out.write("\t<div class=\"contact-content\">\n");
      out.write("\t\t<div class=\"container\">\t\n");
      out.write("\t\t\t<div class=\"map\">\n");
      out.write("\t\t\t\t<iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d158858.18237072596!2d-0.10159865000003898!3d51.52864165000001!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1436514341845\" allowfullscreen=\"\"></iframe>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"contact-form\">\n");
      out.write("\t\t\t\t<h3>Contact form</h3>\n");
      out.write("\t\t\t\t<form action=\"ContactUs\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"name\" placeholder=\"Name\" required=\"\">\n");
      out.write("                                        <input type=\"text\" name=\"contact\" placeholder=\"Contact\" required=\"\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"email\" placeholder=\"Email\" required=\"\">\n");
      out.write("\t\t\t\t\t<textarea name=\"message\" placeholder=\"Message\" required=\"\"></textarea>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"SEND\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"contact-grids\">\n");
      out.write("\t\t\t\t<h3 class=\"map\">Our Branches</h3>\n");
      out.write("\t\t\t\t<div class=\"address-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 address-text\">\n");
      out.write("\t\t\t\t\t\t<div class=\"address-grid\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Food Club, \n");
      out.write("\t\t\t\t\t\t\t\t<span>South Extension Part-2,New Delhi</span>\n");
      out.write("\t\t\t\t\t\t\t</h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Freephone :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+918130606244</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Telephone :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+918700029646</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>FAX :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+917539126048</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"e-mail\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>E-mail : <a href=\"mailto:example@email.com\">sam.alam155@gmail.com</a></p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 address-text\">\n");
      out.write("\t\t\t\t\t\t<div class=\"address-grid\">\n");
      out.write("\t\t\t\t\t\t\t<h5>D-42 Chattarpur, \n");
      out.write("\t\t\t\t\t\t\t\t<span>Chattarpur Enclave,New Delhi</span>\n");
      out.write("\t\t\t\t\t\t\t</h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Freephone :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+919874563210</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Telephone :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+919632587014</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>FAX :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+917894560123</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"e-mail\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>E-mail : <a href=\"mailto:example@email.com\">sameer058@yahoo.com</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 address-text\">\n");
      out.write("\t\t\t\t\t\t<div class=\"address-grid\">\n");
      out.write("\t\t\t\t\t\t\t<h5>B-109 Lado Srai, \n");
      out.write("\t\t\t\t\t\t\t\t<span>Gumbaj Park,New Delhi-110074</span>\n");
      out.write("\t\t\t\t\t\t\t</h5>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Freephone :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+919874567890</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Telephone :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+91978456 7890</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"address-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>FAX :</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"address-info-left address-info-right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>+917412589603</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"e-mail\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>E-mail : <a href=\"mailto:example@email.com\">sameer123@gmail.com</a></p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div> \t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //contact -->\n");
      out.write("\t<!-- footer -->\n");
      out.write("\t<div class=\"w3-agile-footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-grid-heading\">\n");
      out.write("\t\t\t\t\t\t<h3><a href=\"home.jsp\">Food <span>Club</span></a></h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"agile-footer-info\">\n");
      out.write("\t\t\t\t\t\t<p>We work hard to keep Food Club secure, and make every effort to keep on top of the latest threats by working with our inhouse security team. If you think we've made a security mistake or have a vulnerability, please share with us right away.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"social\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://www.facebook.com\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.twitter.com\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.rss.com/\"><i class=\"fa fa-rss\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"https://www.wikipedia.org/\"><i class=\"fa fa-vk\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-grid-heading\">\n");
      out.write("\t\t\t\t\t\t<h4>Address</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grid-info\">\n");
      out.write("\t\t\t\t\t\t<p>Food Club\n");
      out.write("                                                    <span>South Extension Part-2,New Delhi</span>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"phone\">Phone : +918130606244\n");
      out.write("\t\t\t\t\t\t\t<span>Email : <a href=\"mailto:example@email.com\">sam.alam155@gmail.com</a></span>\n");
      out.write("\t\t\t\t\t\t\t<span>FAX : 123 456 7890</span>\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-grid-heading\">\n");
      out.write("\t\t\t\t\t\t<h4>Navigation</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footer-grid-info\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"about.jsp\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"gallery.jsp\">Gallery</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"icons.jsp\">Icons</a></li>\n");
      out.write("                                                        <li><a href=\"buypro.jsp\">Menu </a> </li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"codes.jsp\">Short Codes</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"footer-grid-heading\">\n");
      out.write("\t\t\t\t\t\t<h4>Twitter Posts</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"agile-footer-grid\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"w3agile_footer_grid_list\">\n");
      out.write("\t\t\t\t\t\t\t<li>Ut aut reiciendis voluptatibus maiores <a href=\"#\">http://example.com</a> alias, ut aut reiciendis.\n");
      out.write("\t\t\t\t\t\t\t\t<span><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i> 02 days ago</span></li>\n");
      out.write("\t\t\t\t\t\t\t<li>Itaque earum rerum hic tenetur a sapiente delectus <a href=\"#\">http://example.com</a><span><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i> 03 days ago</span></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"agileits-w3layouts-copyright\">\n");
      out.write("\t\t\t\t<p>© 2017 Food Club . All Rights Reserved | Design by <a href=\"http://w3layouts.com/\"> Sameer Alam </a> </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- //footer -->\n");
      out.write("\t<script src=\"js/jarallax.js\"></script>\n");
      out.write("\t<script src=\"js/SmoothScroll.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t/* init Jarallax */\n");
      out.write("\t\t$('.jarallax').jarallax({\n");
      out.write("\t\t\tspeed: 0.5,\n");
      out.write("\t\t\timgWidth: 1366,\n");
      out.write("\t\t\timgHeight: 768\n");
      out.write("\t\t})\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t<!-- here stars scrolling icon -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //here ends scrolling icon -->\n");
      out.write("</body>\t\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}