package principal;
import models.Tarjeta;
import errores.*;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;

public class EjercicioHashMap {

	private static HashMap<String, Tarjeta> map = new HashMap<>(); //Crear el HashMap
	static final int nivelSoporte = 1; //Nivel del departamento de Soporte.
	static final int nivelProdu = 2; //Nivel del departamento de Producción.
	static final int nivelRRHH = 3; //Nivel del departamento de Recursos Humanos.
	static final int nivelCont = 4; //Nivel del departamento de Contabilidad.
	static final int nivelGere = 5; //Nivel del departamnto de Gerencia.
	static String codigo; //Método usado en el case 2.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			
			System.out.println("\n==============MENU==============\n"
					+ "\n1. Agregar tarjeta."
					+ "\n2. Verificar acceso."
					+ "\n3. Revocar tarjeta."
					+ "\n4. Mostrar todas las tarjetas."
					+ "\n5. Mostrar una tarjeta."
					+ "\n6. Finalizar programa.\n"
					+ "\n================================\n");
			
			int opcion = Util.leerInt("\nIntroduce una opción;");
			
			switch(opcion) {
				case 1:
					
					añadirTarjeta();
					break;
					
				case 2:
					
					verificarAcceso();
					break;
					
				case 3:
					
					eliminarTarjeta();
					break;
					
				case 4:
					
					mostrarTarjetas();
					break;
					
				case 5:
					
					mostrarTarjeta();
					break;
					
				case 6:
					
					System.out.println("\nFinalizando programa...");
					return;
					
				default:
					System.out.println("\nOpción no válida.");
			}
		
		}while(true);
	}
	
	//Método para añadir tarjetas (Caso 1)
	public static void añadirTarjeta() {
		
		String nuevoCod; 
		do {
			nuevoCod = Util.introducirCadena("\nIntroduce el código de la tarjeta:"); //Será la clave del HashMap
			
			if(map.containsKey(nuevoCod)) {
				System.out.println("\nYa exixte una tarjeta con ese código.");
			}
		}while(map.containsKey(nuevoCod));
		
		String nuevoNom = Util.introducirCadena("\nIntroduce el nombre del empleado:");
		
		String nuevoDep;
		do {
			nuevoDep = Util.introducirCadena("\nIntroduce el nombre del departamento (Soporte / Producción / RRHH / Contabilidad / Gerencia):");
			
			if(!nuevoDep.equalsIgnoreCase("Soporte") && !nuevoDep.equalsIgnoreCase("Producción") && !nuevoDep.equalsIgnoreCase("RRHH") && !nuevoDep.equalsIgnoreCase("Contabilidad") && !nuevoDep.equalsIgnoreCase("Gerencia")) {
				System.out.println("\nSeleccióna una de las opciones. Cuida las mayusculas y las tildes.");
			}
		
		}while(!nuevoDep.equalsIgnoreCase("Soporte") && !nuevoDep.equalsIgnoreCase("Producción") && !nuevoDep.equalsIgnoreCase("RRHH") && !nuevoDep.equalsIgnoreCase("Contabilidad") && !nuevoDep.equalsIgnoreCase("Gerencia"));
			
		int nuevoLvl;
		do {
			nuevoLvl = Util.leerInt("\nIntroduce el nivel de acceso de la tarjeta del 1 al 5:");
			
			if(nuevoLvl < 1 || nuevoLvl > 5) {
				System.out.println("\nNivel incorrecto.");
			}
		
		}while(nuevoLvl < 1 || nuevoLvl > 5);
		
		//Crear la tarjeta.
		Tarjeta nuevaTarjeta = new Tarjeta(nuevoCod, nuevoNom, nuevoDep, nuevoLvl);
		
		//Añadir el HashMap
		map.put(nuevoCod, nuevaTarjeta);
		
		System.out.println("\nTarjeta añadida. Tienes " +map.size() +" tarjetas registradas.");
	}
	
	//Método para verificar acceso de una tarjeta (Caso 2)
	public static void verificarAcceso() {
		
		do {
			codigo = Util.introducirCadena("\nIntroduce el código de la tarjeta a leer:");
			
			if(!codigo.matches("[a-zA-Z1-5]")) {
				System.out.println("\nIntroduce un código válido.");
			} else if(!map.containsKey(codigo)) {
				System.out.println("\nNo se ha encontrado la clave.");
			}
			
		}while(!map.containsKey(codigo) || !codigo.matches("[a-zA-Z1-5]"));
		
		
		int opcion2;
		do {
			System.out.println("\n---------------DEPARTAMENTOS---------------\n"
					+ "\n1. Soporte."
					+ "\n2. Producción."
					+ "\n3. Recursos Humanos."
					+ "\n4. Contabilidad."
					+ "\n5. Gerencia.\n"
					+ "\n-------------------------------------------\n");
		
		
			opcion2 = Util.leerInt("\nIntroduce el departamento al que quieres acceder:");
			
			if(opcion2 < 1 || opcion2 > 5) {
				System.out.println("\nIntroduce una opción válida.");
			}
		
		}while(opcion2 < 1 || opcion2 > 5);
		
		switch(opcion2) {
			case 1:
				
				verificarNivel1();
				break;
				
			case 2:
				
				verificarNivel2();
				break;
				
			case 3:
				
				verificarNivel3();
				break;
				
			case 4:
				
				verificarNivel4();
				break;
				
			case 5:
				
				verificarNivel5();
				break;
				
			default :
				System.out.println("\nIntroduce una opción válida.");
		}
		
	}
	
	//Método para verificar el acceso al lvl1
	public static void verificarNivel1() {
		
		Tarjeta tarjeta = map.get(codigo);
		
		if(tarjeta.getLvlAcess() < 1) {
			System.out.println("\nAcceso Denegado!");
		} else {
			System.out.println("\nAcceso Concedido!");
		}
	}
	
	//Método para verificar el acceso al lvl2
	public static void verificarNivel2() {
		
		Tarjeta tarjeta = map.get(codigo);
		
		if(tarjeta.getLvlAcess() < 2) {
			System.out.println("\nAcceso Denegado!");
		} else {
			System.out.println("\nAcceso Concedido!");
		}
	}
	
	//Método para verificar el acceso al lvl3
	public static void verificarNivel3() {
		
		Tarjeta tarjeta = map.get(codigo);
			
		if(tarjeta.getLvlAcess() < 3) {
			System.out.println("\nAcceso Denegado!");
		} else {
			System.out.println("\nAcceso Concedido!");
		}
	}
	
	//Método para verificar el acceso al lvl4
	public static void verificarNivel4() {
		
		Tarjeta tarjeta = map.get(codigo);
			
		if(tarjeta.getLvlAcess() < 4) {
			System.out.println("\nAcceso Denegado!");
		} else {
			System.out.println("\nAcceso Concedido!");
		}
	}
	
	//Método para verificar el acceso al lvl5
	public static void verificarNivel5() {
		
		Tarjeta tarjeta = map.get(codigo);
			
		if(tarjeta.getLvlAcess() < 5) {
			System.out.println("\nAcceso Denegado!");
		} else {
			System.out.println("\nAcceso Concedido!");
		}
	}
	
	/*---------------------------------------------------------------------------------*/
	
	//Método para eliminar una tarjeta (Caso 3)
	public static void eliminarTarjeta() {
		String buscarCod;
		Tarjeta aEliminar;
		do {
			buscarCod = Util.introducirCadena("\nIntroduce el código de la tarjeta que deseas eliminar");
			
			aEliminar = map.remove(buscarCod);
			
			if(aEliminar == null) {
				System.out.println("\nNo existe ninguna tarjeta con ese código.");
			} else {
				System.out.println("\nTarjeta revocada.");
			}
		}while(aEliminar == null);
		
	}
	
	//Método para mostrar todas las tarjetas (Caso 4)
	public static void mostrarTarjetas() {
		if(map.isEmpty()) {
			System.out.println("\nNo hay tarjetas registradas.");
			return; //Finaliza el método.
		}
		
		System.out.println("\nTarjetas:");
		for(Tarjeta i : map.values()) {
			System.out.println(i +"\n");
		}
		
		System.out.println("\nTotal: " +map.size() +" tarjetas.");
	}
	
	//Método para mostrar una sola tarjeta (Caso 5)
	public static void mostrarTarjeta() {
		String cod;
		Tarjeta mostrar;
		do {
			cod = Util.introducirCadena("\nIntroduce el código de la tarjeta que quieres mostrar:");
			
			mostrar = map.get(cod);
			
			if(mostrar == null) {
				System.out.println("\nNo existe ninguna tarjeta con ese código.");
			}else {
				System.out.println("\n" +mostrar);
			}
		}while(mostrar == null);
	}

}
