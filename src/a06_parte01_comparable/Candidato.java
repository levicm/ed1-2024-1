package a06_parte01_comparable;

public class Candidato implements Comparable {

	String nome;
	int idade;
	double nota;

	public Candidato(String nome, int idade, double nota) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Candidato) {
			Candidato outro = (Candidato) o;
			if (nota > outro.nota) {
				return 1;
			} else if (nota < outro.nota) {
				return -1;
			} else {
				if (idade > outro.idade) {
					return 1;
				} else if (idade < outro.idade) {
					return -1;
				} else {
					return 0;
				}
			}
		} else {
			throw new RuntimeException("Objeto passado não é um Candidato!");
		}
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", idade=" + idade + ", nota=" + nota + "]";
	}
	
	
}
