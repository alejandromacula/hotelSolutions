<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
		
	 <%@page import="datos.Usuario"%>
	 
     <%@include file="/header.jsp" %>
     
     <%@include file="/menuDesplazable.jsp" %>
     
     
      
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT  ( poner el contenido de la pagina acá )
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          
          <% Usuario usuario=(Usuario)request.getAttribute("usuario"); %>

	      <BR></BR><BR></BR>          
          <div class="col-md-12">
	                  	  <div class="content-panel">
	                  	  	  <h4><i class="fa fa-angle-right"></i>Busqueda de Usuario</h4>
	                  	  	  <hr>
		                      <table class="table">
		                          <thead>
		                          <tr>
		                              <th>Id</th>
		                              <th>Nombre</th>
		                              <th>Apelido</th>
		                              <th>NombreDeUsuario</th>
		                              <th>Dni</th>
		                              <th>Telefono</th>
		                              <th>Sexo</th>
		                              <th>Email</th>
		                              <th>Dirección</th>
		                          </tr>
		                          </thead>
		                          <tbody>
		                          <tr>
		                              <td><%= usuario.getIdUsuario() %></td>
		                              <td><%= usuario.getNombre() %></td>
		                              <td><%= usuario.getApellido() %></td>
		                              <td><%= usuario.getNombreDeUsuario() %></td>
		                              <td><%= usuario.getDni() %></td>
		                              <td><%= usuario.getTelefono() %></td>
		                              <td><%= usuario.getSexo() %></td>
		                              <td><%= usuario.getEmail() %></td>
		                              <td><%= usuario.getDireccion() %> <%= usuario.getNumero() %></td>
		                          </tr>
		                          
		                          </tbody>
		                      </table>
	                  	  </div><! --/content-panel -->
	                  </div><!-- /col-md-12 -->
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>