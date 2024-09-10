package logica;


public class Reina extends Pieza{

	public Reina(int fila, int columna) {
		super(fila, columna);
	}

	@Override
	public int contarCasillas() {
		final int tamaño = 8;
		int casillasHorizontal = 0;
		int casillasVertical = 0;
		int casillasDiagonalPrincipal = 0;
		int casillasDiagonalSecundaria = 0;
		
		if (this.fila <= tamaño && this.fila >= 1 && this.columna <= tamaño && this.columna >= 1) {
			//adelante
			casillasHorizontal += (tamaño - this.fila);
			casillasVertical += (tamaño - this.columna);
			//atras
			casillasHorizontal += this.fila - 1;
			casillasVertical += this.columna - 1;
			//diagonal principal, si horizontal y vertical adelante, o ambas hacia atras
			casillasDiagonalPrincipal += (casillasHorizontal + casillasVertical)/2;
			//diagonal secundaria, minimo entre fila y columna por delante y por detras
			casillasDiagonalSecundaria += Math.min(tamaño-this.fila, tamaño-this.columna);
			casillasDiagonalSecundaria += Math.min(this.fila-1, this.columna-1);
		}
		
		return casillasHorizontal + casillasVertical + casillasDiagonalPrincipal + casillasDiagonalSecundaria;
	}

}
