package Controller;

import java.util.Scanner;

import Logic.Helper;

public class Compra {
	public static void main(String[] args) {
		Helper h= new Helper();
		Scanner sc=new Scanner(System.in);
		
		h.introducirCoche();

		System.out.println("¿Desea realizarle alguna mejora al coche? Escriba true o false ");
		boolean mejora=sc.nextBoolean();
		while(mejora){
			h.mejora();
			System.out.println("¿Desea realizarle alguna otra mejora al coche? Escriba true o false ");
			mejora=sc.nextBoolean();
		}
		
		h.Factura();
		sc.close();
	}
	
}
