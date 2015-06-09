<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
		
	 <%@page import="datos.Usuario"%>
	 <%@page import="negocio.AdministradorUsuarios"%>
	 <%@page import="java.util.GregorianCalendar"%>
	 
     <%@include file="/header.jsp" %>
     
     <%@include file="/menuDesplazable.jsp" %>
     
     
     
      
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT  ( poner el contenido de la pagina acá )
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          
          <% String nombreDeUsuario =  request.getParameter( "nombreDeUsuario" ); %>
		  <% AdministradorUsuarios admusuario=new AdministradorUsuarios(); %>
		  <% Usuario usuario=admusuario.traerUsuario( nombreDeUsuario); %>


	      <BR></BR><BR></BR>  
	      
	      	<div class="row mt">
          		<div class="col-lg-12">
                  <div class="form-panel">
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Modificar usuario </h4>
                  	 
                     
                      <form action=" /HotelSolutionsServlet/ModificarUsuarioController" class="form-horizontal style-form" method="get">
                      
                      	 <br> <br> <br>
                      
                      
                        <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">ID</label>

							<div class="col-xs-1">
									<input id="idUsuario" type="text" name="idUsuario"
										class="form-control " placeholder="ID..." value="<%= usuario.getIdUsuario() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
						
						
						 <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Nombre de usuario</label>

							<div class="col-xs-2">
									<input id="nombreDeUsuario" type="text" name="nombreDeUsuario"
										class="form-control " placeholder="Nombre de usuario..." value="<%= usuario.getNombreDeUsuario() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
						
						
						<div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Password</label>

							<div class="col-xs-2">
									<input id="password" type="text" name="password"
										class="form-control " placeholder="Password..." value="<%= usuario.getPassword() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
						
                        
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Nombre</label>

							<div class="col-xs-2">
									<input id="nombre" type="text" name="nombre"
										class="form-control " placeholder="Nombre..." value="<%= usuario.getNombre() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                               
                               
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Apellido</label>

							<div class="col-xs-2">
									<input id="apellido" type="text" name="apellido"
										class="form-control " placeholder="Apellido..." value="<%= usuario.getApellido() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                               
                               
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">DNI</label>

							<div class="col-xs-2">
									<input id="dni" type="text" name="dni"
										class="form-control " placeholder="DNI..." value="<%= usuario.getDni() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div> 
                               
                             
                            <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Dirección</label>

							<div class="col-xs-2">
									<input id="direccion" type="text" name="direccion"
										class="form-control " placeholder="Dirección..." value="<%= usuario.getDireccion() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>   
                               
                        
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Numero de calle</label>

							<div class="col-xs-2">
									<input id="numero" type="text" name="numero"
										class="form-control " placeholder="N° de calle..." value="<%= usuario.getNumero() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>       
                               
                               
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Puerta</label>

							<div class="col-xs-1">
									<input id="puerta" type="text" name="puerta"
										class="form-control " placeholder="Puerta..." value="<%= usuario.getPuerta() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                        
                        
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Telefono</label>

							<div class="col-xs-2">
									<input id="telefono" type="text" name="telefono"
										class="form-control " placeholder="Telefono..." value="<%= usuario.getTelefono() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
                               
                         
                          <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">E-mail</label>

							<div class="col-xs-3">
									<input id="email" type="text" name="email"
										class="form-control " placeholder="E-mail..." value="<%= usuario.getEmail() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>  
                                  
                        
                          <div class="row form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Fecha de nacimiento</label>

							<div class="col-xs-1">
									<input id="diaNacimiento" type="text" name="diaNacimiento"
										class="form-control " placeholder="Día..." value="<%= usuario.getFechaNacimiento().get(GregorianCalendar.DAY_OF_MONTH) %>" >
							</div>
							
							<div class="col-xs-1">
									<input id="mesNacimiento" type="text" name="mesNacimiento"
										class="form-control " placeholder="Mes..." value="<%= (usuario.getFechaNacimiento().get(GregorianCalendar.MONTH)+1) %>" >
							</div>
								
							<div class="col-xs-1">
									<input id="anioNacimiento" type="text" name="anioNacimiento"
										class="form-control " placeholder="Año..." value="<%= usuario.getFechaNacimiento().get(GregorianCalendar.YEAR) %>" >
							</div>
							
						</div>
                        
                        
                        <div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Sexo</label>

							<div class="col-xs-1">
									<input id="sexo" type="text" name="sexo"
										class="form-control " placeholder="Sexo..." value="<%= usuario.getSexo() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>  
						
						
						<div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Tipo de Usuario</label>

							<div class="col-xs-2">
									<input id="tipoDeUsuario" type="text" name="tipoDeUsuario"
										class="form-control " placeholder="ID de tipo de Usuario..." value="<%= usuario.getTipoDeUsuario().getIdTipoDeUsuario() %>" >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>  
						
						
						<div class="form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Localidad</label>

							<div class="col-xs-2">
									<input id="localidad" type="text" name="localidad"
										class="form-control " placeholder="ID de localidad..." value="<%= usuario.getLocalidad().getIdLocalidad() %>" >
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