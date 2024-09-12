package a11_fila_p01;

public class Celula {

	private Object elemento;
	private Celula proxima;
	private Celula anterior;

	public Celula(Object elemento) {
		super();
		this.elemento = elemento;
	}

	public Celula(Object elemento, Celula proxima, Celula anterior) {
		super();
		this.elemento = elemento;
		this.proxima = proxima;
		this.anterior = anterior;
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
	
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	
	@Override
	public String toString() {
		return String.valueOf(elemento);
	}
}











