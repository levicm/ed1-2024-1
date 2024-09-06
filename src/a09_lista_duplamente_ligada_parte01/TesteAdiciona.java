package a09_lista_duplamente_ligada_parte01;

public class TesteAdiciona {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
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
