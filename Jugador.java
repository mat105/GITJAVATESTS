package ojeador;

import java.util.ArrayList;

public class Jugador {
	private String nombre, posicion;
	private ArrayList<Ojeo> ojeos = new ArrayList<Ojeo> ();

	public Jugador() {}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setOjeos(ArrayList<Ojeo> ojeos) {
		this.ojeos = ojeos;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void agregarOjeo (Ojeo j) {
		ojeos.add (j);
	}

	public ArrayList<Ojeo> getOjeos() {
		return ojeos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion
				+ ", ojeos=" + ojeos + "]";
	}
}
