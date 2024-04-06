package a03_lista_parte03_generalizacao;

public class TestePega {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		
		System.out.println(lista);
		
		// Pegando um elemento e tratando como Aluno por typecast
		Aluno aluno = (Aluno) lista.pega(2);
		System.out.println(aluno.nome.equals("Maria"));
		
		// Pegando um elemento e tratando como Aluno por typecast 
		// diretamente sem variável
		System.out.println(((Aluno) lista.pega(2)).nome.equals("Maria"));

		System.out.println(lista.pega(5) == null);
		System.out.println(lista.pega(105) == null);
		System.out.println(lista.pega(10005) == null);
	}

}
