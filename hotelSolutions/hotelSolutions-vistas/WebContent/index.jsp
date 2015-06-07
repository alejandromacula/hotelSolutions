<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     <%@page import="funciones.Funciones"%>
     <%@page import="dao.HabitacionDao"%>
     <%@page import="dao.ReservaDao"%>
     <%@page import="java.util.List"%>
     <%@page import="datos.Habitacion"%>
     <%@page import="datos.Reserva"%>
     <%@page import="java.util.GregorianCalendar"%>
     <%@include file="/header.jsp" %>
     
     <%@include file="/menuDesplazable.jsp" %>
     
     
      
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT  ( poner el contenido de la pagina acá )
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          
          <!-- incluir aca si hay un jsp -->
          
          	<div class="row mt">
          		<div class="col-lg-12">
          		

				
                          <div class="btn-group">
						  <button type="button" class="btn btn-theme dropdown-toggle" data-toggle="dropdown">Mes<span class="caret"></span>
						  </button>
						  <ul id= "seleccionarmes" class="dropdown-menu" role="menu">
						    <li data-value="1" data-nombre = "Enero"><a>Enero</a></li>
						    <li data-value='2' data-nombre = "Febrero"><a>Febrero</a></li>
						    <li data-value='3' data-nombre = "Marzo"><a>Marzo</a></li>
						    <li data-value='4' data-nombre = "Abril"><a>Abril</a></li>
						    <li data-value='5' data-nombre = "Mayo"><a>Mayo</a></li>
						    <li data-value='6' data-nombre = "Junio"><a>Junio</a></li>
						    <li data-value='7' data-nombre = "Julio"><a>Julio</a></li>
						    <li data-value='8' data-nombre = "Agosto"><a>Agosto</a></li>
						    <li data-value='9' data-nombre = "Septiembre"><a>Septiembre</a></li>
						    <li data-value='10'data-nombre = "Octubre"><a>Octubre</a></li>
						    <li data-value='11'data-nombre = "Noviembre"><a>Noviembre</a></li>
						    <li data-value='12'data-nombre = "Diciembre"><a>Diciembre</a></li>
						  </ul>
						</div>
						
						<div id="nombreMesSeleccionado" style="
							    color: rgb(104, 223, 240);
							    font-size: 55px;
							    text-align: center;
							    font-weight: 500;
						">Enero</div>
						<div id="grillaReservas"></div>
                         
                         

          		</div>
          	</div>
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
       
       
       <%@include file="/footer.jsp" %>