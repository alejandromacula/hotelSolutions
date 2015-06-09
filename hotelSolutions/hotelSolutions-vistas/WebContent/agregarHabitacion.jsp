<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Agregar Habitacion</h4>
                     
                      <form action=" /HotelSolutionsServlet/AgregarHabitacionController" class="form-horizontal style-form" method="post">
                          
                          <br>
                                                   
                              
		                          <div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">Piso</label>
		
									<div class="col-xs-2">
											<input id="piso" type="text" name="piso"
												class="form-control " placeholder="Número de piso...">
									</div>
									<!-- /.col-xs-2 -->
									
								</div>    
								
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">Número de habitación</label>
		
									<div class="col-xs-2">
											<input id="nroHab" type="text" name="nroHab"
												class="form-control " placeholder="N° de habitación...">
									</div>
									<!-- /.col-xs-2 -->
									
								</div>    
								
								
						 Estado:	            <input type="checkbox" value="true"  name="estado"><br><br>
                         Ocupada:			    <input type="checkbox" value="true" name="ocupada"><br><br>
                              
                              
                                 
                                 <div class="row form-group">
									<label class="col-sm-2 col-sm-2 control-label">Datos
										adicionales</label>
									<div class="col-sm-10">
										<textarea class="form-control" rows="3"
											placeholder="Observaciones" name="observaciones"></textarea>
									</div>
								</div>
                                 
                                 
                                 <div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">Tipo de habitación</label>
		
									<div class="col-xs-2">
											<input id="idTipoDeHabitacion" type="text" name="idTipoDeHabitacion"
												class="form-control " placeholder="Tipo de habitación...">
									</div>
									<!-- /.col-xs-2 -->
									
								</div>    
                                   
                                 
                              <button style:" type="submit" class="btn btn-info">Dar de Alta</button>
                              
                          </div>
                          
                          
                        
                          
                      </form>
                  </div>
          		</div><!-- col-lg-12-->      	
          	</div><!-- /row -->
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>