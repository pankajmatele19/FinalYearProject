package org.apache.jsp.Library_002dwebsite;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jdbc.OracleTypes;
import java.sql.*;

public final class shop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/\">\n");
      out.write("\n");
      out.write("        <!-- title -->\n");
      out.write("        <title>Shop</title>\n");
      out.write("\n");
      out.write("        <!-- favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"assets/img/favicon.png\">\n");
      out.write("        <!-- google font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- fontawesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/all.min.css\">\n");
      out.write("        <!-- bootstrap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.css\">\n");
      out.write("        <!-- magnific popup -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\n");
      out.write("        <!-- animate css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("        <!-- mean menu css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/meanmenu.min.css\">\n");
      out.write("        <!-- main style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/main.css\">\n");
      out.write("        <!-- responsive -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- header -->\n");
      out.write("        <div class=\"top-header-area\" id=\"sticker\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 col-sm-12 text-center\">\n");
      out.write("                        <div class=\"main-menu-wrap\">\n");
      out.write("                            <!-- logo -->\n");
      out.write("                            <div class=\"site-logo\">\n");
      out.write("                                <a href=\"index.html\">\n");
      out.write("                                    <img src=\"assets/img/logo.png\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- logo -->\n");
      out.write("\n");
      out.write("                            <!-- menu start -->\n");
      out.write("                            <nav class=\"main-menu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li class=\"current-list-item\"><a href=\"index.html\">Home</a></li>\n");
      out.write("                                    <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                                    <li><a href=\"shop.html\">Shop</a></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"header-icons\">\n");
      out.write("                                            <a href=\"login.html\"><i class=\"fas fa-user\"></i></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                            <a class=\"mobile-show search-bar-icon\" href=\"#\"><i class=\"fas fa-search\"></i></a>\n");
      out.write("                            <div class=\"mobile-menu\"></div>\n");
      out.write("                            <!-- menu end -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end header -->\n");
      out.write("\n");
      out.write("        <!-- search area -->\n");
      out.write("        <div class=\"search-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <span class=\"close-btn\"><i class=\"fas fa-window-close\"></i></span>\n");
      out.write("                        <div class=\"search-bar\">\n");
      out.write("                            <div class=\"search-bar-tablecell\">\n");
      out.write("                                <h3>Search For:</h3>\n");
      out.write("                                <input type=\"text\" placeholder=\"Keywords\">\n");
      out.write("                                <button type=\"submit\">Search <i class=\"fas fa-search\"></i></button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end search arewa -->\n");
      out.write("\n");
      out.write("        <!-- breadcrumb-section -->\n");
      out.write("        <div class=\"breadcrumb-section breadcrumb-bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 offset-lg-2 text-center\">\n");
      out.write("                        <div class=\"breadcrumb-text\">\n");
      out.write("                            <p>Fresh and Organic</p>\n");
      out.write("                            <h1>Shop</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end breadcrumb section -->\n");
      out.write("\n");
      out.write("        <!-- products -->\n");
      out.write("        <div class=\"product-section mt-150 mb-150\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row product-lists\">\n");
      out.write("                    ");

                        try {
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
                            String sql = "{call LastYearProject.dispbooks(?,?,?,?,?,?,?)}";
                            CallableStatement cs = con.prepareCall(sql);

                            cs.registerOutParameter(1, OracleTypes.CURSOR);
                            cs.registerOutParameter(2, java.sql.Types.INTEGER);
                            cs.registerOutParameter(3, java.sql.Types.VARCHAR);
                            cs.registerOutParameter(4, java.sql.Types.INTEGER);
                            cs.registerOutParameter(5, java.sql.Types.INTEGER);
                            cs.registerOutParameter(6, java.sql.Types.VARCHAR);
                            cs.registerOutParameter(7, java.sql.Types.VARCHAR);

                            String name = (String) session.getAttribute("username");
                            cs.executeQuery();
                            ResultSet rs = (ResultSet) cs.getObject(1);
                            while (rs.next()) {
                                String img = rs.getString(6);
                                int bid = rs.getInt(1);
                                String na = rs.getString(2);
                                String Author = rs.getString(3);
                                int quan = rs.getInt(4);
                                String dept = rs.getString(5);
                                out.print("<div class=\"col-lg-4 col-md-6 text-center lemon\">\n"
                                        + "					<div class=\"single-product-item\">\n"
                                        + "						<div class=\"product-image\">\n"
                                        + "							<a href=\"single-product.html\"><img src=\"assets/img/books/" + img + "\" alt=\"\"></a>\n"
                                        + "						</div>\n"
                                        + "						<h3>" + na + "</h3>\n"
                                        + "                                                <p><b>Author</b> : " + Author + "</p>"
                                        + "                                                <p><b>Quantity</b> : " + quan + "</p>\n"
                                        + "						<a href=../Admin_dashboard/request.jsp?bid='" + bid + "&n=" + name + "' class=cart-btn>Request</a>"
                                        + "					</div>\n"
                                        + "				</div>");

                            }
                        } catch (Exception e) {
                            out.println(e.getMessage());
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end products -->\n");
      out.write("\n");
      out.write("        <!-- end logo carousel -->\n");
      out.write("\n");
      out.write("        <!-- footer -->\n");
      out.write("        <div class=\"footer-area\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"footer-box about-widget\">\n");
      out.write("                            <h2 class=\"widget-title\">About us</h2>\n");
      out.write("                            <p>Ut enim ad minim veniam perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"footer-box get-in-touch\">\n");
      out.write("                            <h2 class=\"widget-title\">Get in Touch</h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>34/8, East Hukupara, Gifirtok, Sadan.</li>\n");
      out.write("                                <li>support@fruitkha.com</li>\n");
      out.write("                                <li>+00 111 222 3333</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"footer-box pages\">\n");
      out.write("                            <h2 class=\"widget-title\">Pages</h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                                <li><a href=\"about.html\">About</a></li>\n");
      out.write("                                <li><a href=\"services.html\">Shop</a></li>\n");
      out.write("                                <li><a href=\"news.html\">News</a></li>\n");
      out.write("                                <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                        <div class=\"footer-box subscribe\">\n");
      out.write("                            <h2 class=\"widget-title\">Subscribe</h2>\n");
      out.write("                            <p>Subscribe to our mailing list to get the latest updates.</p>\n");
      out.write("                            <form action=\"index.html\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Email\">\n");
      out.write("                                <button type=\"submit\"><i class=\"fas fa-paper-plane\"></i></button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end footer -->\n");
      out.write("\n");
      out.write("        <!-- jquery -->\n");
      out.write("        <script src=\"assets/js/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <!-- bootstrap -->\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- count down -->\n");
      out.write("        <script src=\"assets/js/jquery.countdown.js\"></script>\n");
      out.write("        <!-- isotope -->\n");
      out.write("        <script src=\"assets/js/jquery.isotope-3.0.6.min.js\"></script>\n");
      out.write("        <!-- waypoints -->\n");
      out.write("        <script src=\"assets/js/waypoints.js\"></script>\n");
      out.write("        <!-- owl carousel -->\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- magnific popup -->\n");
      out.write("        <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <!-- mean menu -->\n");
      out.write("        <script src=\"assets/js/jquery.meanmenu.min.js\"></script>\n");
      out.write("        <!-- sticker js -->\n");
      out.write("        <script src=\"assets/js/sticker.js\"></script>\n");
      out.write("        <!-- main js -->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
