package a09_lista_duplamente_ligada_parte01;

public class TesteRemove {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
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

		lista.remove(1);
		System.out.println(lista);
		
		System.out.println(lista.toString().equals("[Alan (alan@gmail.com), Rosa (rosa@gmail.com), Carla (carla@gmail.com)]"));
	}

}
