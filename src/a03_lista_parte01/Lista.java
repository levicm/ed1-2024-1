package a03_lista_parte01;

public class Lista {

	private Aluno[] alunos = new Aluno[100];

	public void adiciona(Aluno aluno) {
		for (int i = 0; i < alunos.length; ++i) {
			if (alunos[i] == null) {
				alunos[i] = aluno;
				break;
			}
		}
	}
	
	public void adiciona(Aluno aluno, int posicao) {
		int tamanho = tamanho();
		// Testa se é uma posição válida
		if (posicao <= tamanho) {
			// Desloca os itens posteriores
			for (int i = tamanho; i > posicao; --i) {
				alunos[i] = alunos[i - 1];
			}
			// Guarda o novo item
			alunos[posicao] = aluno;
		}
	}
	
	public int tamanho() {
		int resultado = 0;
		for (int i = 0; i < alunos.length; ++i) {
			if (alunos[i] == null) {
				resultado = i;
				break;
			}
		}
		return resultado;
	}

	public Aluno pega(int posicao) {
		Aluno resultado = null;
		if (posicao < alunos.length) {
			resultado = alunos[posicao];
		}
		return resultado;
	}

	public void remove(int posicao) {
		int tamanho = tamanho();
		// Testa se é uma posição válida
		if (posicao < tamanho) {
			for (int i = posicao; i < tamanho; ++i) {
				alunos[i] = alunos[i + 1];
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("[");
		// Concatenar os strings dos alunos no resultado
		for (int i = 0; i < alunos.length; ++i) {
			if (alunos[i] != null) {
				if (i > 0) {
					resultado.append(", ");
				}
				resultado.append(alunos[i].toString());
			} else {
				break;
			}
		}
		resultado.append("]");
		return resultado.toString();
	}
}
