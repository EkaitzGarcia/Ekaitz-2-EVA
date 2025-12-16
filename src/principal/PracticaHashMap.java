package principal;
import models.Tarjeta;
import java.util.HashMap;
import java.util.Iterator;

public class PracticaHashMap {

	static HashMap<String,Tarjeta> map = new HashMap<String,Tarjeta>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do { 
			System.out.println("\n==============MENU==============\n"
					+ "\n1. Registrar tarjeta."
					+ "\n2. Verificar nivel de acceso."
					+ "\n3. Eliminar tarjeta."
					+ "\n4. Mostrar todas las tarjetas registradas."
					+ "\n5. Mostrar datos de tarjeta."
					+ "\n6. Finalizar programa."
					+ "\n================================\n");
		
			int opcion = Util.leerInt("\nIntroduce una opción:");
			
			switch(opcion) {
				case 1:
					
					agregarTarjeta();
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
					
			}
		
		}while(true);
	}
	
	//Método para añadir tarjetas.
	public static void agregarTarjeta() {
		
		String nuevoCod;
		do {
			nuevoCod = Util.introducirCadena("\nIntroduce el código del empleado:");
		
		}while(map.containsKey(nuevoCod));
		String nuevoNom = Util.introducirCadena("\nIntroduce el nombre del empleado:");
		String nuevoDep = Util.introducirCadena("\nIntroduce el nombre del departamento:");
		int nuevoLvl;
		do {
			
			nuevoLvl = Util.leerInt("\nIntroduce el nivel de acceso del 1 al 5:");
			
			if(nuevoLvl < 1 || nuevoLvl > 5) {
				System.out.println("\nIntroduce un valor válido.");
			}
			
		}while(nuevoLvl < 1 || nuevoLvl > 5);
		
		//Agregar datos a la tarjeta.
		Tarjeta nueva = new Tarjeta(nuevoCod, nuevoNom, nuevoDep, nuevoLvl);
		
		//Agregar la tarjeta al HashMap
		map.put(nuevoCod, nueva);
		
		System.out.println("\nTarjeta introducida, tienes " +map.size() +" tarjeta/s registradas.");
		
	}
	
	//Método para verificar acceso de la tarjeta.
	public static void verificarAcceso() {
		final int depInfor = 1; //Departamento de informática
		final int depRRHH = 2; //Departamento de Recursos Humanos.
		final int dep
	}
	
	//Método para eliminar tarjeta.
	public static void eliminarTarjeta() {
		
	}
	
	//Método para mostrar todas las tarjetas.
	public static void mostrarTarjetas() {
		
	}
	
	//Método para mostrar una tarjeta individualmente.
	public static void mostrarTarjeta() {
		
	}
}
