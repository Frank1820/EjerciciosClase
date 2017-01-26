package ejemplo19;

public class Punto {
	// Atributos
	private int x, y; // Coordenadas del punto
	private String color; // Color del punto
	static int contadorPuntos;

	// Constructores
	Punto() {
		contadorPuntos++;
	}

	Punto(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
		contadorPuntos++;
	}

	Punto(int x, int y) {

		this(x, y, "blanco");
		// this.x = x;
		// this.y = y;
		// // El color por defecto será blanco
		// color = "blanco";
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
	
	static void totalPuntos(){
		System.out.println("*** Hay " + contadorPuntos + 
				" objetos de la clase Punto.");
	}
	
	// Métodos de acceso
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
















