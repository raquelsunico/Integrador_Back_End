package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Persona;
import modelo.PersonaDAO;


@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	PersonaDAO dao=new PersonaDAO();
	Persona p=new Persona();
	int r;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion=request.getParameter("accion");
		if(accion.equals("Ingresar")) {
		String nombres=request.getParameter("txtnom");
		String email=request.getParameter("txtemail");
		p.setNombres(nombres);
		p.setEmail(email);
		r=dao.validar(p);
		if(r==1) {
			request.getSession().setAttribute("nombres",nombres);
			request.getSession().setAttribute("email", email);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}else {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}