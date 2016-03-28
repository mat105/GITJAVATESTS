package ojeador;

import java.util.ArrayList;

public class Jugador {
	private String nombre, posicion;
	private ArrayList<Ojeo> ojeos = new ArrayList<Ojeo> ();

	public Jugador() {}
	
	public Jugador (String nombre, String posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
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
