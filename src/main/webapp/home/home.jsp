<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8"/>
    <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
    <link rel="icon" type="image/png" href="../assets/img/favicon.ico">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <title>Light Bootstrap Dashboard - Free Bootstrap 4 Admin Dashboard by Creative Tim</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no'
          name='viewport'/>
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"/>
    <!-- CSS Files -->
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="../assets/css/light-bootstrap-dashboard.css?v=2.0.0 " rel="stylesheet"/>
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="../assets/css/demo.css" rel="stylesheet"/>
</head>
<body>
<link rel="stylesheet" href="homepage.css">
<div class="wrapper">
    <div class="sidebar" data-image="../assets/img/sidebar-5.jpg">
        <div style=" " class="sidebar-wrapper">
            <div class="logo">
                <a href="javascript:;" class="simple-text">
                    <span> Sending Management</span>
                </a>
            </div>
            <ul class="nav">
                <li class="nav-item active">
                    <a class="nav-link" href="dashboard.html">
                        <p>Income and Expense</p>
                        <%-------////////////////////   Danh Sach Chi tieu--%>
                    </a>
                </li>
                <li>
                    <a class="nav-link" href="home/user.jsp">
                        <p>Account</p>
                        <%-------//////////////////// Quan ly Acc count--%>
                    </a>
                </li>

            </ul>
        </div>
    </div>
    <div class="main-panel">
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg " color-on-scroll="500">
            <div class="container-fluid">

                <button href="" class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                        aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-bar burger-lines"></span>
                    <span class="navbar-toggler-bar burger-lines"></span>
                    <span class="navbar-toggler-bar burger-lines"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navigation">
                    <ul class="nav navbar-nav mr-auto">

                        <li class="nav-item">
                            <a href="#" class="nav-link"> <%------///////////////////////  Tim Kiem -------%>
                                <i class="nc-icon nc-zoom-split"></i>
                                <span class="d-lg-block">&nbsp;Search</span>
                            </a>
                        </li>
                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li style="padding-top: 27px" class="nav-item">
                            <button style="background-color: #8564ca;border: none;border-radius: 10px; " type="submit"
                                    class="btn-primary">
                                <a style="color: white;font-size: 13px;padding: 10px" data-toggle="modal"
                                   data-target="#myModal">ADD TRANSACTION</a>
                            </button>
                            <%----------------  ////////////////////////////// Them chi tieu--%>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#pablo"><%-----------////////////////    Dang xuat--%>
                                <span class="no-icon">Log out</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>


        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">
                <div style="width: 700px;text-align: center" class="card">
                    <form>
                        <h3 style="color: #8564ca"><b>Add Transaction</b></h3>
                        <select>
                            <option selected hidden>Category Transaction</option>
                            <option value="" name="">Expense</option>
                            <option value="" name="">Income</option>
                        </select>

                        <select hidden>
                            <option selected>Category Expense</option>
                            <option value="" name="">Water Bill</option>
                            <option value="" name="">Gas Bill</option>
                        </select>

                        <select>
                            <option selected>Category Income</option>
                            <option value="" name="">Salary</option>
                            <option value="" name="">Internet</option>
                        </select>

                        <input type="text" placeholder="Amount" name="amount-expense">
                        <input type="date" placeholder="Date" name="date-expense">
                        <textarea name="" placeholder="Notes..."></textarea>

                        <div id="btn-modal">
                            <button style="background-color:#cc3e3e" class="btn">Close</button>
                            <button style="background-color:#1e7e34;" class="btn">Add</button>
                        </div>
                    </form>
                </div>

            </div>
        </div>


        <!-- End Navbar -->
        <div class="content">
            <div class="container-fluid">
                <div class="section">
                    <div class="container" style="margin-top: 20px;">

                        <div class="panel panel-primary">
                            <div class="panel-body">
                                <form action="" class="form-horizontal" id="validate">
                                    <ul class="nav nav-tabs nav-justified nav-inline">
                                        <li class="active">
                                            <button style="  background-color: #8564ca; ; border: none;">
                                                <a style="color: white" href="#primary" data-toggle="tab"><b>Expense</b></a>
                                            </button>
                                        </li>
                                        <li>
                                            <button style="  background-color: #8564ca;color: white;  border: none;">
                                                <a style="color: white" href="#secondary"
                                                   data-toggle="tab"><b>Income</b></a>
                                            </button>
                                        </li>
                                    </ul>

                                    <div class="tab-content tab-validate" style="margin-top:20px;">
                                        <div class="tab-pane active" id="primary">
                                            <div class="item-spending">
                                                <div class="item-head">
                                                    <p style="padding: 10px 0px 0px 10px;color: #8564ca;font-weight: bold">
                                                        <b>Expense</b></p>
                                                    <div class="item-btn">
                                                    <button class="btnEdit-item" type="submit"><a>Edit</a></button>
                                                    <button class="btnDelete-item" type="submit"><a>Delete</a></button>
                                                    </div>
                                                </div>
                                                <div class="item-top">
                                                    <i class="fa fa-arrow-up"
                                                       style="font-size:20px;color:#cc3e3e;padding: 5px 0px 0px 10px"></i>
                                                    <div><span
                                                            style="background-color: #cc3e3e;padding: 5px;border-radius: 10px;color: white">Transportation</span>
                                                    </div>
                                                    <p><span><b>Date :</b></span> 02-12-2022</p>
                                                </div>
                                                <div style="display: grid; grid-template-columns: 40% 60%;padding-left: 78px"
                                                     class="item-bot">
                                                    <p><span><b>Total:</b></span> 100.000.000 VND</p>
                                                    <p style="padding-left: 95px"><span><b>Note</b></span>: Very much
                                                    </p>
                                                </div>
                                            </div>
                                        </div>


                                        <div class="tab-pane" id="secondary">
                                            <div class="item-spending">
                                                <div class="item-head">
                                                    <p style="padding: 10px 0px 0px 10px;color: #8564ca;font-weight: bold">
                                                        <b>Income</b></p>
                                                    <div class="item-btn">
                                                    <button class="btnEdit-item" type="submit"><a>Edit</a></button>
                                                    <button class="btnDelete-item" type="submit"><a>Delete</a></button>
                                                    </div>
                                                </div>
                                                <div class="item-top">
                                                    <i class="fa fa-arrow-down"
                                                       style="font-size:20px;color:#1e7e34;padding: 5px 0px 0px 10px"></i>
                                                    <div><span
                                                            style="background-color: #1e7e34;padding: 5px;border-radius: 10px;color: white">Transportation</span>
                                                    </div>
                                                    <p><span><b>Date :</b></span> 02-12-2022</p>
                                                </div>
                                                <div style="display: grid; grid-template-columns: 40% 60%;padding-left: 78px"
                                                     class="item-bot">
                                                    <p><span><b>Total:</b></span> 100.000.000 VND</p>
                                                    <p style="padding-left: 95px"><span><b>Note</b></span>: Very much
                                                    </p>
                                                </div>
                                            </div>

                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <footer class="footer">
            <div class="container-fluid">
                <nav>
                    <ul class="footer-menu">
                        <li>
                            <a href="#">
                                Home
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                Company
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                Portfolio
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                Blog
                            </a>
                        </li>
                    </ul>
                    <p class="copyright text-center">
                        ©
                        <script>
                            document.write(new Date().getFullYear())
                        </script>
                        <a href="">F44</a> Hũ chi tiêu số 1 Châu Á
                    </p>
                </nav>
            </div>
        </footer>
    </div>
