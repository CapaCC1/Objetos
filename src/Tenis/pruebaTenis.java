package Tenis;

import java.util.Scanner;

public class pruebaTenis {

	public static void main(String[] args) {
		
		Scanner in1 = new Scanner (System.in);
		boolean salir = false;
		
		System.out.println("FINAL RONALD GARROS");
		System.out.println("");
		System.out.println("Introduzca el NOMBRE del PRIMER EQUIPO");
		String primerEquipo = in1.next();
		System.out.print("Jugador 1: ");
		in1.nextLine();
		String jugadorN1 = in1.nextLine();
		Jugador jugador1 = new Jugador(jugadorN1);
		
		System.out.print("Jugador 2: ");
		String jugadorN2 = in1.nextLine();
		Jugador jugador2 = new Jugador(jugadorN2);
		
		Equipo equipo1 = new Equipo(primerEquipo, jugador1, jugador2);
		//System.out.println(equipo1);
		
		System.out.println("");
		System.out.println("Introduzca el NOMBRE del SEGUNDO EQUIPO");
		String segundoEquipo = in1.next();
		System.out.print("Jugador 1: ");
		in1.nextLine();
		jugadorN1 = in1.nextLine();
		jugador1 = new Jugador(jugadorN1);
		
		System.out.print("Jugador 2: ");
		jugadorN2 = in1.nextLine();
		jugador2 = new Jugador(jugadorN2);
		
		Equipo equipo2 = new Equipo(segundoEquipo, jugador1, jugador2);
		//System.out.println(equipo2);
		
		
		while(!salir) {
			System.out.println("");
			System.out.println("ESTADISTICAS");
			System.out.println("1. Contabiliza Punto Ganador");
			System.out.println("2. Contabiliza Error No Forzado");
			System.out.println("3. Contabiliza Saque Directo");
			System.out.println("4. Muestra Estadisticas de Jugador");
			int seleccion = in1.nextInt();
			switch(seleccion) {
			case 1:
				System.out.println("");
				System.out.println("*CONTABILIZA PUNTO GANADOR*");
				System.out.println("");
				
				break;
			case 2:
				System.out.println("");
				System.out.println("CONTABILIZA ERROR NO FORZADO");
				System.out.println("");
				
				break;
			case 3:
				System.out.println("");
				System.out.println("CONTABILIZA SAQUE DIRECTO");
				System.out.println("");
				
				break;
			case 4:
				System.out.println("");
				System.out.println("MUESTRA ESTADISTICAS DE JUGADOR");
				
				break;
			}
		}
	}

}
