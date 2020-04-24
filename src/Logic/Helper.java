package Logic;


import java.util.Scanner;
import Model.Coche;

public class Helper {	
	Coche c;
	
	public void introducirCoche() {
		Scanner sc=new Scanner(System.in);
		String[] atributos= {"la marca", "el modelo", "la matricula", "los kilometros", "el coste"};
		
		for(int i=0;i<atributos.length; i++) {
			System.out.println("Introduce "+ atributos[i]+" del coche");
			atributos[i]=sc.nextLine();
		}
		
		int km=Integer.parseInt(atributos[3]);
		int coste=Integer.parseInt(atributos[4]);
		
		c = new Coche(atributos[0],atributos[1],atributos[2],km,coste);
		sc.close();
	}
	
	public void mejora() {
		
	}
	
	public void mejora1() {}
	
	
	public String estadoCoche() {
		if (c.getEstado()=="Nuevo") return "Es un coche nuevo";
			else return "Es un coche de segunda mano";
	}
	public void totalCompra() {
		
	}
	
}
