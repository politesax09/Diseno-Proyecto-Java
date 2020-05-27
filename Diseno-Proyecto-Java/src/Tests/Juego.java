package Tests;
import java.util.Scanner;

import Politicos.Politico;
import Politicos.Sanchez;

public class Juego
{
	static public void main(char[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("El gran debate");
		
		System.out.println("1. Jugar");
		System.out.println("2. Reglas");
		System.out.println("3. Salir");
		
		int menu;
		
		do
		{
			menu = scan.next().charAt(0);
			
			switch(menu)
			{
				case 1:
					jugar();
					break;
					
				case 2:
					printReglas();
					break;
					
				case 3:							
				default:					
					break;
			}
		}
		while(menu !=3);
	}
	
	
	static void printReglas()
	{
		System.out.println("Estás en un debate electoral.");
		System.out.println("Tu objetivo es reunir más seguidores que tu oponente.");
		System.out.println("Podrás llamar la atención a la población sin preferencia para que te siga.");
		System.out.println("También puedes intentar quitarle los seguidores a tu contrincante.");
		System.out.println("Tienes la habilidad de invocar a un 'caradura legendario', que te aportará ventajas temporalmente");
		System.out.println("Tienes 10 turnos antes de que se realicen las elecciones. Demuestra quién sabe gobernar!");
	}
	
	static void jugar()
	{
		Scanner scan = new Scanner(System.in);
		Politico jugador, enemigo;
		int politico;
		
		System.out.println("Elige tu personaje:");		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		do
		{
			politico = scan.next().charAt(0);
			
			switch(politico)
			{
				case 1:
					jugador = new Sanchez();
					break;
				case 2:
					jugador = new Iglesias();
					break;
				case 3:
					jugador = new Abascal();
					break;
				case 4:
					jugador = new Casado();
					break;
				case 5:
					jugador = new Rivera();	
					break;
				default:
					break;					
			}
			
			politico = ((int) (Math.random() * 4)) + 1;			
			
			switch(politico)
			{
				case 1:
					enemigo = new Sanchez();
					break;
				case 2:
					enemigo = new Iglesias();
					break;
				case 3:
					enemigo = new Abascal();
					break;
				case 4:
					enemigo = new Casado();
					break;
				case 5:
					enemigo = new Rivera();	
					break;				
			}
			
			

	}
}
