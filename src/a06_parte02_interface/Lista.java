package a06_parte02_interface;

public interface Lista {

	public void adiciona(Object elemento);
	public void adiciona(Object elemento, int posicao);
	public int tamanho();
	public Object pega(int posicao);
	public void remove(int posicao);
	public int busca(Object elemento);

}
