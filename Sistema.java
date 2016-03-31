package ojeador;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface Sistema{
 
	@WebMethod void agregarJugador (Jugador j);
	@WebMethod void eliminarJugador (Jugador j);
	@WebMethod Jugador[] listarJugadores ();
	@WebMethod void agregarOjeo (Jugador j, Ojeo o);
	@WebMethod Ojeo[] listarOjeos(Jugador j);
}