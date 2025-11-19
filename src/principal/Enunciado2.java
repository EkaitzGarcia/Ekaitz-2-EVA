package principal;
import models.Producto;

public class Enunciado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto[] inventario = new Producto[4];
		inventario[0] = new Producto ("Papaya", 2, 4);
		inventario[1] = new Producto ("Pera", 1.23, 30);
		inventario[2] = new Producto ("Manzana", 1.50, 2);
		inventario[3] = new Producto ("Naranja", 0.23, 42);
		double total = 0;
		
		//Calcula la sima de precios de los productos cuyo stock sea impar y no null.
		for(int i = 0; i < inventario.length; i++) {
			if(inventario[i] != null && inventario[i].getStock() %2 != 0 ) {
				total = total + inventario[i].getPrecio();
				System.out.println(inventario[i].toString());
			}
		}
		
		System.out.println("\n" +total);
		
		//Mostrar producto más caro cuyo Stock sea mayor que 5
		String aux = "";
		double precioMax = 0;

		for(int j = 0; j < inventario.length; j++) {
		    if(inventario[j] != null && inventario[j].getStock() > 5) {
		        if(inventario[j].getPrecio() > precioMax) {
		            precioMax = inventario[j].getPrecio();
		            aux = inventario[j].getNombre();
		        }
		    }
		}

		if(!aux.equals("")) {
		    System.out.println("\nEl artículo más caro es: " + aux + " con un precio de: " + precioMax);
		} else {
		    System.out.println("\nNo hay productos con stock mayor que 5");
		}
	}

}
