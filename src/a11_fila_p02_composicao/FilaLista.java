package a11_fila_p02_composicao;

import a09_lista_duplamente_ligada_parte01.ListaDuplamenteLigada;

public class FilaLista implements Fila {
	
	private ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

	public void adiciona(Object elemento) {
		lista.adiciona(elemento);
	}

	public Object consulta() {
		return lista.pega(0);
	}

	public Object excluir() {
		Object resultado = lista.pega(0);
		lista.remove(0);
		return resultado;
	}

	public int tamanho() {
		return lista.tamanho();
	}

	public boolean vazia() {
		return tamanho() == 0;
	}
	
	public String toString() {
		return lista.toString();
	}
}
