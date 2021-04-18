package vehiculos;

public class Camion extends Vehiculo {
	int ejes;
	int cantidadcamiones;
	
	public Camion (String placa, String nombre, int precio,  int peso, Fabricante fabricante,  int ejes) {
		super.placa=placa;
		super.nombre=nombre;
		super.precio=precio;
		super.peso=peso;
		super.fabricante=fabricante;
		this.ejes=ejes;
		
		super.puertas=2;
		super.velocidadMaxima=80;
		super.traccion= "4x2";
		
		super.cantidadvehiculos++;
		this.cantidadcamiones++;
	}
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	

}
