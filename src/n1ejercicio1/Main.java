/*
 * Crea una jerarquía de objetos Java donde los objetos hijo sobreescriban 
 * alguna funcionalidad del objeto padre utilizando @Override. 
 * Añade una clase que efectúe las invocaciones necesarias demostrando el punto anterior.
 */
package n1ejercicio1;

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
