package ojeador;
import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface Sistema{
 
	@WebMethod String getHelloWorldAsString(String name);
	@WebMethod void agregarJugador (Jugador j);
	@WebMethod void eliminarJugador (Jugador j);
	@WebMethod ArrayList<Jugador> listarJugadores ();
	@WebMethod void agregarOjeo (Jugador j, Ojeo o);
}