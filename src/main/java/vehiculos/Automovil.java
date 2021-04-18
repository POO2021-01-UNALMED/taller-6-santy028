package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	int cantidadautomovil;

	public Automovil (String placa, String nombre, int precio,  int peso, Fabricante fabricante,  int puestos) {
		super.placa=placa;
		super.nombre=nombre;
		super.precio=precio;
		super.peso=peso;
		super.fabricante=fabricante;
		this.puestos=puestos;
		
		super.puertas=4;
		super.velocidadMaxima=100;
		super.traccion= "FWD";
		
		super.cantidadvehiculos++;
		this.cantidadautomovil++;
	}
	
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	

}
