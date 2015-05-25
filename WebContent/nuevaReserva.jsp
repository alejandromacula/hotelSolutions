<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page import="funciones.Funciones"%>
     <%@page import="dao.HabitacionDao"%>
     <%@page import="java.util.List"%>
     <%@page import="datos.Habitacion"%>
     <%@include file="/header.jsp" %>
  
     <%@include file="/menuDesplazable.jsp" %>
  
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT  ( poner el contenido de la pagina acá )
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          
          <!-- BASIC FORM ELELEMNTS -->
          	<div class="row mt">
          		<div class="col-lg-12">
                  <div class="form-panel">
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Buscar Usuario</h4>
                     
                      <form action=" /HotelSolutionsServlet/MostrarUsuarioServlet" class="form-horizontal style-form" method="get">
                          
                          
                          
                          
                          
                          <div class="btn-group">
						  <button type="button" class="btn btn-theme dropdown-toggle" data-toggle="dropdown">Mes<span class="caret"></span>
						  </button>
						  <ul id= "seleccionarmes" class="dropdown-menu" role="menu">
						    <li data-value="1" ><a>Enero</a></li>
						    <li data-value='2' ><a>Febrero</a></li>
						    <li data-value='3' ><a>Marzo</a></li>
						    <li data-value='4' ><a>Abril</a></li>
						    <li data-value='5' ><a>Mayo</a></li>
						    <li data-value='6' ><a>Junio</a></li>
						    <li data-value='7' ><a>Julio</a></li>
						    <li data-value='8' ><a>Agosto</a></li>
						    <li data-value='9' ><a>Septiembre</a></li>
						    <li data-value='10'><a>Octubre</a></li>
						    <li data-value='11'><a>Noviembre</a></li>
						    <li data-value='12'><a>Diciembre</a></li>
						  </ul>
						</div>
						
						<div id="grillaReservas"></div>
                          
                          
                          <br><br><br>
                          
                          
                          <script>
                          function generarGrilla(mes, anio){
                        		var cantidadDeDias = cantidadDiasMes(mes, anio);
                        		var cabeceraDiasTabla= '<tr>';
                        		cabeceraDiasTabla= cabeceraDiasTabla + '<th> Habitacion </th>';
                        		
                        		for (i = 1; i < cantidadDeDias+1; i++) { 
                        			if(i<10){
                        				cabeceraDiasTabla= cabeceraDiasTabla+'<th> 0'+ i +'</th>';}
                       				else{
                       					cabeceraDiasTabla= cabeceraDiasTabla+'<th>'+ i +'</th>';}
                        		}
                        		
                        		<% HabitacionDao habitacionDao=new HabitacionDao();
	                 			   List<Habitacion> habitaciones=habitacionDao.traerListaHabitacion();
	                 			   int cantidadDeHabitaciones=habitaciones.size();%>
                 			   
	                 			var filasHabitaciones='<tbody><tr/>';
	                 			<% for (Habitacion habitacion:habitaciones){ %>
	                 				  filasHabitaciones= filasHabitaciones+'<tr><td>' + <%= habitacion.getNroHab() %> + '</td>';
	                 				  for (i = 1; i < cantidadDeDias+1; i++) { 
	                 					 filasHabitaciones= filasHabitaciones+'<td> - </td>';
                 					  }
	                 				  filasHabitaciones = filasHabitaciones + '</tr>';
                 				 <%}%>
                        		
                        		cabeceraDiasTabla=cabeceraDiasTabla + '</tr>';
                        		
                        		document.getElementById('grillaReservas').innerHTML = 
                        			'<table class="table table-bordered table-striped table-condensed">'+
                        			'<thead>'+ 
                        			cabeceraDiasTabla +
                        			'</thead>'+
                        			filasHabitaciones+
                        			'</tbody></table>';

                        	}
                          </script>
                          
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label"></label>
                              <div class="col-sm-10">
                                  <input type="text" placeholder="Nombre de usuario" class="form-control" name="nombreDeUsuario">
                              </div>
                          </div>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label"></label>
                              <div class="col-sm-10">
                                  <input type="text" placeholder="Seña" class="form-control" name="senia">
                              </div>
                          </div>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label"></label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control"  placeholder="Precio final" name="precioFinal">
                              </div>
                          </div>
                                            

                          <a id="traerDias" class="btn btn-success  btn-sm" href="javascript:;">traer javascript</a>
                          <div id="mydiv"><span class="prego">Something</span></div>
                          
                          <input type="text" name="daterange" value="" />
 						  <script type="text/javascript">
							$(function() {
							    $('input[name="daterange"]').daterangepicker();
							});
						  </script>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label"></label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control" placeholder="Desde" name="desde">
                              </div>
                          </div>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label"></label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control" placeholder="Hasta" name="hasta">
                              </div>
                          </div>
                          <div class="form-group">
	                          <div class="checkbox">
								  <label style=" padding-left: 222px;">
								    <input type="checkbox" value="" style:"padding-left="222px;" name="confirmada">
								    Confirmar reserva
								  </label>
							 </div>
						 </div>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label"></label>
                              <div class="col-sm-10">
                                  <input type="text" class="form-control" placeholder="Observaciones" name="observaciones">
                              </div>
                          </div>
                          	
                          
                          <button style:" type="submit" class="btn btn-info">Consultar</button>
                        
                          
                      </form>
                  </div>
          		</div><!-- col-lg-12-->      	
          	</div><!-- /row -->
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>