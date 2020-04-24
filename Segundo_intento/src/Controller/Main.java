package Controller;

import Model.Cuenta;
import Logic.operaciones;

public class Main {
	
	public static void main(String[]args) {
		Cuenta cta = new Cuenta("Juan Rodriguez", "167234-Y", "ES00168234186", 1663);
		
		cta.setDni("48462379-Y");
		cta.getDni();
		
		operaciones.ingreso(cta, 150);
		
		System.out.println("Ha retirado 20 euros, su saldo ahora es de: "+operaciones.retiro(cta, 20));
	
	}
}
