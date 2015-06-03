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

					<form action=" /HotelSolutionsServlet/MostrarUsuarioServlet"
						class="form-horizontal style-form" method="get">

						<br>
						<br>
						<br> <input class="sr-only" type="text" placeholder=".span1">
						<div class="form-group">
							<label class="col-sm-2 col-sm-2 control-label">Datos del
								Cliente</label>

							<div class="col-xs-3">

								<div class="input-group">
									<input id="nombreDeUsuario" type="text" class="form-control "
										placeholder="Nombre de usuario..."> <span
										class="input-group-btn">
										<button id="buscarUsuario" class="btn btn-default"
											type="button">Buscar</button>
									</span>
								</div>
								<!-- /input-group -->
							</div>
							<!-- /.col-xs-2 -->
							<div id="ResultadoBusquedaUsuario"></div>
						</div>

						<div class="row">
							<label class="col-sm-2 col-sm-2 control-label">Datos de
								la Reserva</label>
							<div class="col-xs-2">
								<input type="text" class="form-control" name="daterange"
									placeholder="Desde - Hasta" value="" name="fechasReservadas" />
							</div>
							<div class="col-xs-2">
								<span class="add-on">$</span> <input type="text"
									placeholder="Seña" class="form-control" name="senia">
							</div>
							<div class="col-xs-2">
								<span class="add-on">$</span> <input type="text"
									class="form-control" placeholder="Precio final"
									name="precioFinal">
							</div>
						</div>
						<div class="form-group">
							<div class="checkbox">
								<label style="padding-left: 222px;"> <input
									type="checkbox" value="" style:"padding-left="222px;"
									name="confirmada"> Confirmar reserva
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<textarea class="form-control" rows="3"
									placeholder="Observaciones" name="observaciones"></textarea>
							</div>
						</div>


						<button style:" type="submit" class="btn btn-info">Consultar</button>


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