package es.uah.cursos.model;

public class Curso {
	
	//Propiedades de la clase
	
	private String nombre;
	private int duracion;
	private String profesor;
	private double precio;
	
	//Constructores de la clase
	
	public Curso(String nombre, int duracion, String profesor, double precio) {
		this.duracion = duracion;
		this.nombre = nombre;
		this.precio = precio;
		this.profesor = profesor;
	}
	
	public Curso() {
		
	}
	
	//Getters
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDuracion() {
		return this.duracion;
	}
	
	public String getProfesor() {
		return this.profesor;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	
	//Setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
	
	

}
