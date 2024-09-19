package a11_fila_p02_composicao;

public class TesteConsulta {

	public static void main(String[] args) {
		Fila fila = new FilaLista();
		
		fila.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(fila.consulta() instanceof Aluno);
		System.out.println(fila.consulta().toString().equals("Joao (joao@gmail.com)"));

		fila.adiciona(new Aluno("Maria", "maria@gmail.com"));
		System.out.println(fila.consulta().toString().equals("Joao (joao@gmail.com)"));

		fila.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		System.out.println(fila.consulta().toString().equals("Joao (joao@gmail.com)"));
	}

}