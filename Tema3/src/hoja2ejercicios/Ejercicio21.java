package hoja2ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		String[][] nominas = new String[4][3];
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < nominas.length; i++) {
			System.out.print("Apellidos: ");
			nominas[i][0] = entrada.nextLine();
			System.out.print("Nombre: ");
			nominas[i][1] = entrada.nextLine();
			System.out.print("Sueldo: ");
			nominas[i][2] = entrada.nextLine();
		}

		for (int i = 0; i < nominas.length; i++) {
			System.out.println(nominas[i][0] + "\t" + nominas[i][1] + "\t" + nominas[i][2]);
		}

		float suma = 0;
		for (int i = 0; i < nominas.length; i++) {

			suma = suma + Float.parseFloat(nominas[i][2]);

		}

		System.out.println("\nTotal nóminas: " + suma + " €.");
		
		int posMin = 0;
		for (int i = 0; i < nominas.length; i++) {
			
			if(Float.parseFloat(nominas[i][2]) 
					< Float.parseFloat(nominas[posMin][2])){
				posMin = i;
			}
			
		}
		
		System.out.println("\nEl empleado con menor sueldo "
				+ "es " + nominas[posMin][1] + " " + 
				nominas[posMin][0] + ", que cobra " + 
				nominas[posMin][2] + " €.");

	}

}










