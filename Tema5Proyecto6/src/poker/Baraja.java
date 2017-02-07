package poker;

public class Baraja {

	private Carta[] cartas = new Carta[52];

	public Baraja() {
		ordenar();
	}

	public void ordenar() {
		for (int palo = 0; palo <= 3; palo++) {

			for (int valor = 1; valor <= 13; valor++) {
				cartas[palo * 13 + valor - 1] = new Carta(valor, palo);
			}
		}
	}

	public void extraer() {
		System.out.println("La carta de arriba es " + cartas[0].toString());
	}

	public void mostrar() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i].toString());
		}
	}

	public void cortar() {

		Carta[] aux = new Carta[52];
		// Colocamos las 26 últimas cartas (26 = cartas.length/2) al principio
		for (int i = 0; i < cartas.length / 2; i++) {
			aux[i] = cartas[cartas.length / 2 + i];
		}
		
		// Colocamos las 26 primeras cartas al final
		for (int i = cartas.length / 2; i < cartas.length; i++) {
			aux[i] = cartas[i - cartas.length / 2];
		}

		cartas = aux;

	}

}






