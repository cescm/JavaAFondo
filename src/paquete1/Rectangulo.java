package paquete1;

public class Rectangulo extends FiguraGeometrica{
	
	private double base;
	private double altura;
	
	//getter and setter	
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

	
	//constructores
	public Rectangulo (double b, double h) {
		super("Rectángulo");
		base = b;
		altura = h;
		
	}
	
	
	//métodos
	public double area() {
		return base * altura;
	}

}
