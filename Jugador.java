package ojeador;

import java.util.Arrays;

public class Jugador {
	private String nombre, posicion;
	private Ojeo[] ojeos = new Ojeo[0];

	public Jugador() {}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void agregarOjeo (Ojeo o) {
		Ojeo nuevo[] = Arrays.copyOf (ojeos, ojeos.length+1);
		nuevo[ojeos.length] = o;
		ojeos = nuevo;
	}

	public Ojeo[] getOjeos() {
		return ojeos;
	}
}
