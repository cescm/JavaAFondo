package paquete1;

//esta clase es abstracta porque contiene m�todos abstractos
public abstract class FiguraGeometrica {
	
	private String nombre;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public FiguraGeometrica(String nom) {
		nombre = nom;
	}
	
		//definimos el m�todo como abstracto porque hasta que no implementemos la subclase correspondiente no sabremos como calcularlo
	public abstract double area();
	
	public String toString() {
		return nombre + " Area = " + area();
	}
	
	//por polimorfismo cada figura llamar� a su m�todo area correspondiente
	public static double areaPromedio(FiguraGeometrica arr[]) {
		int sum = 0;
		for ( int i = 0; i < arr.length; i++) {
			sum += arr[i].area();
		}
		return sum / arr.length;
	}
}
