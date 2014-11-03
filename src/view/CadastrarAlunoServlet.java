package view;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlunoDAO;

import bean.Aluno;

public class CadastrarAlunoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		
		// Busca os parâmetros do request
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String curso = request.getParameter("curso");

		Aluno aluno = new Aluno(matricula, nome, email, curso);

		// Adiciona o aluno ao banco
		AlunoDAO alunoDAO = new AlunoDAO();
		if (alunoDAO.inserir(aluno)) {
			// Se o aluno for inserido com sucesso será redirecionado para a
			// Servlet que lista os alunos
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/ListarAlunosServlet");
			requestDispatcher.forward(request, response);
		} else {
			// Se o aluno não for inserido será redirecionado para a página de erro
			response.sendRedirect("cadastroFalhou.jsp");
		}
	}
}













