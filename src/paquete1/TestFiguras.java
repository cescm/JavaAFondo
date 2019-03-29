package paquete1;

public class TestFiguras {

	public static void main (String [] args) {
		Circulo c = new Circulo (4);
		Rectangulo r = new Rectangulo (10,5);
		Triangulo t = new Triangulo (3,6);
		
		System.out.println(c);
		System.out.println(r);
		System.out.println(t);
		
		FiguraGeometrica arr[] = { new Circulo(23)
								 , new Rectangulo(12,4)
								 , new Triangulo(2,5) };
		double prom = FiguraGeometrica.areaPromedio(arr); //metodo estatico
		System.out.println("Promedio = " + prom);
		
		}
	}

