package POO;

import java.time.LocalDate;

public class Boleteria {
	/*
	*
	Constante publica determina máximo de clientes a atender
	*/
	public static final int MAX_INSCRIPTOS = 20;
	//	guardo el nombre de la boca de expendio
	private	String nombre;
	private Integer[] vendidas;
	private	LocalDate fechaInicio;
	private	int cantidadClientes;
	
	public Boleteria() {
	this.cantidadClientes=0;
	this.vendidas = new Integer[MAX_INSCRIPTOS];}
	
	public String getNombre(){return nombre;}
	public void setNombre(String nombre) { this.nombre=nombre;}
	public LocalDate getFechaInicio () { return fechaInicio;}
	public void setFechaInicio (LocalDate fechaInicio ) { this.fechaInicio = fechaInicio;}
	public Integer[] getVendidas() { return vendidas ;}
	public void setVendidas (Integer[] vendidas) { this.vendidas = vendidas ;}
	public int getCantidadClientes() { return cantidadClientes ;}
	public void setCantidadClientes (int c) {this.cantidadClientes =c;}
}
