package a08_lista_ligada_parte01;

public class TesteRemove {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		System.out.println(lista);
		lista.remove(0);
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Alan", "alan@gmail.com"), 0);
		System.out.println(lista);
	
		lista.remove(1);
		System.out.println(lista);

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		System.out.println(lista);

		lista.adiciona(new Aluno("Rosa", "rosa@gmail.com"));
		System.out.println(lista);

		lista.adiciona(new Aluno("Carla", "carla@gmail.com"));
		System.out.println(lista);

		lista.remove(3);
		System.out.println(lista);
	}

}
