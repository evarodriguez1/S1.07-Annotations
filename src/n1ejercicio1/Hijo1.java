package n1ejercicio1;

public class Hijo1 extends Padre {

	public Hijo1(int edad, String nombre, String apellido) {
		super(30, "Antonio", "Banderas");
		
	}

	@Override
	public String caminar() {
		return "El hijo1 esta caminando";
	}
	
}
