package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Aluno;
import dao.AlunoDAO;

public class ListarAlunosServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		
		// Busca o atributo lista de alunos no request
		List<Aluno> alunos = (List) request.getAttribute("alunos");

		// Se o atributo estiver nulo será listado a partir do banco
		if (alunos == null) {
			AlunoDAO alunoDAO = new AlunoDAO();
			alunos = alunoDAO.listar();
		}
		
		request.setAttribute("alunos", alunos);
		
		// Redireciona para a página que lista os alunos
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("/listarAlunos.jsp");
		requestDispatcher.forward(request, response);
		
	}
}











