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
                     
                      <form action=" /HotelSolutionsServlet/AgregarHabitacionController" class="form-horizontal style-form" method="get">
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label"></label>
                              <div class="col-sm-10">
                              			
                         Piso:                  <input type="text" class="form-control" name="piso">
                         Numero de Habitacion:  <input type="text" class="form-control" name="nroHab"><br>
                         Estado:	            <input type="checkbox" value="true" name="estado"><br><br>
                         Ocupada:			    <input type="checkbox" value="true" name="ocupada"><br><br>
                         Observaciones:			<input type="text" class="form-control" name="observaciones">
                         Id Tipo de Habitacion: <input type="text" class="form-control" name="idTipoDeHabitacion">
                         Hotel:                 <input type="text" class="form-control" name="idHotel">
                                                                      
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