package a03_lista_parte02_aloc_din;

public class TesteRemove {

	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));

		System.out.println(lista);

		System.out.println(lista.pega(1).nome.equals("Joao"));
		lista.remove(1);
		System.out.println(lista.pega(1).nome.equals("Maria"));

		System.out.println(lista);
		lista.remove(3);
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
	}

}
