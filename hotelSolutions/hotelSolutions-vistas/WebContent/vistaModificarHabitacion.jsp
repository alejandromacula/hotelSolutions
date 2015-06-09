<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
		
	 <%@page import="datos.Habitacion"%>
	 <%@page import="negocio.AdministradorHoteles"%>
	 <%@page import="java.util.GregorianCalendar"%>
	 
     <%@include file="/header.jsp" %>
     
     <%@include file="/menuDesplazable.jsp" %>
     
     
     
      
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT  ( poner el contenido de la pagina acá )
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          
          <% String idHabitacion =  request.getParameter( "idHabitacion" ); %>
		  <% AdministradorHoteles admhoteles=new AdministradorHoteles(); %>
		  <% Habitacion habitacion=admhoteles.traerHabitacion( Integer.parseInt(idHabitacion)); %>


	      <BR></BR><BR></BR>  
	      
	      	<div class="row mt">
          		<div class="col-lg-12">
                  <div class="form-panel">
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Modificar habitacion </h4>
                  	 
                     
                      <form action=" /HotelSolutionsServlet/ModificarHabitacionController" class="form-horizontal style-form" method="post">
                          
                          <br> <br> <br>
                          
                          
                           <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">ID</label>

							<div class="col-xs-1">
									<input id="idHabitacion" type="text" name="idHabitacion"
										class="form-control " placeholder="ID..." value="<%= habitacion.getIdHabitacion() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                          
                          
                          
                          
                          <div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">Piso</label>
		
									<div class="col-xs-2">
											<input id="piso" type="text" name="piso"
												class="form-control " placeholder="Número de piso..." value="<%= habitacion.getPiso() %>">
									</div>
									<!-- /.col-xs-2 -->
									
								</div>    
								
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">Número de habitación</label>
		
									<div class="col-xs-2">
											<input id="nroHab" type="text" name="nroHab"
												class="form-control " placeholder="N° de habitación..." value="<%= habitacion.getNroHab() %>">
									</div>
									<!-- /.col-xs-2 -->
									
								</div>    
								
								
						 Estado:	            <input type="checkbox" value="true"  name="estado" value="<%= habitacion.isEstado() %>"><br><br>
                         Ocupada:			    <input type="checkbox" value="true" name="ocupada" value="<%= habitacion.isOcupada() %>"><br><br>
                              
                              
                                 
                                 <div class="row form-group">
									<label class="col-sm-2 col-sm-2 control-label">Datos
										adicionales</label>
									<div class="col-sm-10">
										<textarea class="form-control" rows="3"
											placeholder="Observaciones" name="observaciones"><%= habitacion.getObservaciones() %></textarea>
									</div>
								</div>
                                 
                                 
                                 <div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">Tipo de habitación</label>
		
									<div class="col-xs-2">
											<input id="idTipoDeHabitacion" type="text" name="idTipoDeHabitacion"
												class="form-control " placeholder="Tipo de habitación..." value="<%= habitacion.getTipoDeHabitacion().getIdTipoDeHabitacion() %>">
									</div>
									<!-- /.col-xs-2 -->
									
								</div>    
                                 
                              
                              	<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">Hotel</label>
		
									<div class="col-xs-1">
											<input id="hotel" type="text" name="hotel"
												class="form-control " placeholder="ID..." value="<%= habitacion.getHotel().getIdHotel() %>">
									</div>
									<!-- /.col-xs-2 -->
									
								</div>    
                                 
                              <button style:" type="submit" class="btn btn-info">Aplicar cambios</button>
                       
						</form>
                          	
                          	</div>  
  	                  	  </div> <!--/content-panel -->
	                  </div><!-- /col-md-12 -->
			
		</section> <!--/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>