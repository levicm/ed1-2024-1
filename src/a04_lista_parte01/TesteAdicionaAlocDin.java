package a04_lista_parte01;

public class TesteAdicionaAlocDin {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		System.out.println(lista.toString().equals("[Levi (levi@gmail.com)]"));
		
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(lista.toString().equals("[Levi (levi@gmail.com), Joao (joao@gmail.com)]"));

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		
		for (int i = 0; i < 250; ++i) {
			lista.adiciona(new Aluno("Nome " + i, "email" + i + "@gmail.com"));
		}
		
		
		System.out.println(lista);
	}

}
