package Paquete1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Fecha {
	
	
	//Atributos
	private int dia;
	private int mes;
	private int anio;
	
	//Getters y Setters
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}


	//Métodos
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + anio;
	}
	
	@Override
	public boolean equals(Object o) {
		Fecha otra = (Fecha)o;
		return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
	}
	
	private int fechaToDias() {
		return anio*360+mes*30+dia;
	}
	
	private void diasToFecha(int i) {
		anio = i / 360;
		int resto = i % 360;
		mes = (int) (resto) / 30;
		dia = resto % 30;
		//ajustamos por si el resto de dia da 0, quiere decir que estamos en el día 30, con lo que hay que poner el día a 30 y restar un mes
		if (dia == 0) {
			dia = 30;
			mes--;
		}
		//ajustamos por si el resto de mes da 0, quiere decir que estamos en el mes 12, con lo que restamos 1 año
		if (mes == 0) {
			mes = 12;
			anio--;
		}
	}
	
	public void addDias(int d) {
		int sum = fechaToDias() + d;
		diasToFecha(sum);
	}
	
	//Constructores
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public Fecha() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Fecha (String s) {
		//este primer metodo tiene un problema ya que si el dia o el mes se escribe con un digito, no le añadimos el 0
		//TODO arreglar éste método para que añada un 0 si el token es menor que 10
		/*
		StringTokenizer st = new StringTokenizer(s,"/");
		ArrayList<String> lista = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			lista.add(st.nextToken());
		}
		for (int i = 0; i < lista.size(); i++) {
			if (i == 0) {
				dia = Integer.parseInt(lista.get(i));
				//lista.remove(i);
			}else if (i == 1) {
				mes = Integer.parseInt(lista.get(i));
				//lista.remove(i);
			}else {
				anio = Integer.parseInt(lista.get(i));
				//lista.remove(i);
			}
		}
		*/
		
		 //otra manera de hacer éste constructor sería con el uso de indexOf
		  int pos1 = s.indexOf('/');
		  int pos2 = s.lastIndexOf('/');
		  String sDia = s.substring(0,pos1);
		  dia = Integer.parseInt(sDia);
		  String sMes = s.substring(pos1+1,pos2);
		  mes = Integer.parseInt(sMes);
		  String sAnio = s.substring(pos2 +1);
		  anio = Integer.parseInt(sAnio);
		 
	}
}
