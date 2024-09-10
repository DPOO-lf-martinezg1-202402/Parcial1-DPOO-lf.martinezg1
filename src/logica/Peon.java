package logica;

public class Peon extends Pieza{

	public Peon(int fila, int columna) {
		super(fila, columna);
	}

	@Override
	public int contarCasillas() {
		final int tamaño = 8;
		int casillas = 0;
		
		if (this.fila <= tamaño && this.fila >= 1 && this.columna <= tamaño && this.columna >= 1) {
			if (this.fila == 2) {
				casillas += 2; //esta al inicio (segun reglas) tonces se puede mover 2
			}
			else { //esta en cualquier otra fila
				if (this.fila < tamaño){ //solo si fila menor a tamaño, se puede mover 1 casilla
					casillas += 1;
				}
			}
		}
		
		return casillas;
	}

}
