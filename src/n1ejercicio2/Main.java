/*
 *  Añade a las clases hijos algunos métodos deprecados, y utilice la anotacion correspondiente.
 *  Invoque desde una clase externa los métodos deprecados, suprimiendo 
 *  mediante la anotación correspondiente los warnings para ser deprecada su utilización.
 */
package n1ejercicio2;

import n1ejercicio1.Hijo1;
import n1ejercicio1.Hijo2;

public class Main {

	public static void main(String[]args) {
		
		Hijo1 hijo1 = new Hijo1(30, "Antonio", "Banderas");
		Hijo2 hijo2 = new Hijo2(20, "Paco", "Banderas");
		
		System.out.println(hijo1.toString());
		System.out.println(hijo1.caminar());
		
		System.out.println(hijo2.toString());
		System.out.println(hijo2.hablar());
		
	}
	
}
