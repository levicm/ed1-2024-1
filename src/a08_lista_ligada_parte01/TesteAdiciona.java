package a08_lista_ligada_parte01;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(lista);
		
		lista.adicionaNoComeco(new Aluno("Alan", "alan@gmail.com"));
		System.out.println(lista);
		
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		System.out.println(lista);
		
	}

}