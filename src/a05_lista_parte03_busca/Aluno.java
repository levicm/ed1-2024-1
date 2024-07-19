package a05_lista_parte03_busca;

public class Aluno {
	String nome;
	String email;
	double mediaGeral;
	String nomeCurso;
	int creditosCursados;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return nome + " (" + email + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Aluno) {
			Aluno outro = (Aluno) obj;
			return this.nome.equals(outro.nome) &&
					this.email.equals(outro.email);
		} else {
			return false;
		}
	}
}
