package projeto3a;

public class Medico {
	
	private String nome;
	private String cpf;
	private String especialidade;
	
	public Medico() {
		
	}

	public Medico(String nome, String cpf, String especialidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String toString() {
		return "\nNome: " + nome +"\nCPF: " + cpf +"\nEspecialidade: "+ especialidade +"\n---------------";
	}
	

}
