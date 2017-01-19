package ejemplo5;

public class Punto {
	// Atributos
	int x, y; // Coordenadas del punto
	String color; // Color del punto

	// Constructores
	Punto() {

	}

	Punto(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	Punto(int x, int y){
		this.x = x;
		this.y = y;
		this.color = "blanco";
	}

	// Métodos
	void mostrar() {
		System.out.println("Este punto tiene coordenadas (" + x + "," + y + ") y es de color " + color);
	}

	void inicializar() {
		x = 0;
		y = 0;
		color = "blanco";
	}

	void desplazarX(int dx) {
		x = x + dx;
	}

	void desplazarY(int dy) {
		y = y + dy;
	}

	void desplazar(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}

}
