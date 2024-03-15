package a02_lista_parte03;

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
