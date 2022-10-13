package FontCode;

import java.util.Scanner;
import Methods.*;

public class AgencyUC {
	
	private static boolean salir;
	
	public static void main(String[] args) {
		//Carros instanciados.
		Auto c1= new Auto(1,"Odyssey", "Honda", "Gris", 2017, 6, "Automatica", 500999);
		Auto c2= new Auto(2, "Yaris R Sedan", "Toyota", "Rojo", 2016, 4, "Automatica", 234999);
		Auto c3= new Auto(3, "Sport Sedan", "Mercedes Benz", "Blanco", 2017, 4, "Automatica", 482999);
		Auto c4= new Auto(4, "X Trail", "Nissan", "Negro", 2019, 4, "Automatica", 462999);
		Auto c5= new Auto(5, "Eco Sport Tinatium", "Ford", "Titanio", 2018, 6, "Automatica", 347999);
		Auto c6= new Auto(6, "MX-5", "mazda", "Plata", 2018, 6, "Manual", 350999);
		Auto c7= new Auto(7, "X1", "BMW", "Negro", 2019, 4, "Automatica", 466999);
		Auto c8= new Auto(8, "Stepwat Intens", "Renault", "Azul", 2018, 4, "Manual", 214999);
		Auto c9= new Auto(9, "Soul EX", "KIA", "Blanco", 2018, 4, "Automatica", 301999);
		Auto c10= new Auto(10,"Tucson Limited", "Hyundai", "Blanco", 2018, 4, "Automatica", 371999);
		Auto c11= new Auto(11, "Land Rover", "Discovery", "Blanco", 2015, 6, "Automatica", 469999);
		Auto c12= new Auto(12, "Vocho", "Wolkswagen", "Negro", 1996, 4, "Manual", 176999);
		Auto c13= new Auto(13, "Journey GT", "Dodge", "Negro", 2018, 6, "Automatica", 392999);
		Auto c14= new Auto();
		
		Scanner txt= new Scanner(System.in);
		int op;
		int continuar3=0;
		String i="no", i1="no";
		int continuar2 = 0;
		salir = true;
		//Titulo del primer Menu
		c14.setNo(0);
		do {
		
			i1="no";
		System.out.println("---AGENCIA SAN FELIPE DE LAS FUENTES-------");
		System.out.println("1.-Lista de Carros \n2.-Alta de Auto \n3.-Salir");
		System.out.println("Ingresa una opcion:");
		op=txt.nextInt();
		
		switch(op) {
		case 1: //Opcion 1; Lista de Carros.
			do {
			System.out.println("-----------Lista de Carros-----------");
			if(c14.getNo()==0)// Si se instancio el objeto 14, mostrar el menu completo 
				System.out.println("1.-Odessey \n2.-Yaris R \n3.-Sport Sedan \n4.-X Trail"
						+ " \n5.-Eco Sport \n6.-MX-5 \n7.-X1 \n8.-Stepwat Intens \n9.-Soul EX"
						+ " \n10.-Tucson Limited \n11.-Land Rover \n12.-Vocho \n13.-Journey "
						+ "\n14.-Regresar al Menu anterior"
						+ "\nIngresa una opcion:");
						
			else { //Si no, solo mostrar este menu.
				System.out.println("1.-Odessey \n2.-Yaris R \n3.-Sport Sedan \n4.-X Trail"
						+ " \n5.-Eco Sport \n6.-MX-5 \n7.-X1 \n8.-Stepwat Intens \n9.-Soul EX"
						+ " \n10.-Tucson Limited \n11.-Land Rover \n12.-Vocho "
						+ "\n13.-Journey \n14.-"+c14.getNombre()+" \n15.-Regresar al Menu anterior");
				System.out.print("Ingresa una opcion:");
			}
			op=txt.nextInt();
			switch(op) {
					case 1:
						get(c1);
						break;
					case 2:
						get(c2);
						break;
					case 3:
						get(c3);
						break;
					case 4:
						get(c4);
						break;
					case 5:
						get(c5);
						break;
					case 6:
						get(c6);
						break;
					case 7:
						get(c7);
						break;
					case 8:
						get(c8);
						break;
					case 9:
						get(c9);
						break;
					case 10:
						get(c10);
						break;
					case 11:
						get(c12);
						break;
					case 12:
						get(c12);
						break;
					case 13:
						get(c13);
						break;
					case 14:
						if(c14.getNo()>0)//Solo mostrar datos de nuestro modificable si su numero es mayor a 0.
						get(c14);
						break;
					case 15:
						break;
						
					default:
						System.out.println("-Opcion no disponible-");
						break;				
			}	
			}
			while(continuar3==0);
			break;
			
		case 2:
			System.out.println("-----------Dar de Alta-----------");
			AltaA(c14);//Llama al Metodo altaA y manda como argumento c14
			System.out.println("Desea volver al menu (si)(no)");
			i1=txt.next();
			break;
		case 3:
			System.out.println(" ");
			System.out.println("USTED A SALIDO DEL PROGRAMA");
			break;
		default:
			System.out.println("Opcion incorrecta");
			System.out.println("Desea volver al menu (si)(no)");
			i1=txt.next();
			if (i1.equals("no")) {
				System.out.println("USTED A SALIDO DEL PROGRAMA");
				break;
			}
			break;
		}
		}
		while(i1.equals("si"));
		
	}
	static void AltaA(Auto b) {
		int a;
		String txt1;
		double p;
		Scanner txt= new Scanner(System.in);
		 System.out.println("No:");
		 a=txt.nextInt();
		 b.setNo(a);
		 System.out.println("Nombre:");
		 txt1=txt.next();
		 b.setNombre(txt1);
		 System.out.println("Marca:");
		 txt1=txt.next();
		 b.setMarca(txt1);
		 System.out.println("Color:");
		 txt1=txt.next();
		 b.setColor(txt1);
		 System.out.println("Modelo:");
		 a=txt.nextInt();
		 b.setModelo(a);
		 System.out.println("Cilindraje:");
		 a=txt.nextInt();
		 b.setCilindraje(a);
		 System.out.println("Trasmision:");
		 txt1=txt.next();
		 b.setTrasmision(txt1);
		 System.out.println("Precio Factura:");
		 p=txt.nextDouble();
		 b.setPrecioF(p);
		 System.out.println();
	}
	
