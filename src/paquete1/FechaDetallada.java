package paquete1;

public class FechaDetallada extends Fecha {
	private static String meses[] = { "Enero"
									,"Febrero"
									,"Marzo"
									,"Abbril"
									,"Mayo"
									,"Junio"
									,"Julio"
									,"Agosto"
									,"Septiembre"
									,"Octubre"
									,"Noviembre"
									,"Diciembre" };
	
	
	//getters and setters
	public static String[] getMeses() {
		return meses;
	}


	public static void setMeses(String[] meses) {
		FechaDetallada.meses = meses;
	}

	//métodos
	public String toString() {
		return getDia() + " de " + meses[ getMes()-1 ] + " de " + getAnio();
	}
	
	
	//constructores
	//vamos a "heredar" los constructores de la clase padre definiéndolos otra vez
	public FechaDetallada (String f) {
		super(f);
	}
	
	public FechaDetallada() {
		super();
	}
	
	public FechaDetallada(int dia, int mes, int anio) {
		super(dia,mes,anio);
	}

}
