package a08_lista_ligada_parte01;

public class Celula {

	private Object elemento;
	private Celula proxima;

	public Celula(Object elemento, Celula proxima) {
		super();
		this.elemento = elemento;
		this.proxima = proxima;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Celula getProxima() {
		return proxima;
	}
	
	@Override
	public String toString() {
		return String.valueOf(elemento);
	}
}











