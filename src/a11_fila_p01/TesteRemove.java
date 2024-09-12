package a11_fila_p01;

public class TesteRemove {

	public static void main(String[] args) {
		Fila fila = new FilaLigada();
		
		fila.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(fila.excluir().toString().equals("Joao (joao@gmail.com)"));

		fila.adiciona(new Aluno("Maria", "maria@gmail.com"));
		fila.adiciona(new Aluno("Pedro", "pedro@gmail.com"));

		System.out.println(fila.excluir().toString().equals("Maria (maria@gmail.com)"));
		System.out.println(fila.excluir().toString().equals("Pedro (pedro@gmail.com)"));
	}

}
