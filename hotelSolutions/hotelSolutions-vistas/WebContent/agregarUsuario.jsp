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
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Agregar Usuario</h4>
                     
                      <form action=" /HotelSolutionsServlet/AgregarUsuarioController" class="form-horizontal style-form" method="post">
                           <br> <br> <br>
                      
                      
                        
						 <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Nombre de usuario</label>

							<div class="col-xs-2">
									<input id="nombreDeUsuario" type="text" name="nombreDeUsuario"
										class="form-control " placeholder="Nombre de usuario..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
						
						
						<div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Password</label>

							<div class="col-xs-2">
									<input id="password" type="text" name="password"
										class="form-control " placeholder="Password..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
						
                        
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Nombre</label>

							<div class="col-xs-2">
									<input id="nombre" type="text" name="nombre"
										class="form-control " placeholder="Nombre..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                               
                               
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Apellido</label>

							<div class="col-xs-2">
									<input id="apellido" type="text" name="apellido"
										class="form-control " placeholder="Apellido..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                               
                               
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">DNI</label>

							<div class="col-xs-2">
									<input id="dni" type="text" name="dni"
										class="form-control " placeholder="DNI..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div> 
                               
                             
                            <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Dirección</label>

							<div class="col-xs-2">
									<input id="direccion" type="text" name="direccion"
										class="form-control " placeholder="Dirección..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>   
                               
                        
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Numero de calle</label>

							<div class="col-xs-2">
									<input id="numero" type="text" name="numero"
										class="form-control " placeholder="N° de calle..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>       
                               
                               
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Puerta</label>

							<div class="col-xs-1">
									<input id="puerta" type="text" name="puerta"
										class="form-control " placeholder="Puerta..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                        
                        
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Telefono</label>

							<div class="col-xs-2">
									<input id="telefono" type="text" name="telefono"
										class="form-control " placeholder="Telefono..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                               
                         
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">E-mail</label>

							<div class="col-xs-3">
									<input id="email" type="text" name="email"
										class="form-control " placeholder="E-mail..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>  
                                  
                        
                          <div class="row form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Fecha de nacimiento</label>

							<div class="col-xs-1">
									<input id="diaNacimiento" type="text" name="diaNacimiento"
										class="form-control " placeholder="Día..." >
							</div>
							
							<div class="col-xs-1">
									<input id="mesNacimiento" type="text" name="mesNacimiento"
										class="form-control " placeholder="Mes..." >
							</div>
								
							<div class="col-xs-1">
									<input id="anioNacimiento" type="text" name="anioNacimiento"
										class="form-control " placeholder="Año..." >
							</div>
							
						</div>
                        
                        
                        <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Sexo</label>

							<div class="col-xs-1">
									<input id="sexo" type="text" name="sexo"
										class="form-control " placeholder="Sexo..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>  
						
						
						<div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Tipo de Usuario</label>

							<div class="col-xs-2">
									<input id="tipoDeUsuario" type="text" name="tipoDeUsuario"
										class="form-control " placeholder="ID de tipo de Usuario..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>  
						
						
						<div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Localidad</label>

							<div class="col-xs-2">
									<input id="localidad" type="text" name="localidad"
										class="form-control " placeholder="ID de localidad..." >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>  
       
                         

                          
                          <button style:" type="submit" class="btn btn-info">Dar de Alta</button>
                        
                          
                      </form>
                  </div>
          		</div><!-- col-lg-12-->      	
          	</div><!-- /row -->
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>