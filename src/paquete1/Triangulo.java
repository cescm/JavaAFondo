package paquete1;

public class Triangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	
	
	
	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Triangulo( double b, double a) {
		super("Triángulo");
		base = b;
		altura = a;
	}

	public double area() {
		return base * altura / 2;
	}

}
