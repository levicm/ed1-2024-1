package a09_lista_duplamente_ligada_parte01;

public class ListaDuplamenteLigada {
	
	private Celula inicio;
	private Celula fim;
	
	private int tamanho;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento);
		if (inicio == null) {
			// Vazia
			inicio = nova;
			fim = nova;
		} else {
			inicio.setAnterior(nova);
			nova.setProxima(inicio);
			inicio = nova;
		}
		tamanho++;
	}
	
	public void adiciona(Object elemento) {
		if (inicio == null) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			fim.setProxima(nova);
			nova.setAnterior(fim);
			fim = nova;
			tamanho++;
		}
	}
	
	public void adiciona(Object elemento, int posicao) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == tamanho) {
			adiciona(elemento);
		} else if (posicaoValida(posicao)) {
			Celula celula = pegaCelula(posicao);
			Celula anterior = celula.getAnterior();

			Celula nova = new Celula(elemento, celula, anterior);

			anterior.setProxima(nova);
			celula.setAnterior(nova);
			tamanho++;
		}
	}
	
	public Object pega(int posicao) {
		Object resultado = null;
		if (posicaoValida(posicao)) {
			Celula celula = pegaCelula(posicao);
			if (celula != null) {
				resultado = celula.getElemento();
			}
		}
		return resultado;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao < this.tamanho;
	}
	
	private Celula pegaCelula(int posicao) {
		Celula celula = inicio;
		for (int i = 0; celula != null && i < posicao; ++i) {
			celula = celula.getProxima();
		}
		return celula;
	}
	
	public void remove(int posicao) {
		if (posicaoValida(posicao)) {
			if (posicao == 0) {
				// Se for a primeira
				if (tamanho == 1) {
					// Se for a única
					inicio = null;
					fim = null;
				} else {
					inicio = inicio.getProxima();
					inicio.setAnterior(null);
				} 
			} else {
				if (posicao == tamanho - 1) {
					// Se for a última
					fim = fim.getAnterior();
					fim.setProxima(null);
				} else {
					Celula aRemover = pegaCelula(posicao);
					Celula antes = aRemover.getAnterior();
					Celula depois = aRemover.getProxima();
					
					antes.setProxima(depois);
					depois.setAnterior(antes);
				}
			}
			tamanho--;
		}
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public int busca(Object elemento) {
		return 0;
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













