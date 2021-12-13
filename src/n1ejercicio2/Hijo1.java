package n1ejercicio2;

public class Hijo1 extends Padre {

	public Hijo1(int edad, String nombre, String apellido) {
		super(30, "Antonio", "Banderas");
		
	}
	
	@Deprecated
	public String caminar() {
		return "El hijo1 esta caminando ";
	}
}
