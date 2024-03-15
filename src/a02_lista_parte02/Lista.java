package a02_lista_parte02;

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

	@Override
	public String toString() {
		String resultado = "[";
		// Concatenar os strings dos alunos no resultado
		for (int i = 0; i < alunos.length; ++i) {
			if (alunos[i] != null) {
				if (i > 0) {
					resultado += ", ";
				}
				resultado += alunos[i].toString();
			} else {
				break;
			}
		}
		resultado += "]";
		return resultado;
	}
}
