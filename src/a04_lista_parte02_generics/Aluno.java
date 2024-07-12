package a04_lista_parte02_generics;

public class Aluno {
	String nome;
	String email;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return nome + " (" + email + ")";
	}
}
