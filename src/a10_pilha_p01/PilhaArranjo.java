package a10_pilha_p01;

public class PilhaArranjo implements Pilha {
	
	private Object[] elementos = new Object[40];
	private int topo = -1;

	@Override
	public void adiciona(Object elemento) {
		topo++;
		elementos[topo] = elemento;
	}

	@Override
	public Object remove() {
		Object resultado = elementos[topo];
		topo--;
		return resultado;
	}

	@Override
	public Object consulta() {
		return elementos[topo];
	}

	@Override
	public int tamanho() {
		return topo + 1;
	}

	@Override
	public boolean vazia() {
		return tamanho() == 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i <= topo; ++i) {
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(elementos[i]);
		}
		sb.append("]");
		return sb.toString();
	}

}
