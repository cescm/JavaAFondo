package libro.cap02.estaticas;

public class Numero {
	
	private double valor;
	
	public Numero (double v) {
		valor = v;
	}
	
	public static double sumar (double a, double b) {
		return a + b;
	}
	
	public String toString() {
		return Double.toString(valor);
	}
}
