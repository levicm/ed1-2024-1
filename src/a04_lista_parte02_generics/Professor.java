package a04_lista_parte02_generics;

public class Professor {
	String nome;
	String email;
	
	public Professor(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return nome + " (" + email + ")";
	}
}
