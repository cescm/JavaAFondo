package paquete1;

public class TestFecha {
	public static void main (String [] args) {
		
		Fecha f = new Fecha(); // si solo lo definimos pero no lo instanciamos, al intentar usarlo nos devolverá una excepción nullpointerexception
		
		f.setDia(26);
		f.setMes(3);
		f.setAnio(2019);
		
		System.out.println("Dia: " + f.getDia() + ", Mes: " + f.getMes() + ", Año: " + f.getAnio());
		System.out.println(f); //si imprimimos ésto, sin sobreescribir el método toString nos devuelve una posición de memoria porque el método toString hay que sobreescribirlo
		
		Fecha f2 = new Fecha();
		f2.setDia(26);
		f2.setMes(3);
		f2.setAnio(2019);
		
		Fecha f3 = new Fecha();
		f3.setDia(26);
		f3.setMes(3);
		f3.setAnio(2018);
		
		System.out.println("La fecha f es igual a f2: " + f.equals(f2));
		System.out.println("La fecha f es igual a f3: " + f.equals(f3));
		
		Fecha f4 = new Fecha(04,10,208); //creamos una fecha con el constructor que hemos definido
		System.out.println(f4);
		
		Fecha f5 = new Fecha("23/02/2019");
		System.out.println(f5);
		
		f5.addDias(10);
		System.out.println(f5);
		
		//Vamos a probar la herencia de FechaDetallada
		
		FechaDetallada f6 = new FechaDetallada();
		f6.setDia(28);
		f6.setMes(3);
		f6.setAnio(2019);
		System.out.println(f6); //se va al arry y busca el índice -1 del mes que le hemos asignado a la fechadetallada
		
		FechaDetallada f7 = new FechaDetallada("29/04/2019");//probamos el constructor heredado con super(f)
		System.out.println(f7);
		
		
	}
}