</div>
<!--   -->
<!-- <div class="fixed-plugin">
<div class="dropdown show-dropdown">
    <a href="#" data-toggle="dropdown">
        <i class="fa fa-cog fa-2x"> </i>
    </a>

    <ul class="dropdown-menu">
        <li class="header-title"> Sidebar Style</li>
        <li class="adjustments-line">
            <a href="javascript:void(0)" class="switch-trigger">
                <p>Background Image</p>
                <label class="switch">
                    <input type="checkbox" data-toggle="switch" checked="" data-on-color="primary" data-off-color="primary"><span class="toggle"></span>
                </label>
                <div class="clearfix"></div>
            </a>
        </li>
        <li class="adjustments-line">
            <a href="javascript:void(0)" class="switch-trigger background-color">
                <p>Filters</p>
                <div class="pull-right">
                    <span class="badge filter badge-black" data-color="black"></span>
                    <span class="badge filter badge-azure" data-color="azure"></span>
                    <span class="badge filter badge-green" data-color="green"></span>
                    <span class="badge filter badge-orange" data-color="orange"></span>
                    <span class="badge filter badge-red" data-color="red"></span>
                    <span class="badge filter badge-purple active" data-color="purple"></span>
                </div>
                <div class="clearfix"></div>
            </a>
        </li>
        <li class="header-title">Sidebar Images</li>

        <li class="active">
            <a class="img-holder switch-trigger" href="javascript:void(0)">
                <img src="../assets/img/sidebar-1.jpg" alt="" />
            </a>
        </li>
        <li>
            <a class="img-holder switch-trigger" href="javascript:void(0)">
                <img src="../assets/img/sidebar-3.jpg" alt="" />
            </a>
        </li>
        <li>
            <a class="img-holder switch-trigger" href="javascript:void(0)">
                <img src="..//assets/img/sidebar-4.jpg" alt="" />
            </a>
        </li>
        <li>
            <a class="img-holder switch-trigger" href="javascript:void(0)">
                <img src="../assets/img/sidebar-5.jpg" alt="" />
            </a>
        </li>

        <li class="button-container">
            <div class="">
                <a href="http://www.creative-tim.com/product/light-bootstrap-dashboard" target="_blank" class="btn btn-info btn-block btn-fill">Download, it's free!</a>
            </div>
        </li>

        <li class="header-title pro-title text-center">Want more components?</li>

        <li class="button-container">
            <div class="">
                <a href="http://www.creative-tim.com/product/light-bootstrap-dashboard-pro" target="_blank" class="btn btn-warning btn-block btn-fill">Get The PRO Version!</a>
            </div>
        </li>

        <li class="header-title" id="sharrreTitle">Thank you for sharing!</li>

        <li class="button-container">
            <button id="twitter" class="btn btn-social btn-outline btn-twitter btn-round sharrre"><i class="fa fa-twitter"></i> · 256</button>
            <button id="facebook" class="btn btn-social btn-outline btn-facebook btn-round sharrre"><i class="fa fa-facebook-square"></i> · 426</button>
        </li>
    </ul>
