<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
		
	 <%@page import="datos.Reserva"%>
	 <%@page import="dao.ReservaDao"%>
	 <%@page import="java.util.GregorianCalendar"%>
	 
     <%@include file="/header.jsp" %>
     
     <%@include file="/menuDesplazable.jsp" %>
     
     
     
      
     <!-- **********************************************************************************************************************************************************
      MAIN CONTENT  ( poner el contenido de la pagina acá )
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
          
          <% String idReserva =  request.getParameter( "idReserva" ); %>
		  <% ReservaDao resdao=new ReservaDao(); %>
		  <% Reserva reserva=resdao.traerReserva(Integer.parseInt(idReserva)); %>


	      <BR></BR><BR></BR>  

                                  
            <div class="row mt">
			<div class="col-lg-12">
				<div class="form-panel">
				
				<h4 class="mb"><i class="fa fa-angle-right"></i> Modificar reserva </h4>
					
					<form action=" /HotelSolutionsServlet/ModificarReservaController" class="form-horizontal style-form" method="post">

						<br> <br> <br>

						<div class="form-group">
							<label class="col-sm-2 col-sm-2 control-label">ID</label>

							<div class="col-xs-1">
									<input id="idReserva" type="text" name="idReserva"
										class="form-control " placeholder="ID..." value='<%= reserva.getIdReserva() %>' >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
						
                           <div class="row form-group">
							<label class="col-sm-2 col-sm-2 control-label">Seña</label>
							
							
							<div class="input-group col-xs-2 " style="float: left;padding-left: 15px;padding-right: 50px;width: 15%;">
							<div class="input-group-addon">$</div>
								<input type="text" placeholder="Seña" class="form-control"
									name="senia" value="<%= reserva.getSenia() %>">
							</div>
							
							<label class="col-sm-2 col-sm-2 control-label">Precio final</label>
							<div class="input-group col-xs-2 " style="float: left;padding-left: 15px;padding-right: 50px;width: 15%;">
							<div class="input-group-addon">$</div>
								<input type="text" class="form-control"
									placeholder="Precio final" name="precioFinal" value="<%= reserva.getPrecioFinal() %>">
							</div>
							<div class="col-xs-3">
								<div class="switch switch-square"
									data-on-label="<i class=' fa fa-check'></i>"
									data-off-label="<i class='fa fa-times'></i>">
									<input type="checkbox" unchecked name="confirmada" value="<%= reserva.isConfirmada() %>" />
								</div>
								<span style="padding-left: 20px;">Confirmar Reserva</span>

							</div>
						</div>
                         
                         
            <!--        
            
            
            		 <div class="row form-group">
                         
                         
                         <label class="col-sm-2 col-sm-2 control-label">Fecha</label>
                         <div class="input-group col-xs-3" style="float: left;padding-left: 15px;padding-right: 15px;width: 23%;">
								<div class="input-group-addon"><i class="glyphicon glyphicon-calendar fa fa-calendar"></i></div>
								<input id="Fecha" type="text" class="form-control"
									name="daterange" placeholder="Fecha" value="<%= reserva.getFecha().get(GregorianCalendar.DAY_OF_MONTH) %>/<%= (reserva.getFecha().get(GregorianCalendar.MONTH)+1) %>/<%= reserva.getFecha().get(GregorianCalendar.YEAR) %>" />
							</div>
                         
                         
                         	  <label class="col-sm-2 col-sm-2 control-label">Hasta</label>
                         <div class="input-group col-xs-3" style="float: left;padding-left: 15px;padding-right: 15px;width: 23%;">
								<div class="input-group-addon"><i class="glyphicon glyphicon-calendar fa fa-calendar"></i></div>
								<input id="rangoFechas" type="text" class="form-control"
									name="daterange" placeholder="Desde - Hasta" value="<%= reserva.getDesde().get(GregorianCalendar.DAY_OF_MONTH) %>/<%= (reserva.getDesde().get(GregorianCalendar.MONTH)+1) %>/<%= reserva.getDesde().get(GregorianCalendar.YEAR) %> - <%= reserva.getHasta().get(GregorianCalendar.DAY_OF_MONTH) %>/<%= (reserva.getHasta().get(GregorianCalendar.MONTH)+1) %>/<%= reserva.getHasta().get(GregorianCalendar.YEAR) %> " />
							</div>
  
                         
                         </div>
                         

              -->     
                         
                         
                       <div class="row form-group">
                             

							<label class="col-sm-2 col-sm-2 control-label">Desde</label>

							<div class="col-xs-1">
									<input id="desdeDia" type="text" name="desdeDia"
										class="form-control " placeholder="Día..." value="<%= reserva.getDesde().get(GregorianCalendar.DAY_OF_MONTH) %>">
							</div>
							
							<div class="col-xs-1">
									<input id="desdeMes" type="text" name="desdeMes"
										class="form-control " placeholder="Mes..." value="<%= reserva.getDesde().get(GregorianCalendar.MONTH) %>">
							</div>
								
							<div class="col-xs-1">
									<input id="desdeAnio" type="text" name="desdeAnio"
										class="form-control " placeholder="Año..." value="<%= reserva.getDesde().get(GregorianCalendar.YEAR) %>">
							</div>
						


							<label class="col-sm-2 col-sm-2 control-label">Hasta</label>

							<div class="col-xs-1">
									<input id="hastaDia" type="text" name="hastaDia"
										class="form-control " placeholder="Día..." value="<%= reserva.getHasta().get(GregorianCalendar.DAY_OF_MONTH) %>">
							</div>
							
							<div class="col-xs-1">
									<input id="hastaMes" type="text" name="hastaMes"
										class="form-control " placeholder="Mes..." value="<%= reserva.getHasta().get(GregorianCalendar.MONTH) %>">
							</div>
								
							<div class="col-xs-1">
									<input id="hastaAnio" type="text" name="hastaAnio"
										class="form-control " placeholder="Año..." value="<%= reserva.getHasta().get(GregorianCalendar.YEAR) %>">
							</div>
						

						</div>	
							
							
							
							
                         
           			
                         
   
                         <div class="row form-group">
							<label class="col-sm-2 col-sm-2 control-label">Datos
								adicionales</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3"
									placeholder="Observaciones" name="observaciones"><%= reserva.getObservaciones() %></textarea>
							</div>
						</div>
						
						
						
						<div class="form-group">
							<label class="col-sm-2 col-sm-2 control-label">Habitación</label>

							<div class="col-xs-1">
									<input id="habitacion" type="text" name="habitacion"
										class="form-control " placeholder="ID..." value='<%= reserva.getHabitacion().getIdHabitacion() %>' >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>
						
						
						<div class="form-group">
							<label class="col-sm-2 col-sm-2 control-label">Usuario</label>

							<div class="col-xs-1">
									<input id="usuario" type="text" name="usuario"
										class="form-control " placeholder="ID..." value='<%= reserva.getUsuario().getIdUsuario() %>' >
							</div>
							<!-- /.col-xs-2 -->
							
						</div>


						<button type="submit" class="btn btn-info">Aplicar Cambios</button>

                  
                              
                   </form> 
                      
	
                          	</div>  
  	                  	  </div> <!--/content-panel -->
	                  </div><!-- /col-md-12 -->
			
		</section> <!--/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>