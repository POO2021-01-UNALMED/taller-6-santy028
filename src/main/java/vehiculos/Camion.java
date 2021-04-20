package vehiculos;

public class Camion extends Vehiculo {
	int ejes;
	static int cantidadcamiones;
	
	public Camion (String placa, String nombre, int precio,  int peso, Fabricante fabricante,  int ejes) {
		super(placa,2,  80,nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		
		
	
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
