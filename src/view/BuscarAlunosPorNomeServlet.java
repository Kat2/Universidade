package view;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Aluno;
import dao.AlunoDAO;

public class BuscarAlunosPorNomeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		
		// Busca o parâmetro nome do aluno no request
		String nome = request.getParameter("nome");
		
		// Busca o aluno pelo nome
		AlunoDAO alunoDAO = new AlunoDAO();		
		List<Aluno> alunos = alunoDAO.buscarPorNome(nome);
		
		// Adiciona a lista de alunos na requisição
		request.setAttribute("alunos", alunos);
		
		// Obtendo o RequestDispatcher para o Servlet que lista os alunos
		RequestDispatcher requestDispatcher = 
			request.getRequestDispatcher("/ListarAlunosServlet");
		requestDispatcher.forward(request, response);
	}
}