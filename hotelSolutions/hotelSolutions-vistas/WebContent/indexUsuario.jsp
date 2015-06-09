<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="dao.TipoDeHabitacionDao"%>
<%@page import="datos.TipoDeHabitacion"%>
<%@page import="java.util.List"%>

<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>hotel Solutions</title>
<link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Pinyon+Script' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Quicksand:400,700' rel='stylesheet' type='text/css'>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css'/>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<script src="js/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<!--header starts-->
<div class="header">
	 <div class="top-header">
		 <div class="container">
			 <div class="top-menu">
		      	<ul class="nav pull-right top-menu">
		              <li><a class="logout" href="login.html">Login</a></li>
            		  <li><a class="logout" href="/HotelSolutionsServlet/Logout">Logout</a></li>
		      	</ul>
      		</div>
			 <span class="menu"> </span>
			 <div class="m-clear"></div>
			 <div class="top-menu">
				<script>
					$("span.menu").click(function(){
						$(".top-menu ul").slideToggle(200);
					});
				</script>
			 </div>
			 <div class="clearfix"></div>
		  </div>
	  </div>
	  <div class="banner" style="background-color: #676767;">
			<div class="banner-info text-center">
			<h1>HOTEL SOLUTIONS</h1>
			<span></span>
			<ul>
			 <li><a class="scroll" href="#">HOTEL</a><i class="line"></i></li>
			 <li><a class="scroll" href="#">SPA</a><i class="line2"></i></li>
			 <li><a class="scroll" href="#">RESTAURANTE</a></li>
			 <div class="clearfix"></div>
			</ul>
			</div>
	  </div>
</div>
<!---strat-date-piker---->
<link rel="stylesheet" href="css/jquery-ui.css" />
<script src="js/jquery-ui.js"></script>
		  <script>
				  $(function() {
				    $( "#desde,#hasta" ).datepicker();
				  });
		  </script>
<!---/End-date-piker---->
<link type="text/css" rel="stylesheet" href="css/JFGrid.css" />
<link type="text/css" rel="stylesheet" href="css/JFFormStyle-1.css" />
<script type="text/javascript" src="js/JFCore.js"></script>
<script type="text/javascript" src="js/JFForms.js"></script>
<!-- Set here the key for your domain in order to hide the watermark on the web server -->
<script type="text/javascript">
	(function() {
		JC.init({
			domainKey: ''
		});
	})();
</script>
<div class="online_reservation">
		   <div class="b_room">
			  <div class="booking_room">
			  <form>
				  <div class="reservation">
					  <ul>		
						 <li  class="span1_of_1 left">
							 <h5>Desde</h5>
							 <div class="book_date">
								 
								 <input name="desde" placeholder="desde" class="date" id="desde" type="text" onfocus="this.value = '';" >
								 
							 </div>					
						 </li>						 
						 <li  class="span1_of_1 left">
							 <h5>Hasta</h5>
							 <div class="book_date">
							 
								<input name="hasta" placeholder="hasta" class="date" id="hasta" type="text"  onfocus="this.value = '';" >
							 
						     </div>		
						 </li>
						 <li class="span1_of_1">
							 <h5>Tipo de Habitacion</h5>
							 <!----------start section_room----------->
							 
							 <div class="section_room">
							      <select name="tipoHabitacion" id="tipoHabitacion"  class="frm-field required">
							 
							 <%
							 TipoDeHabitacionDao  tipoHabDao = new TipoDeHabitacionDao();
							 List<TipoDeHabitacion> lista=tipoHabDao.traerListaTipoDeHabitacion();
							 for (TipoDeHabitacion tipoHabitacion : lista) {
							 %>
							 
							 		<option value="<%= tipoHabitacion.getTipo() %>"><%= tipoHabitacion.getTipo() %></option>
							<%
								}
						 	%>
										
							      </select>
							 </div>	
						 </li>
						 <li class="span1_of_3">
								<div class="date_btn">
										<a id="boton" href="javascript:;" Style=" background-color: #FFD71B; border-color: #FFD71B;  font-size: small;" 
										class="btn btn-info">Consultar Disponibilidad</a>
									</form>
								</div>
						 </li>
						 <div class="clearfix"></div>
					 </ul>
				 </div>
			  </div>
				<div class="clearfix"></div>
		  </div>
	  </div>
