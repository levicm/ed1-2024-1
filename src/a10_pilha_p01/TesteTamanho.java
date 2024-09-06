package a10_pilha_p01;

public class TesteTamanho {

	public static void main(String[] args) {
		Pilha pilha = new PilhaArranjo();
		System.out.println(pilha);
		System.out.println(pilha.tamanho());

		pilha.adiciona(new Aluno("Levi", "levi@gmail.com"));
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		pilha.adiciona(new Aluno("Joao", "joao@gmail.com"));
		System.out.println(pilha);
		System.out.println(pilha.tamanho());

		pilha.adiciona(new Aluno("Maria", "maria@gmail.com"));
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		System.out.println(pilha.remove());
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}

}
