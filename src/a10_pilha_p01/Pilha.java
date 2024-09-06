package a10_pilha_p01;

public interface Pilha {
	public void adiciona(Object elemento);
	public Object remove();
	public Object consulta();
	public int tamanho();
	public boolean vazia();
}
