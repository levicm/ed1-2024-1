package a08_lista_ligada_parte01;

public class ListaLigada {
	
	private Celula inicio;
	private int tamanho;

	public void adiciona(Object elemento) {
		if (inicio == null) {
			adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento, null);
			Celula ultima = pegaUltima();
			ultima.setProxima(nova);
			tamanho++;
		}
	}
	
	private Celula pegaUltima() {
		Celula celula = inicio;
		if (celula != null) {
			while(celula.getProxima() != null) {
				celula = celula.getProxima();
			}
		}
		return celula;
	}

	public void adiciona(Object elemento, int posicao) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		} else if (posicao == tamanho) {
			adiciona(elemento);
		} else if (posicaoValida(posicao)) {
			Celula anterior = pegaCelula(posicao - 1);
			Celula nova = new Celula(elemento, anterior.getProxima());
			anterior.setProxima(nova);
			tamanho++;
		}
	}
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, inicio);
		inicio = nova;
		tamanho++;
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
				inicio = inicio.getProxima();
			} else {
				Celula anterior = pegaCelula(posicao - 1);
				Celula celula = anterior.getProxima();
				anterior.setProxima(celula.getProxima());
			}
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













