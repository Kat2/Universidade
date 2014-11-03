package bean;

public class Aluno {

	private String matricula;
	private String nome;
	private String email;
	private String curso;
	
	public Aluno() { }
	
	public Aluno(String matricula, String nome, String email, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	

}
