package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class biryani_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en-US\">\n");
      out.write("<head>\n");
      out.write("<title>Food Club</title>\n");
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
      out.write("<link href=\"css/lsb.css\" rel=\"stylesheet\" type=\"text/css\">\n");
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
      out.write("\t\t\t\t\t\t<p><i class=\"fa fa-volume-control-phone\" aria-hidden=\"true\"></i> +918130606244 </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"w3-header-top-right\">\n");
      out.write("\t\t\t\t\t\t<div class=\"agileinfo-social-grids\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-rss\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-vk\"></i></a></li>\n");
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
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"codes.jsp\" class=\"dropdown-toggle\" data-hover=\"Pages\" data-toggle=\"dropdown\">Pages <b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"icons.jsp\">Icons</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"codes.jsp\">Short Codes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t  </li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.jsp\" data-hover=\"Contact\">Contact</a></li>\n");
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
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("<!--navigation section end -->\n");
      out.write("</body>\n");
      out.write("<body>\n");
      out.write("<div class=\"container nano_head\"> <!-- main contain of car-->\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-5\" >\n");
      out.write("        <div class=\"panel-heading\"><b>Biryani</b></div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"images/chicken-biryani.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-7\">\n");
      out.write("        <h3><b>Biryani</b></h3>\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_half.png\" />\n");
      out.write("\t\t<img src=\"images/rating_empty.png\" />\n");
      out.write("\t\t\n");
      out.write("\t<hr>\n");
      out.write("\t\t <p><b>Chicken Biryani</b>\n");
      out.write("\t\t<h4 style=\"color:#F08080\"><img src=\"images/ic_pink.png\" /><b>499 </b> </h4>\n");
      out.write("               <br>\t\t\n");
      out.write("<p><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" class=\"btn btn-success glyphicon glyphicon-hand-right\"> BUY NOW</a>\n");
      out.write("\n");
      out.write("</p></div><br>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div class=\"container nano_head\"> <!-- main contain of car-->\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-5\" >\n");
      out.write("        <div class=\"panel-heading\"><b>Biryani</b></div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"images/chicken-biryani.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-7\">\n");
      out.write("        <h3><b>Biryani</b></h3>\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_half.png\" />\n");
      out.write("\t\t<img src=\"images/rating_empty.png\" />\n");
      out.write("\t\t\n");
      out.write("\t<hr>\n");
      out.write("\t\t <p><b>Chicken Biryani</b>\n");
      out.write("\t\t<h4 style=\"color:#F08080\"><img src=\"images/ic_pink.png\" /><b>499 </b> </h4>\n");
      out.write("               <br>\t\t\n");
      out.write("<p><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" class=\"btn btn-success glyphicon glyphicon-hand-right\"> BUY NOW</a>\n");
      out.write("\n");
      out.write("</p></div><br>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container nano_head\"> <!-- main contain of car-->\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-5\" >\n");
      out.write("        <div class=\"panel-heading\"><b>Biryani</b></div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"images/chicken-biryani.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-7\">\n");
      out.write("        <h3><b>Biryani</b></h3>\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_half.png\" />\n");
      out.write("\t\t<img src=\"images/rating_empty.png\" />\n");
      out.write("\t\t\n");
      out.write("\t<hr>\n");
      out.write("\t\t <p><b>Chicken Biryani</b>\n");
      out.write("\t\t<h4 style=\"color:#F08080\"><img src=\"images/ic_pink.png\" /><b>499 </b> </h4>\n");
      out.write("               <br>\t\t\n");
      out.write("<p><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" class=\"btn btn-success glyphicon glyphicon-hand-right\"> BUY NOW</a>\n");
      out.write("\n");
      out.write("</p></div><br>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    <div class=\"container nano_head\"> <!-- main contain of car-->\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-5\" >\n");
      out.write("        <div class=\"panel-heading\"><b>Biryani</b></div>\n");
      out.write("        <div class=\"panel-body\"><img src=\"images/chicken-biryani.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<div class=\"col-sm-7\">\n");
      out.write("        <h3><b>Biryani</b></h3>\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_full.png\" />\n");
      out.write("\t\t<img src=\"images/rating_half.png\" />\n");
      out.write("\t\t<img src=\"images/rating_empty.png\" />\n");
      out.write("\t\t\n");
      out.write("\t<hr>\n");
      out.write("\t\t <p><b>Chicken Biryani</b>\n");
      out.write("\t\t<h4 style=\"color:#F08080\"><img src=\"images/ic_pink.png\" /><b>499 </b> </h4>\n");
      out.write("               <br>\t\t\n");
      out.write("<p><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\" class=\"btn btn-success glyphicon glyphicon-hand-right\"> BUY NOW</a>\n");
      out.write("\n");
      out.write("</p></div><br>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("  <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("    \n");
      out.write("      <!-- Modal content-->\n");
      out.write("      <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\" style=\"background-color:green; color:orange\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <h4 class=\"modal-title\">Fill your details to contact Dealer</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("          <form action=\"finalbook.jsp\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <label for=\"pwd\">Name:</label>\n");
      out.write("     <input type=\"plain\" class=\"form-control\" placeholder=\"Enter your name\" name=\"bname\" required>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("         <label for=\"pwd\">Email:</label>\n");
      out.write("     <input type=\"email\" class=\"form-control\" placeholder=\"Enter your email\" name=\"bemail\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label>Contact:</label>\n");
      out.write("      <input type=\"plain\" class=\"form-control\" placeholder=\"Enter your mobile number\" name=\"bnumber\" required maxlength=\"10\" onchange=\"CheckIndianNumber(this.value)\">\n");
      out.write("    </div>\n");
      out.write("              <script>\n");
      out.write("function CheckIndianNumber(IndianNumber)\n");
      out.write("{\n");
      out.write("var IndNum = /^([0|\\+[0-9]{1,5})?([7-9][0-9]{9})$/;\n");
      out.write("if(IndNum.test(IndianNumber))\n");
      out.write("       {\n");
      out.write("           swal(\n");
      out.write("  'Success!',\n");
      out.write("  'Valid Mobile Number',\n");
      out.write("  'success'\n");
      out.write(")\n");
      out.write("       }\n");
      out.write("       else\n");
      out.write("       {\n");
      out.write("           swal(\n");
      out.write("      'Error!',\n");
      out.write("      'Mobile number is not valid!',\n");
      out.write("      'error'\n");
      out.write("    )\n");
      out.write("       }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("     <div class=\"form-group\">\n");
      out.write("     <label>Your Messages:</label>\n");
      out.write("  <textarea class=\"form-control\" rows=\"5\" name=\"bcomment\" required></textarea> \n");
      out.write("    </div>\n");
      out.write("      <div class=\"modal-footer\"><button type=\"submit\" class=\"btn btn-primary\">SUBMIT</button></div>\n");
      out.write("  </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"> src = \"C:\\Users\\sltuser\\Desktop\\Buy & Sale Car Project\\js/jquery.js\" </script>\n");
      out.write("<script type=\"text/javascript\"> src = \"C:\\Users\\sltuser\\Desktop\\Buy & Sale Car Project\\js/bootstrap.js\" </script>\n");
      out.write("</body>\n");
      out.write("\n");
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
