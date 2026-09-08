
public class Rol {
	private String nombre;
	private String descripcion;
	private int codigo;
	private boolean estado;
	
	public Rol(String nombre, String descripcion, int codigo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.estado = false;
	}
	
	public int getCodigoRol() {
		return this.codigo;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
}
