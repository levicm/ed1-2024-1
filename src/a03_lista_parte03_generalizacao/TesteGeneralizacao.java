package a03_lista_parte03_generalizacao;

public class TesteGeneralizacao {

	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		lista.adiciona(new Professor("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));

		System.out.println(lista);

		System.out.println(((Aluno) lista.pega(1)).nome.equals("Joao"));
		lista.remove(1);
		Object elemento = lista.pega(1);
		if (elemento instanceof Aluno) {
			System.out.println(((Aluno) elemento).nome.equals("Maria"));
		} else if (elemento instanceof Professor) {
			System.out.println(((Professor) elemento).nome.equals("Maria"));
		}

		System.out.println(lista);
		lista.remove(3);
		System.out.println(lista);
		lista.remove(2);
		System.out.println(lista);
	}

}
