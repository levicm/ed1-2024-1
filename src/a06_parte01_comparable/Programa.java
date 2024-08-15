package a06_parte01_comparable;

public class Programa {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.adiciona(new Candidato("Joao", 45, 70));
		lista.adiciona(new Candidato("José", 32, 51));
		lista.adiciona(new Candidato("Pedro", 21, 32));
		lista.adiciona(new Candidato("Maria", 65, 70));
		lista.adiciona(new Candidato("Cleane", 18, 70));
		lista.adiciona(new Candidato("Josefa", 25, 40));
		lista.adiciona(new Candidato("Juliana", 25, 40));

		
		Candidato maior = null;
		for (int i = 0; i < lista.tamanho(); ++i) {
			Candidato candidato = (Candidato) lista.pega(i);
			if (maior == null || candidato.compareTo(maior) > 0) {
				maior = candidato;
			}
		}
		System.out.println("Candidato melhor colocação: " + maior);
	}

}
