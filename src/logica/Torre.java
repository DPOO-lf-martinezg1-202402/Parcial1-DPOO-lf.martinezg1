package logica;

public class Torre extends Pieza {

	public Torre(int fila, int columna) {
		super(fila, columna);
	}

	@Override
	public int contarCasillas() {
		//tambien me puedo mover para atras, no solo para adelante
		final int tamaño = 8;
		int casillasHorizontal = 0;
		int casillasVertical = 0;
		
		if (this.fila <= tamaño && this.fila >= 1 && this.columna <= tamaño && this.columna >= 1) {
			//adelante
			casillasHorizontal += (tamaño - this.fila);
			casillasVertical += (tamaño - this.columna);
			//atras
			casillasHorizontal += this.fila - 1;
			casillasVertical += this.columna - 1;
		}
		
		return casillasHorizontal + casillasVertical;
	}

}
