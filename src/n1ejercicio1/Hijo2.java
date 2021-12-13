package n1ejercicio1;

public class Hijo2 extends Padre{

	public Hijo2(int edad, String nombre, String apellido) {
		super(20, "Paco", "Banderas");
		
	}

	@Override
	public String hablar() {
		return "El hijo2 esta hablando";
	}
}
