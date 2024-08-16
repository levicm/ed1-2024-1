package a07_lista_ordenada_parte03;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaOrdenada lista = new ListaOrdenada();
		
		lista.adiciona(new Aluno("Levi", 9.4));
		System.out.println(lista);

		lista.adiciona(new Aluno("Joao", 5.6));
		System.out.println(lista);

		lista.adiciona(new Aluno("Maria", 7.4));
		System.out.println(lista);

		lista.adiciona(new Aluno("Pedro", 8.5));
		System.out.println(lista);

		lista.adiciona(new Aluno("Carla", 3.2));
		System.out.println(lista);

		lista.adiciona(new Aluno("Julia", 10));
		System.out.println(lista);
	}

}
