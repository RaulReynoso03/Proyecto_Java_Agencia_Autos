package Methods;

import java.util.Iterator;
import java.util.Scanner;

public class Auto {

	private static void delaysegundo() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

	}

	private int no;
	private String nombre;
	private String marca;
	private String color;
	private int modelo;
	private int cilindraje;
	private String trasmision;
	private double precioF;
	private int precioA;

	private int acu;
	private int vel;
	private int fre;

	public Auto(int no, String nombre, String marca, String color, int modelo, int cilindraje, String trasmision,
			double precioF) {
		super();
		this.no = no;
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindraje = cilindraje;
		this.trasmision = trasmision;
		this.precioF = precioF;

	}

	public Auto() {
		super();
	}

	public Auto(int no, String nombre, String marca, String color, int modelo, double precioF) {
		super();
		this.no = no;
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.precioF = precioF;

	}

	public int getModelo() {
		return modelo;
	}

	public double getPrecioF() {
		return precioF;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public void setTrasmision(String trasmision) {
		this.trasmision = trasmision;
	}

	public void setPrecioF(double precioF) {
		this.precioF = precioF;
	}

	public void setPrecioA(int precioA) {
		this.precioA = precioA;
	}

	public int getNo() {
		return no;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public String getTrasmision() {
		return trasmision;
	}

	public String getNombre() {
		return nombre;
	}

	public double CalD(Auto a) {
		double PF = a.getPrecioF();
		double VF;
		if (2022 - PF < 25) {
			for (int i = a.getModelo(); i < 2022; i++) {
				PF = PF - (PF * 0.10);
			}
		} else {
			for (int i = a.getModelo(); i < 2022; i++) {
				PF = PF + (PF * 0.5);
			}
		}
		VF = PF;
		return VF;
	}

	public int Encender(int ac, Auto a) {

		if (acu == 0) {
			System.out.println(a.getNombre() + " Esta encendiendo");
			delaysegundo();
			System.out.println(a.getNombre() + " Encendido.....");
			acu++;
			delaysegundo();
			System.out.println();
			System.out.println("REGRESANDO AL MENU DE METODOS");
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}

		} else {
			System.out.println(a.getNombre() + " Ya esta encendido...");
			System.out.println("REGRESANDO AL MENU DE METODOS");
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		}
		return acu;
	}

	public int Apagar(int ac, Auto a) {

		if (acu == 0) {
			System.out.println(a.getNombre() + " Ya esta apagado...");
			acu = acu + 1;
			System.out.println("REGRESANDO AL MENU DE METODOS");
			System.out.println();
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		} else if (acu != 0) {
			System.out.println(a.getNombre() + " Apagando....");
			System.out.println(a.getNombre() + "Se a apagado");
			acu--;
			System.out.println("REGRESANDO AL MENU DE METODOS");
			System.out.println();
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		}
		return acu;
	}

	public int Parar(int v, Auto a) {

		if (vel == 0 || acu == 0 || fre == 0) {
			delaysegundo();
			System.out.println(a.getNombre() + " Ya esta Parado....");
			vel++;
			System.out.println("REGRESANDO AL MENU DE METODOS");
			System.out.println();
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		} else {
			System.out.println(a.getNombre() + " Parando...");
			delaysegundo();
			System.out.println(a.getNombre() + "esta parado");
			vel = 0;
			System.out.println("REGRESANDO AL MENU DE METODOS");
			System.out.println();
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		}
		return vel;
	}

	public int Acelerar(int v, Auto a) {

		if (acu == 0) {
			System.out.println(a.getNombre() + " El Auto no se puede Acelerar....");
			System.out.println("REGRESANDO AL MENU DE METODOS");
			System.out.println();
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		} else {
			System.out.println(a.getNombre() + " Acelerando...");

			for (int acel = 0; acel < 80; acel += 10) {
				System.out.println(acel + " km/h");
				delaysegundo();
			}
			System.out.println(a.getNombre() + " a acelerado a 70 km/h");
			fre++;
			vel++;
			System.out.println("REGRESANDO AL MENU DE METODOS");
			System.out.println();
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		}
		return vel;
	}

	public int BVel(int v, Auto a) {

		if (vel == 0 || acu == 0 || fre == 0) {
			System.out.println(a.getNombre() + " El Auto no se puede Frenar....");
			System.out.println("REGRESANDO AL MENU DE METODOS");
			System.out.println();
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		} else {

			System.out.println(a.getNombre() + " Frenando...");
			delaysegundo();
			for (int desa = 80; desa >= 0; desa -= 10) {
				System.out.println("Desaselerando a " + desa + "km/h");
				delaysegundo();
			}
			System.out.println(a.getNombre() + " a frenado");
			vel--;
			System.out.println("");
			System.out.println("REGRESANDO AL MENU DE METODOS");
			System.out.println();
			for (int contador = 1; contador <= 1; contador++) {

				delaysegundo();
			}
		}
		return vel;
	}
}