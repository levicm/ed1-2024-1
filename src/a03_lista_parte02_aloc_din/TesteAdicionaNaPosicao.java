package a03_lista_parte02_aloc_din;

public class TesteAdicionaNaPosicao {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		System.out.println(lista.toString().equals("[Levi (levi@gmail.com)]"));
		
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(lista.toString().equals("[Levi (levi@gmail.com), Joao (joao@gmail.com)]"));

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));

		System.out.println(lista);

		lista.adiciona(new Aluno("Carlos", "carlos@gmail.com"), 4);
		
		System.out.println(lista);

		lista.adiciona(new Aluno("Carla", "carla@gmail.com"), 2);
		System.out.println(lista);
	}

}
