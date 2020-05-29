//package Tests;
//import java.util.Scanner;
//import Politicos.*;
//
//
//public class Juego
//{
//
//    static public void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("El gran debate");
//
//        System.out.println("1. Jugar");
//        System.out.println("2. Reglas");
//        System.out.println("3. Salir");
//
//        int menu;
//
//        do
//        {
//            menu = scan.next().charAt(0);
//
//            switch(menu)
//            {
//                case 1:
//                    jugar();
//                    break;
//
//                case 2:
//                    printReglas();
//                    break;
//
//                case 3:
//                default:
//                    break;
//            }
//        }
//        while(menu !=3);
//    }
//
//
//    static void printReglas()
//    {
//        System.out.println("Est?s en un debate electoral.");
//        System.out.println("Tu objetivo es reunir m?s seguidores que tu oponente.");
//        System.out.println("Podr?s llamar la atenci?n a la poblaci?n sin preferencia para que te siga.");
//        System.out.println("Tambi?n puedes intentar quitarle los seguidores a tu contrincante.");
//        System.out.println("Tienes la habilidad de invocar a un 'caradura legendario', que te aportar? ventajas temporalmente");
//        System.out.println("Tienes 10 turnos antes de que se realicen las elecciones. Demuestra qui?n sabe gobernar!");
//    }
//
//
//    static void jugar()
//    {
//        Scanner scan = new Scanner(System.in);
//        Politico jugador, enemigo;
//        int opcion;
//
//        System.out.println("Elige tu personaje:");
//
//        System.out.println("1. Sanchez 		[ATQ: DEF: REC:]");
//        System.out.println("2. Iglesias 	[ATQ: DEF: REC:]");
//        System.out.println("3. Abascal		[ATQ: DEF: REC:]");
//        System.out.println("4. Casado 		[ATQ: DEF: REC:]");
//        System.out.println("5. Rivera 		[ATQ: DEF: REC:]");
//
//        do
//        {
//            opcion = scan.next().charAt(0);
//
//            switch(opcion)
//            {
//                case 1:
//                    jugador = new Sanchez();
//                    break;
//                case 2:
//                    jugador = new Iglesias();
//                    break;
//                case 3:
//                    jugador = new Abascal();
//                    break;
//                case 4:
//                    jugador = new Casado();
//                    break;
//                case 5:
//                    jugador = new Rivera();
//                    break;
//                default:
//                    break;
//            }
//        }
//        while(opcion < 1|| opcion > 5);
//
//        System.out.println("Elige tu 'caradura legendario':");
//
//        System.out.println("1. Franco		[+3 ataque, 2 turnos]");
//        System.out.println("2. Rajoy		[+2 defensa, 3 turnos]");
//        System.out.println("3. Zapatero		[stats aleatorias, turnos aleatorios]");
//        System.out.println("4. Blanco		[-50% votantes rivel, -20% votantes tuyos]");
//        System.out.println("5. Botella		[+20% votantes indecisos]");
//
//        do
//        {
//            opcion = scan.next().charAt(0);
//
//            switch(opcion)
//            {
//                case 1:
//                    //decorar politico con
//                    break;
//                case 2:
//
//                    break;
//                case 3:
//
//                    break;
//                case 4:
//
//                    break;
//                case 5:
//
//                    break;
//                default:
//                    break;
//            }
//        }
//        while(opcion < 1|| opcion > 5);
//
//        /*Al empezar cada nivel, un politico enemigo aleatorio sale*/
//        opcion = ((int) (Math.random() * 4)) + 1;
//
//        switch(opcion)
//        {
//            case 1:
//                enemigo = new Sanchez();
//                break;
//            case 2:
//                enemigo = new Iglesias();
//                break;
//            case 3:
//                enemigo = new Abascal();
//                break;
//            case 4:
//                enemigo = new Casado();
//                break;
//            case 5:
//                enemigo = new Rivera();
//                break;
//        }
//
//
//
//    }
//}
