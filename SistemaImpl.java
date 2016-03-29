package ojeador;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		Jugador eliminado = null;
		for (Jugador jugador : jugadores) {
			if (jugador.equals(j))
				eliminado = jugador;
		}
		if (eliminado != null)
			jugadores.remove(eliminado);
	}

	@Override
	@WebMethod
	public Object[] listarJugadores() {
		return  jugadores.toArray();
	}
	
	@Override
	@WebMethod
	public void agregarOjeo(Jugador j, Ojeo o) {
		Jugador ojeado = null;
		for (Jugador jugador : jugadores) {
			if (jugador.equals(j))
				ojeado = jugador;
		}
		if (ojeado!=null)
			ojeado.agregarOjeo(o);
	}
	
	
}