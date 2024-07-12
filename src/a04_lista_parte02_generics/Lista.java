package a04_lista_parte02_generics;

public class Lista<T> {

	private Object[] elementos = new Object[10];
	private int tamanho = 0;

	public void adiciona(T elemento) {
		garanteEspaco();
		elementos[tamanho] = elemento;
		tamanho++;
	}
	
	public void adiciona(T elemento, int posicao) {
		garanteEspaco();
		// Testa se é uma posição válida
		if (posicao <= tamanho) {
			// Desloca os itens posteriores
			for (int i = tamanho; i > posicao; --i) {
				elementos[i] = elementos[i - 1];
			}
			// Guarda o novo item
			elementos[posicao] = elemento;
			tamanho++;
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

	public int tamanho() {
		return tamanho;
	}

	public T pega(int posicao) {
		T resultado = null;
		if (posicao < elementos.length) {
			resultado = (T) elementos[posicao];
		}
		return resultado;
	}

	public void remove(int posicao) {
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
