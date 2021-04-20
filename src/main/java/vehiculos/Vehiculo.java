package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	
	static int cantidadvehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,  
			String traccion,Fabricante fabricante) {
		
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.traccion = traccion;
		this.fabricante.getPais().ventas++;
		this.fabricante.ventas++;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadvehiculos;
	}
	
	public static void setCantidadVehiculos(int cantidadvehiculos) {
		Vehiculo.cantidadvehiculos=cantidadvehiculos;
	}
	public static String vehiculosPorTipo() {
		return "Automoviles:" + Automovil.cantidadautomovil + "\nCamionetas: " + Camioneta.cantidadcamionetas +
				"\nCamiones: " + Camion.cantidadcamiones;
	}
	
	
	

}
