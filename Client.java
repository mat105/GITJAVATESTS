package ojeador;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
	
	public static void main(String[] args) throws Exception {
	   
		URL url = new URL("http://localhost:9999/ws/ojeador?wsdl");
	
        //1st argument service URI, refer to wsdl document above
	    //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ojeador/", "SistemaImplService");

        Service service = Service.create(url, qname);

        Sistema sistema = service.getPort(Sistema.class);

        Jugador j = new Jugador ("eric", "delantero");
        sistema.agregarJugador(j);
        sistema.agregarOjeo(new Jugador ("eric", "delantero"), new Ojeo ("a","b",new Date (),250000));
        System.out.println (sistema.listarJugadores());
    }

}
