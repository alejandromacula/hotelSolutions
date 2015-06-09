 <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
      <!--sidebar start-->
      <%@page import="datos.Usuario"%>
      <% 
			HttpSession sessionPanel= (HttpSession) request.getSession();
			Usuario us=null;
			us=(Usuario)sessionPanel.getAttribute("usuario"); 
			String nombre="";
			String apellido="";
			if(us!=null){
				nombre=us.getNombre();
				apellido=us.getApellido();
			}
				
		%> 
      
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
              
              	  <p class="centered"><a href="#"><img src="assets/img/business-man-icon.jpg" class="img-circle" width="60"></a></p>
              	  <h5 class="centered"><%= nombre %> <%= apellido %></h5>
              	  	
                  <li class="mt">
                      <a class="active" href="index.jsp">
                          <i class="fa fa-dashboard"></i>
                          <span>Inicio</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-desktop"></i>
                          <span>Usuarios</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="consultarUsuario.jsp">Consultar</a></li>
                          <li><a  href="agregarUsuario.jsp">Nuevo</a></li>
                          <li><a  href="modificarUsuario.jsp">Modificar</a></li>
                          <li><a  href="eliminarUsuario.jsp">Eliminar</a></li>
                      </ul>
                  </li>
                  
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-desktop"></i>
                          <span>Habitaciones</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="consultarHabitacion.jsp">Consultar</a></li>
                          <li><a  href="agregarHabitacion.jsp">Nueva</a></li>
                          <li><a  href="modificarHabitacion.jsp">Modificar</a></li>
                          <li><a  href="eliminarHabitacion.jsp">Eliminar</a></li>
                      </ul>
                  </li>

				  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-desktop"></i>
                          <span>Reservas</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="consultarReserva.jsp">Consultar</a></li>
                          <li><a  href="nuevaReserva.jsp">Nueva</a></li>
                          <li><a  href="modificarReserva.jsp">Modificar</a></li>
                          <li><a  href="eliminarReserva.jsp">Eliminar</a></li>
                      </ul>
                  </li>
					
                  <li class="sub-menu">
                      <a href="estadisticas.jsp" >
                          <i class=" fa fa-bar-chart-o"></i>
                          <span>Estadísticas</span>
                      </a>
                  </li>

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->