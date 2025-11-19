package principal;

import models.Producto;

public class Enunciado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto[] inventario = new Producto[4];
		inventario[0] = new Producto ("Papaya", 2, 30);
		inventario[1] = new Producto ("Pera", 1.23, 11);
		inventario[2] = new Producto ("Manzana", 1.50, 20);
		inventario[3] = new Producto ("Naranja", 1.23, 45);
		double total = 0;
		
		for(int i = 0; i < inventario.length; i++) {
			if(inventario[i] != null && inventario[i].getStock() %2 != 0 ) {
				total = total + inventario[i].getPrecio();
				System.out.println(inventario[i].toString());
			}
		}
		
		System.out.println("\n" +total);
	}

}
