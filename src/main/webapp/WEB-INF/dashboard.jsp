<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Papas Pizza</title>
	<meta name="description" content="">
	<meta name="robots" content="noindex, nofollow" />
	<meta name="viewport" content="width=device-width">

	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap-responsive.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="js/vendor/vegas/jquery.vegas.css">
	<link rel="stylesheet" href="js/vendor/prettyphoto/css/prettyPhoto.css" />
	<link rel="stylesheet" href="css/main.css">
	<link rel="stylesheet" href="css/custom-responsive.css">

	<!-- HTML5 Support for IE -->
        <!--[if lt IE 9]>
        <script src="js/vendor/html5shim.js"></script>
        <![endif]-->

    </head>
    <body data-spy="scroll" data-target=".navbar">

    	<!-- Header Starts -->
    	<header>
    		<div class="container">
    			<div class="navbar">
    				<div class="navbar-inner">
    					<div class="container">
    						<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
    							<span class="icon-bar"></span>
    							<span class="icon-bar"></span>
    							<span class="icon-bar"></span>
    						</button>
    						<a class="brand" href="#home"><i class="icon-food"></i> &nbsp; Papa's Pizza  </a>
    						<div class="nav-collapse collapse pull-right">
    							<ul class="nav">
    								<li class="active">
                                        <form method="post" action="/logout">
    									 <input type="submit" class="btn btn-success" value="Logout">  
                                        </form>
    								</li>
    								
    							</ul>
    						</div>
    						<!--/.nav-collapse --> </div>
    					</div>
    				</div>
    			</div><!-- /.container -->
    		</header>


    		<section id="contact" class="fill">
    			<div class="container">
    				<div class="wrapper">
    					<h1 class="the-head">All Orders Placed</h1>
                        <div class="table-responsive">
                        <div class="jumbotron"style="color:#fff; background:rgba(0,0,0,.5)">
                            <table border= "1"class="table"border-radius="10px" padding="15px">
                                <tr>
                                    <th>Order ID</th>
                                    <th>Name</th>
                                    <th>Phone Number</th>
                                    <th>Location</th>
                                    <th>Type</th>
                                    <th>Quantity</th>
                                    <th>Size</th>
                                    <th>Added Toppings</th>
                                    <th>Removed Toppings</th>
                                    <th>Salespoint</th>
                                    <th>Order Time</th>

                                </tr>
                                <c:forEach var="order" items="${orders}">
                                <tr>
                                <td><c:out value="${order.id}"/></td>
                                <td><c:out value="${order.name}"/></td>
                                <td><c:out value="${order.phoneNum}"/></td>
                                <td><c:out value="${order.location}"/></td>
                                <td><c:out value="${order.type}"/></td>
                                <td><c:out value="${order.qty}"/></td>
                                <td><c:out value="${order.size}"/></td>
                                <td><c:out value="${order.addtop}"/></td>
                                <td><c:out value="${order.remtop}"/></td>
                                <td><c:out value="${order.salespoint}"/></td>
                                <td><c:out value="${order.timestamp}"/></td>

                                
                                </tr>
                                </c:forEach>
                            </table>
                        </div>
                    </div>
    					<div class="row-fluid">
    						<div class="span6 offset3">
    						

    	
    						</div><!-- /.span6 -->
    					</div><!-- /.row-fluid -->
    				</div><!-- /.weapper -->
    			</div><!-- /.container -->
    		</section>
    		<!-- /contact section -->


    		<a href="#" class="go-top"><i class="icon-double-angle-up"></i></a> <!-- /.go-top -->

    		<script src="js/vendor/jquery-1.9.1.min.js"></script>
    		<script src="js/vendor/bootstrap.min.js"></script>
    		<script src="js/vendor/bootstrap-scrollspy.js"></script>
    		<script src="js/vendor/jquery.easing-1.3.min.js"></script>
    		<script src="js/vendor/jquery.scrollTo-1.4.3.1-min.js"></script>
    		<script src="js/vendor/vegas/jquery.vegas.js"></script>
    		<script src="js/vendor/sly.min.js"></script>
    		<script src="js/vendor/prettyphoto/js/jquery.prettyPhoto.js"></script>

    		<script src="js/main.js"></script>

    	</body>
    	</html>