</div>

<!-- Small modal -->

<div class="modal fade bs-example-modal-sm"  id="myModal" >
  <div class="modal-dialog modal-sm">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">Consulta de disponibilidad</h4>
      </div>
      <div class="modal-body">
        <p id="resultadoConsulta"></p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!---->

<div class="package text-center">
	 <div class="container">
	 	 <br><br><br>
		 <h3>Nuestro Hotel</h3>
		 <p>Asomado al majestuoso Lago Nahuel Huapi, este dinámico hotel en constante expansión es 
		 la mejor opción para disfrutar del ski y la nieve durante el invierno y de la imponente 
		 naturaleza de la región durante el resto del año. El Hotel Panamericano Bariloche acoge 
		 a sus huéspedes brindándoles una cálida atención personalizada y posee la infraestructura 
		 apropiada para recibir tanto al turista como al hombre de negocios. Una ubicación privilegiada 
		 en el centro de esta emblemática ciudad de la Patagonia, destino que atrae tanto por la 
		 variedad de sus programas como por la belleza de sus paisajes que el viajero podrá comenzar a 
		 disfrutar con solo asomarse a la ventana de su habitación....</p>
		<!-- requried-jsfiles-for owl -->
				<link href="css/owl.carousel.css" rel="stylesheet">
							    <script src="js/owl.carousel.js"></script>
							        <script>
							    $(document).ready(function() {
							      $("#owl-demo").owlCarousel({
							        items : 1,
							        lazyLoad : true,
							        autoPlay : true,
							        navigation : true,
							        navigationText :  false,
							        pagination : false,
							      });
							    });
							    </script>
			<!-- //requried-jsfiles-for owl -->
		  <div id="owl-demo" class="owl-carousel">
			  <div class="item text-center image-grid">	
					<ul>
					 <li><img src="images/1.jpg" alt=""></li>			    
					 <li><img src="images/2.jpg" alt=""></li>				 
					 <li><img src="images/3.jpg" alt=""></li>
					 </ul>
			  </div>
			  <div class="item text-center image-grid">	
					<ul>
					<li> <img src="images/3.jpg" alt=""></li>			    
					 <li><img src="images/4.jpg" alt=""></li>				 
					 <li><img src="images/5.jpg" alt=""></li>
					 </ul>
			  </div>
			  <div class="item text-center image-grid">	
					<ul>
					<li> <img src="images/6.jpg" alt=""></li>			    
					 <li><img src="images/2.jpg" alt=""></li>				 
					 <li><img src="images/8.jpg" alt=""></li>
					 </ul>
			  </div>
		  </div> 		
	 </div>
