package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	static int cantidadautomovil=0;

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos)  {
		super(placa, 4, 100, nombre, precio, peso, "FWD",fabricante);
	
		this.puestos=puestos;
		
		
		
		
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
