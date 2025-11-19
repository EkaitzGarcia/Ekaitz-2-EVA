package principal;

public class Ejercicio01 {

	public static void main(String[] args) {
		/*El programa debe:
		 * 	- Convertir el primer String a int.
		 *  - Convertir el segundo String a double.
		 *  - Calcular la suma, resta, producto y cociente entre ambos.
		 *  - Mostrar los resultados con DOS DECIMALES.*/
		
		System.out.println("\nIntroudce el primer número:");
		String num1 = Util.introducirCadena();
		
		System.out.println("\nIntroduce el segundo número:");
		String num2 = Util.introducirCadena();
		
		//Convertir el primer String a int.
		int nume1 = Integer.parseInt(num1);
		
		//Convertir el segundo String a int.
		int nume2 = Integer.parseInt(num2);
		
		//Calcular la suma entre ambos.
		System.out.println("\nVoy a calcular la suma entre los 2 números.");
		int suma = nume1 + nume2;
		
		System.out.println("\n" +nume1 +" + " +nume2 +"= " +suma);
		
		//Calcular la resta entre ambos.
		
		System.out.println("\nAhora voy a calcular la resta entre los 2 números.");
		int resta = nume1 - nume2;
		
		System.out.println("\n" +nume1 +" - " +nume2 +"= " +resta);
		
		//Calcular el producto entre los 2 números.
		System.out.println("\nAhora voy a calcular el producto entre ambos números.");
		int producto = nume1 * nume2;
		
		System.out.println("\n" +nume1 +" · " +nume2 +"= " +producto);
		
		//Calcular el cociente entre ambos números
		System.out.println("\nAhora voy a calcular el cociente entre ambos números");
		double cociente = nume1 / nume2;
		
		System.out.println("\n" +nume1 +" / " +nume2 +"= " +cociente);
	}

}
