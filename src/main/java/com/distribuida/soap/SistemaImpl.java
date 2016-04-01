package com.distribuida.soap;

import java.util.ArrayList;
import java.util.Arrays;
import javax.jws.WebMethod;
import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "ojeador.Sistema")
public class SistemaImpl implements Sistema{
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador> ();

	@WebMethod
	public void agregarJugador(Jugador j) {
		jugadores.add (j);
	}

	@WebMethod
	public void eliminarJugador(Jugador j) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre ().equalsIgnoreCase (j.getNombre ())) {
				jugadores.remove (jugador);
				return;
			}
		}
	}

	@Override
	@WebMethod
	public Jugador[] listarJugadores() {

		return  jugadores.toArray(new Jugador[0]);
	}

	@Override
	@WebMethod
	public void agregarOjeo(Jugador j, Ojeo o) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre ().equalsIgnoreCase (j.getNombre ())) {
				jugador.agregarOjeo(o);
				return;
			}
		}
	}

	@Override
	@WebMethod
	public Ojeo[] listarOjeos(Jugador j) {
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre ().equalsIgnoreCase (j.getNombre ()))
				return jugador.getOjeos ();
		}
		return new Ojeo[0];
	}

}
