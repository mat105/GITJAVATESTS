package ojeador;
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
	public Jugador[] listarJugadores() {
		
		return  jugadores.toArray(new Jugador[0]);
	}
	
	@Override
	@WebMethod
	public void agregarOjeo(Jugador j, Ojeo o) {
		Jugador ojeado = null;
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre ().equalsIgnoreCase (j.getNombre ()))
				ojeado = jugador;
		}
		if (ojeado!=null)
			ojeado.agregarOjeo(o);
	}
	
	@Override
	@WebMethod
	public Ojeo[] listarOjeos(Jugador j) {
		Jugador ojeado = null;
		for (Jugador jugador : jugadores) {
			if (jugador.getNombre ().equalsIgnoreCase (j.getNombre ()))
				ojeado = jugador;
		}
		if (ojeado!=null)
			return jugadores.get (0).getOjeos ();
		return new Ojeo[0];
	}
	
}