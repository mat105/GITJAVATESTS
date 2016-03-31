package ojeador;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SistemaTest  extends TestCase {
    public SistemaTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( SistemaTest.class );
    }

    public void testJugador() {
   	  SistemaImpl s = new SistemaImpl ();
   	  Jugador j = new Jugador ();
   	  j.setNombre ("test");
   	  
   	  assertTrue (s.listarJugadores ().length==0);
   	  s.agregarJugador (j);
   	  assertTrue (s.listarJugadores ().length==1);
   	  assertTrue (s.listarOjeos (j).length==0);
   	  s.agregarOjeo (j, new Ojeo ());
   	  assertTrue (s.listarOjeos (j).length==1);
   	  s.eliminarJugador (j);
   	  assertTrue (s.listarJugadores ().length==0);
    }
    
}
