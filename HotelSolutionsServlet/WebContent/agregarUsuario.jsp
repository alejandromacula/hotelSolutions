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
                     
                      <form action=" /HotelSolutionsServlet/AgregarUsuarioController" class="form-horizontal style-form" method="get">
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label"></label>
                              <div class="col-sm-10">
                              			

                         Nombre de usuario: <input type="text" class="form-control" name="nombreDeUsuario">
                         Password:		    <input type="text" class="form-control" name="password">
                         Nombre:	        <input type="text" class="form-control" name="nombre">
                         Apellido:			<input type="text" class="form-control" name="apellido">
                         DNI:				<input type="text" class="form-control" name="dni">
                         Dirección:         <input type="text" class="form-control" name="direccion">
                         Numero de calle:   <input type="text" class="form-control" name="numero">
                         Puerta:	        <input type="text" class="form-control" name="puerta">
                         Telefono:	        <input type="text" class="form-control" name="telefono">
                         E-mail:	        <input type="text" class="form-control" name="email">
                         Fecha de nacimiento:       <input type="text" class="form-control" name="diaNacimiento" style="width: 45px;">
                                  					<input type="text" class="form-control" name="mesNacimiento" style="width: 45px;">
                                  					<input type="text" class="form-control" name="anioNacimiento" style="width: 85px;">
                         Tipo de usuario:         <input type="text" class="form-control" name="tipoDeUsuario">
                         Localidad:         <input type="text" class="form-control" name="localidad">
                         Sexo:         <input type="text" class="form-control" name="sexo">
                              </div>
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