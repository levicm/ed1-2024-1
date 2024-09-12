package a11_fila_p01;

public class TesteAdiciona {

	public static void main(String[] args) {
		Fila fila = new FilaLigada();
		System.out.println(fila.tamanho() == 0);
		System.out.println(fila.vazia() == true);
		System.out.println(fila.toString().equals("[]"));
		
		fila.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(fila.tamanho() == 1);
		System.out.println(fila.toString().equals("[Joao (joao@gmail.com)]"));

		fila.adiciona(new Aluno("Maria", "maria@gmail.com"));
		System.out.println(fila.toString().equals("[Joao (joao@gmail.com), Maria (maria@gmail.com)]"));

		fila.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		System.out.println(fila.tamanho() == 3);
		System.out.println(fila.vazia() == false);
	}

}
