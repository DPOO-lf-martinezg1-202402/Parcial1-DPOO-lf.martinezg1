package presentacion;

import logica.Pieza;
import logica.Peon;
import logica.Torre;
import logica.Reina;

public class Principal {
	private Pieza pieza;
	
	public Principal() {
		this.pieza = new Peon(0,0);
		System.out.println(this.pieza.contarCasillas());
		
		this.pieza = new Torre(0,0);
		System.out.println(this.pieza.contarCasillas());
		
		this.pieza = new Reina(0,0);
		System.out.println(this.pieza.contarCasillas());
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}
	
	
}

