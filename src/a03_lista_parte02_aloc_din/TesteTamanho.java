package a03_lista_parte02_aloc_din;

public class TesteTamanho {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista.tamanho() == 0);
		
		lista.adiciona(new Aluno("Levi", "levi@gmail.com"));
		lista.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(lista.tamanho() == 2);

		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		System.out.println(lista.tamanho() == 4);
		
		System.out.println(lista);
	}

}
