package n1ejercicio2;

public class Padre {

	private int edad;
	private String nombre;
	private String apellido;
	
	public Padre(int edad,String nombre, String apellido) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String caminar() {
		return "El Padre esta caminando";
	}
	
	public String hablar() {
		return "El padre esta hablando";
	}
	
	public String toString() {
		return "Nombre:"+nombre+" "+apellido+" .Edad: "+edad;
	}
}
