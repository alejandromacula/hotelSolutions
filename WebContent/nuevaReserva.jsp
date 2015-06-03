<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page import="funciones.Funciones"%>
     <%@page import="dao.HabitacionDao"%>
     <%@page import="dao.ReservaDao"%>
     <%@page import="datos.Reserva"%>
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
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Nueva Reserva</h4>
                     
                      <form action=" /HotelSolutionsServlet/MostrarUsuarioServlet" class="form-horizontal style-form" method="get">
                          
                          <br><br><br>
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Datos del Cliente</label>
                              
                              <div class="col-lg-6">
							    <div class="input-group">
							      <input id="nombreDeUsuario" type="text" style ="width: 206px;" class="form-control" placeholder="Nombre de usuario...">
							      <span class="input-group-btn">
							        <button id="buscarUsuario" style="margin-right: 276px;" class="btn btn-default" type="button">Buscar</button>
							      </span>
							    </div><!-- /input-group -->
							  </div><!-- /.col-lg-6 -->
							  <div id="ResultadoBusquedaUsuario"></div>
                          </div>
                          
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Datos de la Reserva</label>
                              <div style ="padding-left: 0px;"  class="col-sm-10">
                                  <input type="text" style="width: 15%;margin-right: 100px;" placeholder="Seña" class="form-control" name="senia">
                                  <input type="text" style="width: 15%;margin-right: 100px; display: initial;" class="form-control"  placeholder="Precio final" name="precioFinal">
                         	  	  <input type="text" style="width: 20%;margin-right: 100px; display: initial;" class="form-control" name="daterange" placeholder="Desde - Hasta" value="" name="fechasReservadas"/>
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