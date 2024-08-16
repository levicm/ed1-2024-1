package a07_lista_ordenada_parte02;

public class ListaOrdenada {
	
	private Object[] elementos = new Object[20];
	private int tamanho = 0;
	
	public void adiciona(Comparable elemento) {
		garanteEspaco();
		// Se a lista estiver vazia, adiciona direto
		if (tamanho == 0) {
			elementos[0] = elemento;
			tamanho++;
		} else {
			for (int i = 0; i < tamanho; ++i) {
				System.out.println("entrou no laço!!");
				// Comparar o elemento passado com os elementos do arranjo
				if (elemento.compareTo(elementos[i]) < 0) {
					// Chegou na posição a ser inserida
					// Deslocar os elementos restantes
					for (int j = tamanho; j > i; --j) {
						elementos[j] = elementos[j - 1];
					}
					// Guardar o novo elemento na posicao correta
					elementos[i] = elemento;
					tamanho++;
				}
			}
		}
	}
	
	private void garanteEspaco() {
		// Verificar se precisa de espaço
		if (tamanho() == elementos.length) {
			// Alocar mais espaco
			// Define o novo limite como sendo o dobro do anterior
			int novoLimite = elementos.length * 2;
			System.out.println("Dobrando o espaço de " + elementos.length + " para " + novoLimite + "...");
			// Instancia um novo arranjo com o novo limite
			Object[] novoArranjo = new Object[novoLimite];
			// Copia o arranjo anterior para o novo
			for (int i = 0; i < elementos.length; ++i) {
				novoArranjo[i] = elementos[i];
			}
			// Define o novo arranjo como sendo o atributo elementos
			this.elementos = novoArranjo;
		}
	}

	public Comparable pega(int posicao) {
		Comparable resultado = null;
		if (posicao < elementos.length) {
			resultado = (Comparable) elementos[posicao];
		}
		return resultado;
	}
	
	public void remove(int posicao) {
		// Testa se é uma posição válida
		if (posicao < tamanho) {
			for (int i = posicao; i < tamanho; ++i) {
				elementos[i] = elementos[i + 1];
			}
			tamanho--;
		}
	}
	
	public boolean contem(Comparable elemento) {
		return false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder("[");
		// Concatenar os strings dos elementos no resultado
		for (int i = 0; i < tamanho; ++i) {
			if (i > 0) {
				resultado.append(", ");
			}
			resultado.append(elementos[i].toString());
		}
		resultado.append("]");
		return resultado.toString();
	}

}
