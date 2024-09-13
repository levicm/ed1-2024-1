package a11_fila_p02_composicao;

public class FilaLigada implements Fila {
	
	private Celula inicio;
	private Celula fim;
	private int tamanho;

	@Override
	public void adiciona(Object elemento) {
		Celula nova = new Celula(elemento);
		if (tamanho == 0) {
			inicio = nova;
			fim = nova;
		} else {
			fim.setProxima(nova);
			nova.setAnterior(fim);
			fim = nova;
		}
		tamanho++;
	}

	@Override
	public Object consulta() {
		if (inicio != null) {
			return inicio.getElemento();
		}
		return null;
	}

	@Override
	public Object excluir() {
		Object resultado = null;
		if (inicio != null) {
			resultado = inicio.getElemento();
			if (tamanho == 1) {
				inicio = null;
				fim = null;
			} else {
				inicio = inicio.getProxima();
				inicio.setAnterior(null);
			}
			tamanho--;
		}
		return resultado;
	}

	@Override
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public boolean vazia() {
		return tamanho() == 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Celula celula = inicio;
		while(celula != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(celula.toString());
			celula = celula.getProxima();
		}
		sb.append("]");
		return sb.toString();
	}

}
