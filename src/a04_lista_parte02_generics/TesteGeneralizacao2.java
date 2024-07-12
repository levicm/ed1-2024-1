package a04_lista_parte02_generics;

public class TesteGeneralizacao2 {

	public static void main(String[] args) {
		Lista<Aluno> lista = new Lista<Aluno>();

		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
//		lista.adiciona(new Professor("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));

		System.out.println(lista);

		Aluno aluno = lista.pega(1);
		System.out.println(aluno.nome);
		
		System.out.println(lista.pega(1).nome.equals("Joao"));
		lista.remove(1);

		Object elemento = lista.pega(1);
		if (elemento instanceof Aluno) {
			System.out.println(((Aluno) elemento).nome.equals("Pedro"));
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
