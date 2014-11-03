package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Aluno;

/*
 * Classe que acessa os dados da tabela de Aluno
 */
public class AlunoDAO {

	public boolean inserir(Aluno aluno)
	{
		try {
		
			// SQL que será executado
			String sql = "INSERT INTO ALUNO (matricula, nome, email, curso) " +
			"VALUES (?, ?, ?, ?)";
			// Obtendo um PreparedStatement a partir de uma conexão	
			PreparedStatement pstmt = Conexao.getConexao().prepareStatement(sql);
			// Setando as variáveis
			pstmt.setString(1, aluno.getMatricula());
			pstmt.setString(2, aluno.getNome());
			pstmt.setString(3, aluno.getEmail());
			pstmt.setString(4, aluno.getCurso());
			// Executando o PreparedStatement
			pstmt.executeUpdate();
			// Fechando o PreparedStatement
			pstmt.close();
			
			return true;
		
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Aluno> buscarPorNome(String nome)
	{
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			// SQL que será executado
			String sql = "SELECT * FROM aluno WHERE nome LIKE ?";
			// Obtendo um PreparedStatement a partir de uma conexão	
			PreparedStatement pstmt = Conexao.getConexao().prepareStatement(sql);
			// Setando as variáveis
			pstmt.setString(1, "%"+nome+"%");
			// Recuperando os dados
			ResultSet rs = pstmt.executeQuery();
			// Percorrento o ResultSet
			while(rs.next()){
				Aluno aluno = new Aluno();
				// Faz a leitura dos dados da linha
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setNome(rs.getString("nome"));
				aluno.setEmail(rs.getString("email"));
				aluno.setCurso(rs.getString("curso"));
				alunos.add(aluno);
			}
			// Fechando o PreparedStatement
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alunos;
	}
	
	public List<Aluno> buscarPorCurso(String curso)
	{
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			// SQL que será executado
			String sql = "SELECT * FROM aluno WHERE curso LIKE ?";
			// Obtendo um PreparedStatement a partir de uma conexão	
			PreparedStatement pstmt = Conexao.getConexao().prepareStatement(sql);
			// Setando as variáveis
			pstmt.setString(1, "%"+curso+"%");
			// Recuperando os dados
			ResultSet rs = pstmt.executeQuery();
			// Percorrento o ResultSet
			while(rs.next()){
				Aluno aluno = new Aluno();
				// Faz a leitura dos dados da linha
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setNome(rs.getString("nome"));
				aluno.setEmail(rs.getString("email"));
				aluno.setCurso(rs.getString("curso"));
				alunos.add(aluno);
			}
			// Fechando o PreparedStatement
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alunos;
	}
	
	public boolean editar(Aluno aluno)
	{
		try {

			// SQL que será executado
			String sql = "UPDATE aluno SET nome = ?, email = ?, curso = ? WHERE matricula = ?";
			// Obtendo um PreparedStatement a partir de uma conexão
			PreparedStatement pstmt = Conexao.getConexao().prepareStatement(sql);
			// Setando as variáveis
			pstmt.setString(1, aluno.getNome());
			pstmt.setString(2, aluno.getEmail());
			pstmt.setString(3, aluno.getCurso());
			pstmt.setString(4, aluno.getMatricula());
			// Executando o PreparedStatement
			pstmt.executeUpdate();
			// Fechando o PreparedStatement
			pstmt.close();
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Aluno> listar()
	{
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			// Obtendo um Statement a partir de uma conexão		
			Statement stmt = Conexao.getConexao().createStatement( );
			// SQL que será executado
			String command = "SELECT * FROM aluno";
			// Recuperando os dados
			ResultSet rs = stmt.executeQuery(command);
			// Percorrento o ResultSet
			while(rs.next()){
				Aluno aluno = new Aluno();
				// Faz a leitura dos dados da linha
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setNome(rs.getString("nome"));
				aluno.setEmail(rs.getString("email"));
				aluno.setCurso(rs.getString("curso"));
				alunos.add(aluno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alunos;
	}
	
	public boolean remover(Long matricula)
	{
		try {
			// SQL que será executado
			String sql = "DELETE FROM aluno WHERE matricula = ?";
			// Obtendo um PreparedStatement a partir de uma conexão
			PreparedStatement pstmt = Conexao.getConexao().prepareStatement(sql);
			// Setando as variáveis
			pstmt.setLong(1, matricula);
			// Executando o PreparedStatement
			pstmt.executeUpdate(sql);
			// Fechando o PreparedStatement
			pstmt.close();
			
			return true;
		
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
