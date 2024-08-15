package a06_parte02_interface;

public class Teste {

	public static void main(String[] args) {
		Lista lista = new ListaArranjo();
		
		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		System.out.println(lista.toString().equals("[Levi (levi@gmail.com)]"));
		
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(lista.toString().equals("[Levi (levi@gmail.com), Joao (joao@gmail.com)]"));

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Mariana", "mariana@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		
		System.out.println(lista);
		
		Aluno aBuscar = new Aluno("Maria", "maria@gmail.com");
		int posicao = lista.busca(aBuscar);
		System.out.println(posicao);
	}

}
