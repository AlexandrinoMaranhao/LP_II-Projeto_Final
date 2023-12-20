package poo;

public class PessoaExterna { //implements Participante 
	private String nome;
	private String email;
	private String afiliacaoEmpresa; //opcional
	
	public PessoaExterna(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public PessoaExterna(String nome, String email, String empresa) {
		this.nome = nome;
		this.email = email;
		this.afiliacaoEmpresa = empresa;
	}

	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getAfiliacaoEmpresa() {
		return afiliacaoEmpresa;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAfiliacaoEmpresa(String afiliacaoEmpresa) {
		this.afiliacaoEmpresa = afiliacaoEmpresa;
	}
	
	
}
