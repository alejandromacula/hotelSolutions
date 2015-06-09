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
                  	  <h4 class="mb"><i class="fa fa-angle-right"></i> Buscar Habitación </h4>
                     
                     <br>
                     
                      <form action=" /HotelSolutionsServlet/MostrarHabitacionController" class="form-horizontal style-form" method="post">
                          <div class="form-group">
                              <label class="col-sm-2 col-sm-2 control-label">Habitación a consultar</label>
                              <div class="col-xs-2">
                                 <input type="text" class="form-control" name="idHabitacion" placeholder="numero">
                              </div>
                          </div>
                          
                          <button style:" type="submit" class="btn btn-info">Consultar</button>
                          
                      </form>
                  </div>
          		</div><!-- col-lg-12-->      	
          	</div><!-- /row -->
			
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->

      <!--main content end-->
      
      
       
       <%@include file="/footer.jsp" %>