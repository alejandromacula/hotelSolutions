<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="funciones.Funciones"%>
<%@page import="dao.HabitacionDao"%>
<%@page import="dao.ReservaDao"%>
<%@page import="datos.Reserva"%>
<%@page import="java.util.List"%>
<%@page import="datos.Habitacion"%>
<%@include file="/header.jsp"%>

<%@include file="/menuDesplazable.jsp"%>

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
					<h4 class="mb">
						<i class="fa fa-angle-right"></i> Nueva Reserva
					</h4>

					<form action=" /HotelSolutionsServlet/NuevaReservaController"
						class="form-horizontal style-form" method="get">

						<br> <br> <br>

						<div class="form-group">
							<label class="col-sm-2 col-sm-2 control-label">Datos del
								cliente</label>

							<div class="col-xs-3">

								<div class="input-group">
									<input id="nombreDeUsuario" type="text" name="nombreDeUsuario"
										class="form-control " placeholder="Nombre de usuario...">
									<span class="input-group-btn">
										<button id="buscarUsuario" class="btn btn-default"
											type="button">Buscar</button>
									</span>
								</div>
								<!-- /input-group -->
							</div>
							<!-- /.col-xs-2 -->
							<div id="ResultadoBusquedaUsuario" style="padding-top: 7px;font-weight: 700;"></div>
						</div>

						<div class="form-group">

							<label class="col-sm-2 col-sm-2 control-label">Datos de
								la habitación</label>

							<div class="col-xs-2">
								<select name="habitacion" class="form-control">
									<%
										HabitacionDao habDao = new HabitacionDao();
										List<Habitacion> lista = habDao.traerListaHabitacion();
										for (Habitacion habitacion : lista) {
									%>
									<option name="habitacion-seleccion"
										data-nroHab="<%=habitacion.getNroHab()%>"><%=habitacion.getNroHab()%></option>
									<%
										}
									%>
								</select>
							</div>
							<div id="ResultadoBusquedaUsuario"></div>
						</div>

						<div class="row form-group">
							<label class="col-sm-2 col-sm-2 control-label">Datos de
								la reserva</label>
							<div class="input-group col-xs-3" style="float: left;padding-left: 15px;padding-right: 15px;width: 23%;">
								<div class="input-group-addon"><i class="glyphicon glyphicon-calendar fa fa-calendar"></i></div>
								<input id="rangoFechas" type="text" class="form-control"
									name="daterange" placeholder="Desde - Hasta" value="" />
							</div>
							
							<div class="input-group col-xs-2 " style="float: left;padding-left: 15px;padding-right: 15px;width: 15%;">
							<div class="input-group-addon">$</div>
								<input type="text" placeholder="Seña" class="form-control"
									name="senia">
							</div>
							<div class="input-group col-xs-2 " style="float: left;padding-left: 15px;padding-right: 15px;width: 15%;">
							<div class="input-group-addon">$</div>
								<input type="text" class="form-control"
									placeholder="Precio final" name="precioFinal">
							</div>
							<div class="col-xs-3">
								<div class="switch switch-square"
									data-on-label="<i class=' fa fa-check'></i>"
									data-off-label="<i class='fa fa-times'></i>">
									<input type="checkbox" unchecked name="confirmada" />
								</div>
								<span style="padding-left: 20px;">Confirmar Reserva</span>

							</div>
						</div>

						<div class="row form-group">
							<label class="col-sm-2 col-sm-2 control-label">Datos
								adicionales</label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3"
									placeholder="Observaciones" name="observaciones"></textarea>
							</div>
						</div>


						<button type="submit" class="btn btn-info">Crear</button>


					</form>
				</div>
			</div>
			<!-- col-lg-12-->
		</div>
		<!-- /row -->

	</section>
	<! --/wrapper -->
</section>
<!-- /MAIN CONTENT -->

<!--main content end-->



<%@include file="/footer.jsp"%>