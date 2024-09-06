package a10_pilha_p01;

public class TesteConsulta {

	public static void main(String[] args) {
		Pilha pilha = new PilhaArranjo();
		System.out.println(pilha);
		pilha.adiciona(new Aluno("Levi", "levi@gmail.com"));
		System.out.println(pilha);
		
		pilha.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(pilha);

		pilha.adiciona(new Aluno("Maria", "maria@gmail.com"));
		System.out.println(pilha);
		
		System.out.println(pilha.consulta());
		System.out.println(pilha);
	}

}
