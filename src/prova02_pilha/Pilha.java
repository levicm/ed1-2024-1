package prova02_pilha;

public interface Pilha {
	public void adiciona(Object elemento);
	public Object remove();
	public Object consulta();
	public int tamanho();
	public boolean vazia();
	public Object[] consome(int qtd);
}
