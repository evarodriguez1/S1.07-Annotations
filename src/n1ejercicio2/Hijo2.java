package n1ejercicio2;

public class Hijo2 extends Padre {

	public Hijo2(int edad, String nombre, String apellido) {
		super(20, "Paco", "Banderas");
		
	}
	
	@Deprecated
	public String hablar() {
		return "El hijo2 esta hablando";
	}
}
