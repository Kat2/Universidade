package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Classe que cria a conex�o com o banco de dados
 */
public class Conexao {
	
	public static Connection getConexao()
	{
		Connection connection = null;
		try {
			// Registrando o driver utilizado para conexão
			Class.forName("org.hsqldb.jdbcDriver");
			// URL de conexão
			String url = "jdbc:hsqldb:hsql://localhost/";
			// Abrindo uma conexão
			connection = DriverManager.getConnection(url, "sa","");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return connection;
	}
}
