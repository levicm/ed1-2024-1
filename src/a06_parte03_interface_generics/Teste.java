package a06_parte03_interface_generics;

public class Teste {

	public static void main(String[] args) {
		Lista<Aluno> lista = new ListaArranjo<Aluno>();
		
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
		
		Aluno aluno3 = lista.pega(3);
		System.out.println(aluno3);
	}

}
