package a05_lista_parte03_busca;

public class TesteBusca {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
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
		

//		for (int i = 0; i < 250; ++i) {
//			lista.adiciona(new Aluno("Nome " + i, "email" + i + "@gmail.com"));
//		}
		
		
	}

}
