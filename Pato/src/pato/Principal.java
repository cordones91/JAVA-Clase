package pato;

import java.util.Scanner;

public class Principal {
	
	static Scanner lector=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
	
		//int pasos;
		Pato pepito=new Pato(5);
		
		pepito.AndarHaciaAdelante(22);
		pepito.AndarHaciaAtras(50);
		
		System.out.println("La posicion del pato es: "+pepito.DimePosicion());
		
	

	}

}
