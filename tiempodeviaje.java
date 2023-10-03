

import java.util.Scanner;

public class tiempodeviaje {

	public static void main(String[] args) {
		
		float Kilometros;
		float velocidad;
		float tiempo;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduzca la distancia");
		Kilometros = teclado.nextFloat();
		System.out.println("Introduzca la velocidad");
		velocidad = teclado.nextFloat();
		
		tiempo = Kilometros/velocidad;
				
		System.out.println("El tiempo estimado es:" + tiempo);
		
		
		
		
		
		
		
	}

}
