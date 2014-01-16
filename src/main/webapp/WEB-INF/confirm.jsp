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

    	


      <section id="contact" class="fill">
       <div class="container">
        <div class="wrapper">
         <h1 class="the-head">Confirm Order</h1>

         <div class="row-fluid">
          <div class="span6 offset3">
           <form class="contact-form" action="/confirm" method ="post">

            <fieldset>
             <h4 style="text-align:center">Your Order Details</h4>
             <p style="text-align:left; font-size:150%;margin:30px">Your Name:&nbsp ${order.name}</p>
             <p style="text-align:left; font-size:150%;margin:30px">Your Phone:&nbsp ${order.phoneNum}</p>
             <p style="text-align:left; font-size:150%;margin:30px">Your Location:&nbsp ${order.location}</p>
             <p style="text-align:left; font-size:150%;margin:30px">Pizza Type:&nbsp ${order.type}</p>
             <p style="text-align:left; font-size:150%;margin:30px">Size:&nbsp ${order.size}</p>
             <p style="text-align:left; font-size:150%;margin:30px">Quantity:&nbsp ${order.qty}</p>
             <p style="text-align:left; font-size:150%;margin:30px">Added Toppings:&nbsp ${order.addtop}</p>
             <p style="text-align:left; font-size:150%;margin:30px">Removed Toppings:&nbsp ${order.remtop}</p>
             <p style="text-align:left; font-size:150%;margin:30px">From:&nbsp Papa's Pizza  ${order.salespoint} Branch</p>
             <p style="text-align:left; font-size:150%;margin:30px">
                Your Total Cost: ${order.price}</p>
                <hr>
                <input type="hidden" name="name"value="${order.name}">
                <input type="hidden" name="phone"value="${order.phoneNum}">
                <input type="hidden" name="location"value="${order.location}">
                <input type="hidden" name="type"value="${order.type}">
                <input type="hidden" name="size"value="${order.size}">
                <input type="hidden" name="quantity"value="${order.qty}">
                <input type="hidden" name="addtop"value="${order.addtop}">
                <input type="hidden" name="remtop"value="${order.remtop}">
                <input type="hidden" name="salespoint"value="${order.salespoint}">
                <input type="hidden" name="price"value="${order.price}">
                <div class="control-group">
                  <a href="/">
                    <input type="submit" class="btn btn-success" name="confirm" value="Confirm">
                </a>
                
                <a href="/" class="btn btn-danger" name="cancel" style="text-decoration:none">Cancel
                </a>
            </div>
        </fieldset>
    </form>

    <div class="social-links">
        <ul>
         <li class="lead">Follow us on : </li>
         <li><a href="https://www.facebook.com/pages/Papas-Pizza-Gh/402174086546362"><i class="icon-facebook-sign"></i></a></li>
         <li><a href="https://twitter.com/PapaspizzaGh"><i class="icon-twitter-sign"></i></a></li> <li class="lead"> You May Win a Pizza</li>

     </ul>
 </div>
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
