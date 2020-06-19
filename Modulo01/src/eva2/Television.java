package eva2;

public class Television extends Electrodomestico {
	
	Double resolucion;
	Boolean tdt;

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public Television(int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
	}

	public Television(Double resolucion, Boolean tdt) {
		super();
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	public Double getResolucion() {
		return resolucion;
	}

	public Boolean getTdt() {
		return tdt;
	}

	
	
}
