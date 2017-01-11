package ejercicios;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int[] valores = {10, 30, 5, 7, 2};
		
		ordenar(valores);
		
	}
	
	static void ordenar(int[] numeros){
		
		int posMin;
		int aux;
		
		for(int i = 0; i < numeros.length - 1; i++){
			
			posMin = i;
			for(int j = i + 1; j < numeros.length; j++){
				if(numeros[j] < numeros[posMin]){
					posMin = j;
				}
			}
			
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
			
		}
		
		for(int i = 0; i < numeros.length; i++){
			System.out.print(numeros[i] + " ");
		}
	}
}











