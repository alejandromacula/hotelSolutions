<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
		
	 <%@page import="datos.Habitacion"%>
	 
     <%@include file="/header.jsp" %>
     
     <%@include file="/menuDesplazable.jsp" %>
     
     
      
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT  ( poner el contenido de la pagina ac� )
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          
          <% Habitacion habitacion=(Habitacion)request.getAttribute("habitacion"); %>

	      <BR></BR><BR></BR>          
          <div class="col-md-12">
	                  	  <div class="content-panel">
	                  	  	  <h4><i class="fa fa-angle-right"></i>Habitacion agregada con exito!</h4>
	                  	  	  <hr>
		                      <table class="table">
		                          <thead>
		                          <tr>
		                              <th>Piso</th>
		                              <th>NumeroDeHabitacion</th>
		                              <th>Estado</th>
		                              <th>Ocupada</th>
		                              <th>Observaciones</th>
		                              <th>IdTipoDeHabitacion</th>
		                              <th>Hotel</th>
		                          </tr>
		                          </thead>
		                          <tbody>
		                          <tr>
		                              <td><%= habitacion.getPiso() %></td>
		                              <td><%= habitacion.getNroHab() %></td>
		                              <td><%= habitacion.isEstado() %></td>
		                              <td><%= habitacion.isOcupada() %></td>
		                              <td><%= habitacion.getObservaciones() %></td>
		                              <td><%= habitacion.getTipoDeHabitacion().getIdTipoDeHabitacion() %></td>
		                              <td><%= habitacion.getHotel() %></td>
		                          </tr>
		                          
		                          </tbody>
		                      </table>
	                  	  </div><! --/content-panel -->
	                  </div><!-- /col-md-12 -->
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>