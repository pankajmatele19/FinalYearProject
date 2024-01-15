<!DOCTYPE html>
<%@page import="oracle.jdbc.OracleTypes"%>
<%@page import="java.sql.*"%>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Library Admin</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="vendors/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <link rel="stylesheet" href="vendors/jvectormap/jquery-jvectormap.css">
  <link rel="stylesheet" href="vendors/flag-icon-css/css/flag-icon.min.css">
  <link rel="stylesheet" href="vendors/owl-carousel-2/owl.carousel.min.css">
  <link rel="stylesheet" href="vendors/owl-carousel-2/owl.theme.default.min.css">
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <!-- endinject -->
  <!-- Layout styles -->
  <link rel="stylesheet" href="css/style.css">
  <!-- End layout styles -->
  <link rel="shortcut icon" href="images/favicon.png" />
</head>

<body>
  <div class="container-scroller">
    <!-- partial:../../partials/_sidebar.html -->
    <nav class="sidebar sidebar-offcanvas" id="sidebar">
                <div class="sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top">
                    <a class="sidebar-brand brand-logo" href="index.jsp" style="text-decoration: none; color:aliceblue; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;">Library Website</a>
                    <a class="sidebar-brand brand-logo-mini" href="index.jsp" style="text-decoration: none; color:aliceblue; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;">LW</a>
                </div>
                <ul class="nav">
                    <li class="nav-item menu-items">
                        <a class="nav-link" href="index.jsp">
                            <span class="menu-icon">
                                <i class="mdi mdi-speedometer"></i>
                            </span>
                            <span class="menu-title">Dashboard</span>
                        </a>
                    </li>
                    <li class="nav-item menu-items">
                        <a class="nav-link" data-toggle="collapse" href="#ui-basic1" aria-expanded="false" aria-controls="ui-basic">
                            <span class="menu-icon">
                                <i class="mdi mdi-table"></i>
                            </span>
                            <span class="menu-title">Issue</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="ui-basic1">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link" href="dispissue.jsp">Display Issues</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="nav-item menu-items">
                        <a class="nav-link" data-toggle="collapse" href="#ui-basic2" aria-expanded="false" aria-controls="ui-basic">
                            <span class="menu-icon">
                                <i class="mdi mdi-paypal"></i>
                            </span>
                            <span class="menu-title">Fine</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="ui-basic2">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link" href="dispfine.jsp">Display Fines</a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="nav-item menu-items">
                        <a class="nav-link" data-toggle="collapse" href="#ui-basic3" aria-expanded="false" aria-controls="ui-basic">
                            <span class="menu-icon">
                                <i class="mdi mdi-paypal"></i>
                            </span>
                            <span class="menu-title">Payment</span>
                            <i class="menu-arrow"></i>
                        </a>
                        <div class="collapse" id="ui-basic3">
                            <ul class="nav flex-column sub-menu">
                                <li class="nav-item"> <a class="nav-link" href="pay.jsp">My Payments</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </nav>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
      <!-- partial:../../partials/_navbar.html -->
      <nav class="navbar p-0 fixed-top d-flex flex-row">
        <div class="navbar-brand-wrapper d-flex d-lg-none align-items-center justify-content-center">
          <a class="navbar-brand brand-logo-mini" href="index.html"><img src="images/logo-mini.svg"
              alt="logo" /></a>
        </div>
        <div class="navbar-menu-wrapper flex-grow d-flex align-items-stretch">
          <button class="navbar-toggler navbar-toggler align-self-center" type="button" data-toggle="minimize">
            <span class="mdi mdi-menu"></span>
          </button>
          <ul class="navbar-nav navbar-nav-right">
            <li class="nav-item dropdown">
              <a class="nav-link" id="profileDropdown" href="#" data-toggle="dropdown">
                <div class="navbar-profile">
                  <img class="img-xs rounded-circle"
                    src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3-bg.webp" alt="">
                  <% String name = (String) session.getAttribute("user"); %>
                  <p class="mb-0 d-none d-sm-block navbar-profile-name"><%=name%></p>
                  <i class="mdi mdi-menu-down d-none d-sm-block"></i>
                </div>
              </a>
              <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list"
                aria-labelledby="profileDropdown">
                <div class="dropdown-divider"></div>
                <a class="dropdown-item preview-item" href="logout.jsp">
                  <div class="preview-thumbnail">
                    <div class="preview-icon bg-dark rounded-circle">
                      <i class="mdi mdi-logout text-danger"></i>
                    </div>
                  </div>
                  <div class="preview-item-content">
                    <p class="preview-subject mb-1">Log out</p>
                  </div>
                </a>
                <div class="dropdown-divider"></div>
              </div>
            </li>
          </ul>
          <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button"
            data-toggle="offcanvas">
            <span class="mdi mdi-format-line-spacing"></span>
          </button>
        </div>
      </nav>
      <!-- partial -->
      <div class="main-panel">
        <div class="content-wrapper">
          <div class="page-header">
            <h3 class="page-title"> Update User </h3>
            <nav aria-label="breadcrumb">
              <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="#">Forms</a></li>
                <li class="breadcrumb-item active" aria-current="page">Update User</li>
              </ol>
            </nav>
          </div>
            <%
                                    try {
                                        Class.forName("oracle.jdbc.driver.OracleDriver");
                                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
                                        String sql = "{call LastYearProject.getuser(?,?,?,?,?,?,?)}";
                                        CallableStatement cs = con.prepareCall(sql);
                                        
                                        cs.registerOutParameter(1, OracleTypes.CURSOR);
                                        cs.registerOutParameter(2, java.sql.Types.VARCHAR);
                                        cs.registerOutParameter(3, java.sql.Types.VARCHAR);
                                        cs.registerOutParameter(4, java.sql.Types.VARCHAR);
                                        cs.registerOutParameter(5, java.sql.Types.VARCHAR);
                                        cs.registerOutParameter(6, java.sql.Types.VARCHAR);
                                        cs.setString(7, (String) session.getAttribute("user"));

                                        cs.executeQuery();
                                        
                                        ResultSet rs = (ResultSet) cs.getObject(1);
                                        while (rs.next()) {
                                            String n = rs.getString(1);
                                            String un = rs.getString(2);
                                            String pass = rs.getString(3);
                                            String em = rs.getString(4);
                                            String co = rs.getString(5);
                                            %>
          <div class="row">
            <div class="col-md-6 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Update User</h4>
                  <form class="forms-sample" action="updateuser.jsp"> 
                    <div class="form-group">  
                      <label for="exampleInputEmail1">User Id</label>
                      <input type="text" class="form-control" id="exampleInputEmail1" name="n" value=<%=n%> readonly style="background-color: #2c2e33;">
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Password</label>
                      <input type="text" class="form-control" id="exampleInputPassword1" name="pas" value=<%=pass%>>
                    </div>
                    <div class="form-group">
                      <label for="exampleInputPassword1">Contact</label>
                      <input type="text" class="form-control" id="exampleInputPassword1" name="con" value=<%=co%>>
                    </div>
                    <button type="submit" class="btn btn-primary mr-2">Update Profile</button>
                  </form>
                  <%
                    }
                                    } catch (Exception e) {
                                        out.println(e.getMessage());
                                    }
                                    %>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- content-wrapper ends -->
        <!-- partial:../../partials/_footer.html -->
        <footer class="footer">
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted d-block text-center text-sm-left d-sm-inline-block">Copyright � bootstrapdash.com
              2020</span>
            <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center"> Free <a
                href="https://www.bootstrapdash.com/bootstrap-admin-template/" target="_blank">Bootstrap admin
                templates</a> from Bootstrapdash.com</span>
          </div>
        </footer>
        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
 <!-- plugins:js -->
 <script src="vendors/js/vendor.bundle.base.js"></script>
 <!-- endinject -->
 <!-- Plugin js for this page -->
 <script src="vendors/chart.js/Chart.min.js"></script>
 <script src="vendors/progressbar.js/progressbar.min.js"></script>
 <script src="vendors/jvectormap/jquery-jvectormap.min.js"></script>
 <script src="vendors/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
 <script src="vendors/owl-carousel-2/owl.carousel.min.js"></script>
 <!-- End plugin js for this page -->
 <!-- inject:js -->
 <script src="js/off-canvas.js"></script>
 <script src="js/hoverable-collapse.js"></script>
 <script src="js/misc.js"></script>
 <script src="js/settings.js"></script>
 <script src="js/todolist.js"></script>
 <!-- endinject -->
 <!-- Custom js for this page -->
 <script src="js/dashboard.js"></script>
 <!-- End custom js for this page -->
</body>

</html>