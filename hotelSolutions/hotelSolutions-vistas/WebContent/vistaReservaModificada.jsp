<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
		
	 <%@page import="datos.Reserva"%>
	 <%@page import="datos.Habitacion"%>
	 <%@page import="datos.Usuario"%>
	 <%@page import="java.util.GregorianCalendar"%>
	 
     <%@include file="/header.jsp" %>
     
     <%@include file="/menuDesplazable.jsp" %>
     
     
      
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT  ( poner el contenido de la pagina acá )
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          
          <% Reserva reserva=(Reserva)request.getAttribute("reserva"); %>

	      <BR></BR><BR></BR>          
          <div class="col-md-12">
	                  	  <div class="content-panel">
	                  	  	  <h4><i class="fa fa-angle-right"></i>Reserva modificada con exito!</h4>
	                  	  	  <hr>
		                      <table class="table">
		                          <thead>
		                          <tr>
		                              <th>Id</th>
		                              <th>Seña</th>
		                              <th>Precio final</th>
		                              <th>Desde</th>
		                              <th>Hasta</th>
		                              <th>Confirmada</th>
		                              <th>Fecha</th>
		                              <th>Observaciones</th>
		                              <th>Habitación</th>
		                              <th>Usuario</th>
		                          </tr>
		                          </thead>
		                          <tbody>
		                          <tr>
		                              <td><%= reserva.getIdReserva() %></td>
		                              <td><%= reserva.getSenia() %></td>
		                              <td><%= reserva.getPrecioFinal() %></td>
		                              <td><%= reserva.getDesde().get(GregorianCalendar.DAY_OF_MONTH)%>/<%= (reserva.getDesde().get(GregorianCalendar.MONTH)+1) %>/<%= reserva.getDesde().get(GregorianCalendar.YEAR) %></td>
		                              <td><%= reserva.getHasta().get(GregorianCalendar.DAY_OF_MONTH) %>/<%= (reserva.getHasta().get(GregorianCalendar.MONTH)+1) %>/<%= reserva.getHasta().get(GregorianCalendar.YEAR) %></td>
		                              <td><%= reserva.isConfirmada() %></td>
		                              <td><%= reserva.getFecha().get(GregorianCalendar.DAY_OF_MONTH) %>/<%= (reserva.getFecha().get(GregorianCalendar.MONTH)+1) %>/<%= reserva.getFecha().get(GregorianCalendar.YEAR) %></td>
		                              <td><%= reserva.getObservaciones() %></td>
		                              <td><%= reserva.getHabitacion().getNroHab() %></td>
		                              <td><%= reserva.getUsuario().getNombreDeUsuario() %></td>
		                          </tr>
		                          
		                          </tbody>
		                      </table>
	                  	  </div><! --/content-panel -->
	                  </div><!-- /col-md-12 -->
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>