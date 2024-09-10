package logica;

public abstract class Pieza {
	protected int fila;
	protected int columna;
	//getters
	public int getFila() {
		return fila;
	}
	
	public int getColumna() {
		return columna;
	}
	//setters
	public void setFila(int fila) {
		this.fila = fila;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	//metodo constructor
	public Pieza(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
	}
	
	//metodos analiticos
	
	public abstract int contarCasillas();
	
}

