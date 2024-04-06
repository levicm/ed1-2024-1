package a03_lista_parte03_generalizacao;

public class Lista {

	private Object[] elementos = new Object[10];

	public void adiciona(Object elemento) {
		garanteEspaco();
		for (int i = 0; i < elementos.length; ++i) {
			if (elementos[i] == null) {
				elementos[i] = elemento;
				break;
			}
		}
	}
	
	public void adiciona(Object elemento, int posicao) {
		garanteEspaco();
		int tamanho = tamanho();
		// Testa se é uma posição válida
		if (posicao <= tamanho) {
			// Desloca os itens posteriores
			for (int i = tamanho; i > posicao; --i) {
				elementos[i] = elementos[i - 1];
			}
			// Guarda o novo item
			elementos[posicao] = elemento;
		}
	}
	
	private void garanteEspaco() {
		// Verificar se precisa de espaço
		if (tamanho() == elementos.length) {
			// Alocar mais espaco
			
		}
	}

	public int tamanho() {
		int resultado = 0;
		for (int i = 0; i < elementos.length; ++i) {
			if (elementos[i] == null) {
				resultado = i;
				break;
			}
		}
		return resultado;
	}

	public Object pega(int posicao) {
		Object resultado = null;
		if (posicao < elementos.length) {
			resultado = elementos[posicao];
		}
		return resultado;
	}

	public void remove(int posicao) {
		int tamanho = tamanho();
		// Testa se é uma posição válida
		if (posicao < tamanho) {
			for (int i = posicao; i < tamanho; ++i) {
				elementos[i] = elementos[i + 1];
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("[");
		// Concatenar os strings dos elementos no resultado
		for (int i = 0; i < elementos.length; ++i) {
			if (elementos[i] != null) {
				if (i > 0) {
					resultado.append(", ");
				}
				resultado.append(elementos[i].toString());
			} else {
				break;
			}
		}
		resultado.append("]");
		return resultado.toString();
	}
}
