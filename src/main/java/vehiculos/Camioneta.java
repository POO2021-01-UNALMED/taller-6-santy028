package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	int cantidadcamionetas;
	
	public Camioneta (String placa, int puertas, String nombre, int precio,  int peso, Fabricante fabricante,  boolean volco) {
		super.placa=placa;
		super.puertas=4;
		super.nombre=nombre;
		super.precio=precio;
		super.peso=peso;
		super.fabricante=fabricante;
		this.volco=volco;
		
		
		super.velocidadMaxima=90;
		super.traccion= "4x4";
		
		super.cantidadvehiculos++;
		this.cantidadcamionetas++;
	}
	
	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

}
