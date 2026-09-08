
public class Rol {
	private String nombre;
	private String descripcion;
	private int codigo = this.hashCode();
	private boolean estado;
	
	public Rol(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = true;
	}
	
	public Rol(String nombre, String descripcion, boolean estado) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	public int getCodigoRol() {
		return this.codigo;
	}
	
	public boolean estaActivo() {
		return estado;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
}
