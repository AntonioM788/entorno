/*Suma Acumulativa: Diseña un programa que pida al usuario un número N y luego muestre la suma de todos los números desde 1 hasta N*/


import java.util.Scanner;

public class sumaacumulativa {

	public static void main(String[] args) {

		int n1;
		int suma_acumulada = 0;
		int indice = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca usted un número: ");
		n1 = teclado.nextInt();
		
		while (indice <= n1) {
			
			suma_acumulada = suma_acumulada + indice;
			indice++;
			
		} System.out.println("EL total acumulado es: " + suma_acumulada);
	}

}
