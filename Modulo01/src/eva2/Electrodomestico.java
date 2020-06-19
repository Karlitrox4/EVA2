package eva2;

public class Electrodomestico { // Heredable, averiguar cómo hacer

	public final static int PRECIO_BASE = 100000; //estas 4 son constantes
	public static final String COLOR = "blanco";
	public static final char CONSUMO_ENERGETICO = 'F';
	public static final int PESO = 5;
	
	protected int precioBase = PRECIO_BASE; // debe ser constante
	protected String color = COLOR;
	protected char consumoEnergetico = CONSUMO_ENERGETICO;
	protected int peso = PESO;

	public Electrodomestico() { // Constructor por defecto
	}

	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public double getprecioBase() {
		return precioBase;
	}

	public String getcolor() {
		return color;
	}

	public char getconsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getpeso() {
		return peso;
	}

	protected boolean comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			return true;
		}
		return false;
	}

	protected boolean comprobarColor(String color) {
		Boolean varTemp = false;
		String Array[]={"blanco", "negro", "rojo", "azul", "gris"};
		for (String i: Array) {
			
			if (color.equalsIgnoreCase(i)) {
				varTemp = true;
			}
		}
		if (varTemp) {
			this.color = color;
		}
		else {
			this.color=COLOR;	
		}
		return varTemp;
	}

	public int precioFinal() {		// precioFinal(): según el consumo energético, aumentara su precio, y según su
			int fin = 0;		
						
			switch (consumoEnergetico)	{
				case 'A': 
				fin += 100;
				break;
				
				case 'B':
				fin += 80;
				break;
				
				case 'C':
				fin += 60;
				break;
				
				case 'D':
				fin += 50;
				break;
				
				case 'E':
				fin += 30;
				break;
				
				case 'F':
				fin += 10;
				break;
			}
				if(peso>=0 && peso<19){
		            fin+=10;
		        }
				else if(peso>=20 && peso<49){
		            fin+=50;
		        }
				else if(peso>=50 && peso<=79){
		            fin+=80;
		        }
				else if(peso>=80){
		            fin+=100;
		        }
				return precioBase+fin;		//tamaño también. 
			}
			
	
	
}
