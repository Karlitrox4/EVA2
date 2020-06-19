package eva2;

public class Lavadora extends Electrodomestico {

	public static final int CARGA = 5;
	
	private int carga = CARGA;
	
	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	int precioAumento = 0;
	
	public int precioFinal() {
		int valorfinal = super.precioFinal();
		if (carga > 30) {
			valorfinal = precioFinal()+50;
		}
		return (int) PRECIO_BASE;
		
	}
		
	
}
