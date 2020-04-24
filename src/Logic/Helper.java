package Logic;


import java.util.Scanner;
import Model.Coche;

public class Helper {	
	Scanner sc=new Scanner(System.in);
	Coche c;
	int coste;

	public void introducirCoche() {
		String[] atributos= {"la marca", "el modelo", "la matricula", "el color actual", "los kilometros", "el coste"};
		
		for(int i=0;i<atributos.length; i++) {
			System.out.println("Introduce "+ atributos[i]+" del coche");
			atributos[i]=sc.nextLine();
		}
		
		int km=Integer.parseInt(atributos[4]);
		coste=Integer.parseInt(atributos[5]);
		
		c = new Coche(atributos[0],atributos[1],atributos[2], atributos[3],km,coste);
		sc.close();
	}
	
	public void mejora() {
		System.out.println("Menu de mejoras:\n Capa de pintura: opción 1\n Tapizado: opción 2\n Añadir vaca: "+
		"opción 3\n Añadir remolque a la compra: opción 4\nInserta el número de mejora que desea realizar al coche");
		int opcion=sc.nextInt();
		switch(opcion){
			case  1: 
				pintura(); 
				break;
			case 2: 
				tapizado();
				break;
			case 3: 
				vaca();
				break;
			case 4: 
				remolque();
				break;
			default: System.out.println("Opción no valida");
		}
		sc.close();
	}
	
	public void pintura() {
		System.out.println("Color actual: "+c.getColor()+", cambiar a: ");
		String color=sc.nextLine();
		c.setColor(color);
		c.masCosto(60);
		sc.close();
	}
	
	public void tapizado() {
		System.out.println("Opciones de tapizado: \n-Tapizado de tela: opción 1 \n-Tapizado de cuero: opción 2"+
							"\n-Tapizado de vinilo: opción 3");
		int opcion=sc.nextInt();
		if(opcion==1 || opcion==3) c.masCosto(180);
		else if (opcion==2) c.masCosto(380);
		else System.out.println("Opción no válida, inténtelo de nuevo");
		sc.close();
	}

	public void vaca() {
		c.setVaca(true);
		c.masCosto(40);
	}

	public void remolque() {
		c.setRemolque(true);
		c.masCosto(120);
	}
	
	public String estadoCoche() {
		if (c.getEstado()=="Nuevo") return "Es un coche nuevo";
			else return "Es un coche de segunda mano";
	}

	public String tiene(boolean objeto){
		if (objeto==true) return "con ";
		else return "sin ";
	}

	public String Factura() {
		return estadoCoche()+" con coste inicial de "+coste+"€. \nAhora"+tiene(c.isRemolque())+" vaca colocada y "
		+tiene(c.isRemolque())+" remolque.\n Tras las mejoras el coste final del coche es: "+c.getCoste()+"€";
	}

}
