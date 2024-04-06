package a03_lista_parte03_generalizacao;

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