</div>
<!---->
<!---->
<div class="rooms text-center">
	 <div class="container">
		 <h3>Nuestros Tipos De Habitaciones</h3>
		 <div class="room-grids">
			 <div class="col-md-4 room-sec">
				 <img src="images/pic1.jpg" alt=""/>
				 <h4>Habitacion Doble Standart</h4>
				 <p>totalmente remodeladas y ambientadas con los materiales y texturas naturales típicas de la Patagonia.
				   24 metros cuadrados de máxima comodidad y calidez que cada uno de nosotros necesita. </p>
				 <div class="items">
					 <li><a href="#"><span class="img1"> </span></a></li>
					 <li><a href="#"><span class="img2"> </span></a></li>
					 <li><a href="#"><span class="img3"> </span></a></li>
					 <li><a href="#"><span class="img4"> </span></a></li>
					 <li><a href="#"><span class="img5"> </span></a></li>
					 <li><a href="#"><span class="img6"> </span></a></li>
				 </div>
			 </div>
			 <div class="col-md-4 room-sec">
				 <img src="images/pic2.jpg" alt=""/>
				 <h4>Habitacion Doble Superior</h4>
				 <p>Ambientadas y redecoradas con materiales y texturas naturales típicas de la zona en 28 metros cuadrados
				  del confort que nos caracteriza. </p>
				 <div class="items">					
					 <li><a href="#"><span class="img1"> </span></a></li>
					 <li><a href="#"><span class="img2"> </span></a></li>
					 <li><a href="#"><span class="img3"> </span></a></li>
					 <li><a href="#"><span class="img4"> </span></a></li>
					 <li><a href="#"><span class="img5"> </span></a></li>
					 <li><a href="#"><span class="img6"> </span></a></li>
				 </div>
			 </div>
			 <div class="col-md-4 room-sec">
				 <img src="images/pic3.jpg" alt=""/>
				 <h4>Habitacion Triple</h4>
				 <p>Compuesta por 27 metros cuadrados de máxima comodidad y calidez que cada uno de los visitantes necesita.</p>
				 <div class="items">
					 <li><a href="#"><span class="img1"> </span></a></li>
					 <li><a href="#"><span class="img2"> </span></a></li>
					 <li><a href="#"><span class="img3"> </span></a></li>
					 <li><a href="#"><span class="img4"> </span></a></li>
					 <li><a href="#"><span class="img5"> </span></a></li>
					 <li><a href="#"><span class="img6"> </span></a></li>
				 </div>
			 </div>
			 <div class="clearfix"></div>
			 <div class="col-md-4 room-sec">
				 <img src="images/pic4.jpg" alt=""/>
				 <h4>Habitacion Cuadruple</h4>
				 <p>Habitacion familiar muy amplia. Cuenta con dos camas queen size y baño dispuesto en 28 metros
				  cuadrados de experiencia y tradición.</p>
				 <div class="items">
					 <li><a href="#"><span class="img1"> </span></a></li>
					 <li><a href="#"><span class="img2"> </span></a></li>
					 <li><a href="#"><span class="img3"> </span></a></li>
					 <li><a href="#"><span class="img4"> </span></a></li>
					 <li><a href="#"><span class="img5"> </span></a></li>
					 <li><a href="#"><span class="img6"> </span></a></li>
				 </div>
			 </div>
			 <div class="col-md-4 room-sec">
				 <img src="images/pic5.jpg" alt=""/>
				 <h4>Habitacion Quintuple</h4>
				 <p>Nuestro exclusivo departamento de 42 metros cuadrados ha sido remodelado con  los materiales 
				 y texturas naturales típicas de la Patagonia, para que tu experiencia en Panamericano se componga 
				 de la calidez y sensación de nuestra región.</p>
				 <div class="items">
					 <li><a href="#"><span class="img1"> </span></a></li>
					 <li><a href="#"><span class="img2"> </span></a></li>
					 <li><a href="#"><span class="img3"> </span></a></li>
					 <li><a href="#"><span class="img4"> </span></a></li>
					 <li><a href="#"><span class="img5"> </span></a></li>
					 <li><a href="#"><span class="img6"> </span></a></li>
				 </div>
			 </div>
			
			 <div class="clearfix"></div>
		 </div>
	 </div>
</div>

<div class="fotter-info">
	  <div class="container" style="text-align: end;">
			 <div class="hotel-info"proyecto>
				 <h4>Acerca De Este Proyecto</h4>
				 <p> desarrollado por hotel solutions - Universidad Nacional de Lanus - OO2</p>
				 </div>
			 <img src="images/LogoUNLa.png" alt="" style="width: 100px;height: 100px;"/>
				<div class="clearfix"></div>
		 
			 </div>
			 <div class="clearfix"></div>
		 </div>
		 <div class="clearfix"></div>
	  </div>
</div>
<!---->


<script type="text/javascript" src="assets/js/vistaUsuario.js" ></script>

</body>
</html>