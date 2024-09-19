package prova02_pilha;

public class TesteProva {
	
	public static void testaConsome() {
		Pilha pilha = new // Colocar aqui a classe implementada
		pilha.adiciona(new Aluno("Joao", "joao@gmail.com"));
		pilha.adiciona(new Aluno("Maria", "maria@gmail.com"));
		pilha.adiciona(new Aluno("Jose", "jose@gmail.com"));
		pilha.adiciona(new Aluno("Carlos", "carlos@gmail.com"));
		pilha.adiciona(new Aluno("Andre", "andre@gmail.com"));
		pilha.adiciona(new Aluno("Henrique", "henrique@gmail.com"));
		
		Object[] removidos = pilha.consome(3);
		System.out.println(pilha.consulta().equals(new Aluno("Jose", "jose@gmail.com")));
		System.out.println(removidos.length == 3);
		System.out.println(removidos[0].equals(new Aluno("Carlos", "carlos@gmail.com")) || 
				removidos[0].equals(new Aluno("Henrique", "henrique@gmail.com")));

	}

	public static void testaEquals() {
		Pilha pilha1 = new // Colocar aqui a classe implementada 
		pilha1.adiciona(new Aluno("Joao", "joao@gmail.com"));
		pilha1.adiciona(new Aluno("Maria", "maria@gmail.com"));
		pilha1.adiciona(new Aluno("Jose", "jose@gmail.com"));
		pilha1.adiciona(new Aluno("Carlos", "carlos@gmail.com"));
		pilha1.adiciona(new Aluno("Andre", "andre@gmail.com"));
		pilha1.adiciona(new Aluno("Henrique", "henrique@gmail.com"));
		
		Pilha pilha2 = new // Colocar aqui a classe implementada 
		pilha2.adiciona(new Aluno("Joao", "joao@gmail.com"));
		pilha2.adiciona(new Aluno("Maria", "maria@gmail.com"));
		pilha2.adiciona(new Aluno("Jose", "jose@gmail.com"));
		pilha2.adiciona(new Aluno("Carlos", "carlos@gmail.com"));
		pilha2.adiciona(new Aluno("Andre", "andre@gmail.com"));
		pilha2.adiciona(new Aluno("Henrique", "henrique@gmail.com"));

		Pilha pilha3 = new // Colocar aqui a classe implementada 
		pilha3.adiciona(new Aluno("Joao", "joao@gmail.com"));
		pilha3.adiciona(new Aluno("Maria", "maria@gmail.com"));
		pilha3.adiciona(new Aluno("Jose", "jose@gmail.com"));

		System.out.println(pilha1.equals(pilha2));
		System.out.println(!pilha1.equals(pilha3));
	}

}
