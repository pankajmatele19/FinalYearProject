package org.apache.jsp.Admin_005fdashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import oracle.jdbc.internal.OracleTypes;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Corona Admin</title>\n");
      out.write("        <!-- plugins:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendors/css/vendor.bundle.base.css\">\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <!-- Plugin css for this page -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendors/jvectormap/jquery-jvectormap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendors/flag-icon-css/css/flag-icon.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendors/owl-carousel-2/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendors/owl-carousel-2/owl.theme.default.min.css\">\n");
      out.write("        <!-- End plugin css for this page -->\n");
      out.write("        <!-- inject:css -->\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <!-- Layout styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- End layout styles -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.png\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-scroller\">\n");
      out.write("            <!-- partial:partials/_sidebar.html -->\n");
      out.write("            <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("                <div class=\"sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top\">\n");
      out.write("                    <a class=\"sidebar-brand brand-logo\" href=\"../Library-website/index.jsp\" style=\"text-decoration: none; color:aliceblue; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\">Library Website</a>\n");
      out.write("                    <a class=\"sidebar-brand brand-logo-mini\" href=\"../Library-website/index.jsp\" style=\"text-decoration: none; color:aliceblue; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\">LW</a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"nav-item menu-items\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">\n");
      out.write("                            <span class=\"menu-icon\">\n");
      out.write("                                <i class=\"mdi mdi-speedometer\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"menu-title\">Dashboard</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item menu-items\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic1\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("                            <span class=\"menu-icon\">\n");
      out.write("                                <i class=\"mdi mdi-book\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"menu-title\">Books</span>\n");
      out.write("                            <i class=\"menu-arrow\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"ui-basic1\">\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"addbo.jsp\">Add Books</a></li>\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"dispbook.jsp\">Manage Books</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item menu-items\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic2\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("                            <span class=\"menu-icon\">\n");
      out.write("                                <i class=\"mdi mdi-face-profile\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"menu-title\">Users</span>\n");
      out.write("                            <i class=\"menu-arrow\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"ui-basic2\">\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"addus.jsp\">Add User</a></li>\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"dispuser.jsp\">Display Users</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item menu-items\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic6\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("                            <span class=\"menu-icon\">\n");
      out.write("                                <i class=\"mdi mdi-paypal\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"menu-title\">request</span>\n");
      out.write("                            <i class=\"menu-arrow\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"ui-basic6\">\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"dispreq.jsp\">Book Requests</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item menu-items\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic3\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("                            <span class=\"menu-icon\">\n");
      out.write("                                <i class=\"mdi mdi-table\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"menu-title\">Issue</span>\n");
      out.write("                            <i class=\"menu-arrow\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"ui-basic3\">\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"dispissue.jsp\">Display Issues</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item menu-items\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic4\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("                            <span class=\"menu-icon\">\n");
      out.write("                                <i class=\"mdi mdi-paypal\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"menu-title\">Fine</span>\n");
      out.write("                            <i class=\"menu-arrow\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"ui-basic4\">\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"addfin.jsp\">Add Fine</a></li>\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"dispfine.jsp\">Display Fines</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item menu-items\">\n");
      out.write("                        <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic5\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("                            <span class=\"menu-icon\">\n");
      out.write("                                <i class=\"mdi mdi-paypal\"></i>\n");
      out.write("                            </span>\n");
      out.write("                            <span class=\"menu-title\">Payment</span>\n");
      out.write("                            <i class=\"menu-arrow\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"collapse\" id=\"ui-basic5\">\n");
      out.write("                            <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"Payment.jsp\">Fine Payments</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <!-- partial -->\n");
      out.write("            <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("                <!-- partial:partials/_navbar.html -->\n");
      out.write("                <nav class=\"navbar p-0 fixed-top d-flex flex-row\">\n");
      out.write("                    <div class=\"navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center\">\n");
      out.write("                        <a class=\"navbar-brand brand-logo-mini\" href=\"index.jsp\"><img src=\"images/logo-mini.svg\"\n");
      out.write("                                                                                       alt=\"logo\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"navbar-menu-wrapper flex-grow d-flex align-items-stretch\">\n");
      out.write("                        <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\n");
      out.write("                            <span class=\"mdi mdi-menu\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <ul class=\"navbar-nav navbar-nav-right\">\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link\" id=\"profileDropdown\" href=\"#\" data-toggle=\"dropdown\">\n");
      out.write("                                    <div class=\"navbar-profile\">\n");
      out.write("                                        ");
 String name = (String) session.getAttribute("username"); 
      out.write("\n");
      out.write("                                        <img class=\"img-xs rounded-circle\" src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3-bg.webp\" alt=\"\">\n");
      out.write("                                        <p class=\"mb-0 d-none d-sm-block navbar-profile-name\">");
      out.print(name );
      out.write("</p>\n");
      out.write("                                        <i class=\"mdi mdi-menu-down d-none d-sm-block\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown preview-list\"\n");
      out.write("                                     aria-labelledby=\"profileDropdown\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item preview-item\" href=\"logout.jsp\">\n");
      out.write("                                        <div class=\"preview-thumbnail\">\n");
      out.write("                                            <div class=\"preview-icon bg-dark rounded-circle\">\n");
      out.write("                                                <i class=\"mdi mdi-logout text-danger\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"preview-item-content\">\n");
      out.write("                                            <p class=\"preview-subject mb-1\">Log out</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\"\n");
      out.write("                                data-toggle=\"offcanvas\">\n");
      out.write("                            <span class=\"mdi mdi-format-line-spacing\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- partial -->\n");
      out.write("                <div class=\"main-panel\">\n");
      out.write("                    <div class=\"content-wrapper\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3 grid-margin\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5>Total Books</h5>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-8 col-sm-12 col-xl-8 my-auto\">\n");
      out.write("                                                <div class=\"d-flex d-sm-block d-md-flex align-items-center\">\n");
      out.write("                                                    ");


                                        try {
                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
                                            String sql = "{? = call LastYearProject.coubook}";
                                            CallableStatement cs = con.prepareCall(sql);

                                            cs.registerOutParameter(1, java.sql.Types.INTEGER);

                                            cs.execute();
                                            out.print("<h5><strong>" + cs.getInt(1) + "</strong></h5>");

                                        } catch (Exception e) {
                                            out.println(e.getMessage());
                                        }


                                    
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-4 col-sm-12 col-xl-4 text-center text-xl-right\">\n");
      out.write("                                                <i class=\"icon-lg mdi mdi-book-multiple text-primary ml-auto\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3 grid-margin\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5>Total Users</h5>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-8 col-sm-12 col-xl-8 my-auto\">\n");
      out.write("                                                <div class=\"d-flex d-sm-block d-md-flex align-items-center\">\n");
      out.write("                                                    ");
                                        try {
                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
                                            String sql = "{? = call LastYearProject.couusers}";
                                            CallableStatement cs = con.prepareCall(sql);

                                            cs.registerOutParameter(1, java.sql.Types.INTEGER);

                                            cs.execute();
                                            out.print("<h5><strong>" + cs.getInt(1) + "</strong></h5>");
                                            
                                            
                                        } catch (Exception e) {
                                            out.println(e.getMessage());
                                        }


                                    
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-4 col-sm-12 col-xl-4 text-center text-xl-right\">\n");
      out.write("                                                <i class=\"icon-lg mdi mdi-face-profile text-primary ml-auto\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3 grid-margin\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5>Total Issues</h5>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-8 col-sm-12 col-xl-8 my-auto\">\n");
      out.write("                                                <div class=\"d-flex d-sm-block d-md-flex align-items-center\">\n");
      out.write("                                                    ");
                                        try {
                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
                                            String sql = "{? = call LastYearProject.couissue}";
                                            CallableStatement cs = con.prepareCall(sql);

                                            cs.registerOutParameter(1, java.sql.Types.INTEGER);

                                            cs.execute();
                                            out.print("<h5><strong>" + cs.getInt(1) + "</strong></h5>");
                                            
                                            
                                        } catch (Exception e) {
                                            out.println(e.getMessage());
                                        }


                                    
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-4 col-sm-12 col-xl-4 text-center text-xl-right\">\n");
      out.write("                                                <i class=\"icon-lg mdi mdi-table-plus text-primary ml-auto\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3 grid-margin\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <h5>Total Fines</h5>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-8 col-sm-12 col-xl-8 my-auto\">\n");
      out.write("                                                <div class=\"d-flex d-sm-block d-md-flex align-items-center\">\n");
      out.write("                                                    ");
                                        try {
                                            Class.forName("oracle.jdbc.driver.OracleDriver");
                                            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
                                            String sql = "{? = call LastYearProject.coufine}";
                                            CallableStatement cs = con.prepareCall(sql);

                                            cs.registerOutParameter(1, java.sql.Types.INTEGER);

                                            cs.execute();
                                            out.print("<h5><strong>" + cs.getInt(1) + "</strong></h5>");
                                            
                                            
                                        } catch (Exception e) {
                                            out.println(e.getMessage());
                                        }


                                    
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-4 col-sm-12 col-xl-4 text-center text-xl-right\">\n");
      out.write("                                                <i class=\"icon-lg mdi mdi-paypal text-primary ml-auto\"></i>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row d-flex justify-content-center align-items-center\">\n");
      out.write("                            <div class=\"col-md-12 col-xl-4\" style=\"width:500px;\">\n");
      out.write("\n");
      out.write("                                <div class=\"card\" style=\"border-radius: 15px; background-color: azure;\">\n");
      out.write("                                    <div class=\"card-body text-center\">\n");
      out.write("                                        <div class=\"mt-3 mb-4\">\n");
      out.write("                                            <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3-bg.webp\"\n");
      out.write("                                                 class=\"rounded-circle img-fluid\" style=\"width: 200px;\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <h4 class=\"mb-2\" style=\"color: black;\">");
      out.print(name );
      out.write("</h4>\n");
      out.write("                                        <p class=\"text-muted mb-4\">Admin <span class=\"mx-2\">|</span> <a href=\"#!\">Pillai\n");
      out.write("                                                College</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- content-wrapper ends -->\n");
      out.write("                    <!-- partial:partials/_footer.html -->\n");
      out.write("                    <footer class=\"footer\">\n");
      out.write("                        <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\n");
      out.write("                            <span class=\"text-muted d-block text-center text-sm-left d-sm-inline-block\">Copyright © bootstrapdash.com\n");
      out.write("                                2020</span>\n");
      out.write("                            <span class=\"float-none float-sm-right d-block mt-1 mt-sm-0 text-center\"> Free <a\n");
      out.write("                                    href=\"https://www.bootstrapdash.com/bootstrap-admin-template/\" target=\"_blank\">Bootstrap admin\n");
      out.write("                                    templates</a> from Bootstrapdash.com</span>\n");
      out.write("                        </div>\n");
      out.write("                    </footer>\n");
      out.write("                    <!-- partial -->\n");
      out.write("                </div>\n");
      out.write("                <!-- main-panel ends -->\n");
      out.write("            </div>\n");
      out.write("            <!-- page-body-wrapper ends -->\n");
      out.write("        </div>\n");
      out.write("        <!-- container-scroller -->\n");
      out.write("        <!-- plugins:js -->\n");
      out.write("        <script src=\"vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("        <!-- endinject -->\n");
      out.write("\n");
      out.write("        <!-- inject:js -->\n");
      out.write("        <script src=\"js/off-canvas.js\"></script>\n");
      out.write("        <script src=\"js/hoverable-collapse.js\"></script>\n");
      out.write("        <script src=\"js/misc.js\"></script>\n");
      out.write("        <script src=\"js/settings.js\"></script>\n");
      out.write("        <script src=\"js/todolist.js\"></script>\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <script src=\"vendors/chart.js/Chart.min.js\"></script>\n");
      out.write("        <script src=\"vendors/progressbar.js/progressbar.min.js\"></script>\n");
      out.write("        <script src=\"vendors/jvectormap/jquery-jvectormap.min.js\"></script>\n");
      out.write("        <script src=\"vendors/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom js for this page -->\n");
      out.write("        <script src=\"js/dashboard.js\"></script>\n");
      out.write("        <!-- End custom js for this page -->\n");
      out.write("    </body>\n");
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
