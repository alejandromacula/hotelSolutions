package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datos.Reserva;
import dao.ReservaDao;


public class EliminarReservaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init() throws ServletException {
		// Servlet initialization code here
		super.init();
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
	procesarPeticion( request, response);
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
		procesarPeticion( request, response);
	}
	
	
	private void procesarPeticion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
			try {
				String idReserva =  request.getParameter( "idReserva" );
				
				ReservaDao resXidReserva = new ReservaDao();
				Reserva resEliminar = resXidReserva.traerReserva(Integer.parseInt(idReserva));
				
				
				    ReservaDao resDao=new ReservaDao();
				    resDao.eliminarReserva(resEliminar);


				    request.getRequestDispatcher("/vistaReservaEliminada.jsp").forward(request ,
				    response);
			} catch (
			Exception e) {
				response.sendRedirect("500.html");
			}
			}
	
	
	
	@Override
	public void destroy() {
		// resource release
		super.destroy();
	}
}