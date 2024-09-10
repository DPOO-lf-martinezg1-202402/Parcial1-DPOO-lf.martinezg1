package logica;

public class Reina extends Pieza{

	public Reina(int fila, int columna) {
		super(fila, columna);
	}

	@Override
	public int contarCasillas() {
		final int tamaño = 8;
		
		int casillasHorizontal = (tamaño - this.columna);
		int casillasVertical = (tamaño - this.columna);
		//por cada horizontal y vertical hay una diagonal
		int casillasDiagonalPrincipal = ();
		int casillasDiagonalSecundaria = ;
		
		return casillasHorizontal + casillasVertical;
		return 0;
	}

}