	static public void menuI(Auto a) {
		Scanner txt= new Scanner(System.in);
		int op;
		int ac=0;
		int vel=2;
		String opM = "no";
		int continuar2 = 0;
		do {
			
			
			
		System.out.println("-----------METODOS-----------");
		System.out.println("1.-Encerder \n 2.-Apagar \n 3.-Parar \n 4.-SubirVelocidad"
				+ " \n 5.-BajarVelocidad \n 6.-Calcular Precio Actual \n7.-Salir");
		System.out.print("Ingresa una opcion:");
		op=txt.nextInt();
		switch(op) {
		case 1:
			a.Encender(ac,a);
			
			break;
		case 2:
			a.Apagar(ac, a);
			break;
		case 3:
			vel=a.Parar(vel, a);
			break;
		case 4:
			vel=a.Acelerar(vel, a);
			break;
		case 5:
			vel=a.BVel(vel, a);
			break;
		case 6:
			System.out.println(a.CalD(a));
			break;
		case 7:
			System.out.println("Gracias por usar ---AGENCIA SAN FELIPE DE LAS FUENTES----");
			break;
		default:
			System.out.println("Esta opcion no esta disponible");
			break;
		}
		
		}while (continuar2 == 0);
	}
	static public String get( Auto pel) {
		int op;
		Scanner txt= new Scanner(System.in);
		String i="no";
		 System.out.println("No:"+ pel.getNo());
		 System.out.println("Nombre:"+ pel.getNombre());
		 System.out.println("Marca:"+ pel.getMarca());
		 System.out.println("Color:"+pel.getColor());
		 System.out.println("Modelo:"+pel.getModelo());
		 System.out.println("Cilindraje:"+pel.getCilindraje());
		 System.out.println("Trasmision:"+pel.getTrasmision());
		 System.out.println("Precio Factura:"+pel.getPrecioF());
		 System.out.println();
		 System.out.println("---------------------------------");
		 System.out.println("1.-Mostrar Metodos \n2.-Volver al Submenu \n3.-Salir");
		 System.out.println("Ingresa una opcion:");
		 op=txt.nextInt();
		 switch(op){
		 case 1:
			 menuI(pel);
			 break;
		 case 2:
			 i="si";
			 break;
		 case 3:
			 i="n";
			 System.out.println("---Gracias por usar nuestro programa---");
			 break;
		}	
		return i; 
	}
}