</div>
</div>
-->
</body>
<!--   Core JS Files   -->
<style>
    body {
        box-sizing: border-box;
        margin: auto;
    }

    @import url(https://fonts.googleapis.com/css?family=Calibri:400,300,700);


    textarea {
        margin-left: 10px;
        width: 220px;
        border-color: #8564ca;
        outline: none;
        border-radius: 10px;
    }


    .card form select {
        border-radius: 10px;
        margin: 10px;
        width: 220px;
        height: 30px;
        border-color: #8564ca;
        outline: none;
    }

    .card form input {
        margin: 10px;
        width: 220px;
        height: 30px;
        outline: none;
        padding: 10px;
        border-radius: 10px;
        border-color: #8564ca;
    }

    @media (max-width: 767px) {
        .card {
            width: 90vw;
        }
    }


    .card-title p {
        color: rgb(29, 226, 226);
        font-weight: 900;
        font-size: 30px;
        margin-bottom: unset;
    }

    .card-text p {
        color: grey;
        font-size: 25px;
        text-align: center;
        padding: 3vh 0;
        font-weight: lighter;
    }

    #btn-modal {
        margin-left: 70px;
        display: grid;
        grid-template-columns: 45% 45%;
    }

    #btn-modal button {
        border-radius: 10px;
        border: none;
        color: white;
        margin: 15px;

    }


    .item-top {
        padding: 10px 0px 5px 10px;
        display: grid;
        grid-template-columns:10% 50% 40%;

    }

    .item-title {
        font-weight: bold;
    }

    .item-spending {
        background-color: white;
        width: 70%;
        padding-left: 50px;
        border-radius: 15px;
        border: 5px solid;
        border-color: #892ef1 #9c73ec #afaff1;
    }
    .item-head{
        display: grid;
        grid-template-columns: 60% 40%;
    }
    .btnEdit-item{
        height: 30px;
        width: 50px;
        border: none;
        background-color: #1e7e34;
        color: white;
    }
    .btnDelete-item{
        height: 30px;
        width: 70px;
        border: none;
        color: white;
        background-color: #a22626;
    }
    .item-btn{
        margin: 10px;
        padding-left: 120px;
    }

</style>

<script src="assets/js/core/jquery.3.2.1.min.js" type="text/javascript"></script>
<script src="assets/js/core/popper.min.js" type="text/javascript"></script>
<script src="assets/js/core/bootstrap.min.js" type="text/javascript"></script>
<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
<script src="assets/js/plugins/bootstrap-switch.js"></script>
<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
<!--  Chartist Plugin  -->
<script src="assets/js/plugins/chartist.min.js"></script>
<!--  Notifications Plugin    -->
<script src="assets/js/plugins/bootstrap-notify.js"></script>
<!-- Control Center for Light Bootstrap Dashboard: scripts for the example pages etc -->
<script src="assets/js/light-bootstrap-dashboard.js?v=2.0.0 " type="text/javascript"></script>
<!-- Light Bootstrap Dashboard DEMO methods, don't include it in your project! -->
<script src="assets/js/demo.js"></script>

</html>
