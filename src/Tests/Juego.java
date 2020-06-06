package Tests;
import java.util.Scanner;

import CrearEnemigos_abstractfactory.*;
import Ataques2_decorator.*;
import CrearEnemigos_abstractfactory.*;


public class Juego
{

    static public void main(String[] args)
    {
		Scanner scan = new Scanner(System.in);

        System.out.println("El gran debate");

        System.out.println("1. Jugar");
        System.out.println("2. Reglas");
        System.out.println("3. Salir");

        int menu;

        do
        {
            menu = scan.nextInt();
            
            switch(menu)
            {
                case 1:
                    jugar();
                    break;

                case 2:
                	System.out.println("Mirar el pdf adjuntado con el juego (y si, esta funcion esta hecha para rellenar.)");
                    break;

                case 3:
                default:
                    break;
            }           
        }
        while(menu !=3);
    }

    @SuppressWarnings("null")
	static void jugar()
    {
        Scanner scan = new Scanner(System.in);
        Politico jugador = null, enemigo = null;
        ConcreteComponent CC = new ConcreteComponent();
        Component caradura = null, caraduraRival = null;
        int opcion;
        
        System.out.println();
        System.out.println("Elige tu personaje:");

        System.out.println("1. Sanchez");
        System.out.println("2. Iglesias");
        System.out.println("3. Abascal");
        System.out.println("4. Casado");
        System.out.println("5. Rivera");

        do
        {
            opcion = scan.nextInt();

            switch(opcion)
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
        }
        while(opcion < 1 || opcion > 5);
        
        System.out.println("Has elegido a " + jugador.getName());
        System.out.println("Ataque: " + jugador.getAttackStat());
        System.out.println("Defensa: " + jugador.getDefenceStat()); 
        System.out.println("Ataque: " + jugador.getRecruitStat());
        System.out.println();
        System.out.println("Elige tu 'caradura legendario':");

        System.out.println("1. Franco");
        System.out.println("2. Rajoy");
        System.out.println("3. Zapatero");
        System.out.println("4. Blanco");
        System.out.println("5. Botella");

        do
        {
            opcion = scan.nextInt();

            switch(opcion)
            {
                case 1:
                	caradura = new FC(CC);
                    break;
                case 2:
                	caradura = new RJ(CC);
                    break;
                case 3:
                	caradura = new ZP(CC);
                    break;
                case 4:
                	caradura = new CB(CC);
                    break;
                case 5:
                	caradura = new BT(CC);
                    break;
                default:
                    break;                 
             }
        }
        while(opcion < 1|| opcion > 5);
        
        caradura.decorate(jugador);


        /*Al empezar cada nivel, un politico enemigo aleatorio sale*/
        opcion = ((int) (Math.random() * 4)) + 1;

        switch(opcion)
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
        
        opcion = ((int) (Math.random() * 4)) + 1;
        
        switch(opcion)
        {
        	case 1:
        		caraduraRival = new FC(CC);
        		break;
        	case 2:
        		caraduraRival = new RJ(CC);
        		break;
        	case 3:
        		caraduraRival = new ZP(CC);
        		break;
        	case 4:
        		caraduraRival = new CB(CC);
        		break;
        	case 5:
        		caraduraRival = new BT(CC);
        		break;
        	default:
        		break;
        }

        caraduraRival.decorate(enemigo);

        
        for(int i = 1; i <= 10; i++)
        {
        	System.out.println("Dia " + i);
        	
        	System.out.println("Acciones:");
        	
        	 System.out.println("1. Captar");
             System.out.println("2. Acusar");
             System.out.println("3. Punalada Trapera");
             System.out.println("4. Justificar");
             if(i != 1)
             {
             System.out.println("5. Invocar");
             }
             
             opcion = scan.nextInt();
             
             switch(opcion)
             {
             	case 1:
             			
             		break;
             	case 2:
             		
             		break;
             	case 3:
             		
             		break;
             	case 4:
             		
             		break;
             	default:
             		break;
             }
             
             if(opcion == 5 && i != 1)
             {
            	 
             }
        }
        
        
        
    }
}
