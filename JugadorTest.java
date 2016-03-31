package ojeador;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class JugadorTest  extends TestCase {
    public JugadorTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( JugadorTest.class );
    }

    public void testJugador() {
   	  Jugador j = new Jugador ();
        assertTrue (j.getOjeos ().length==0);
   	  j.agregarOjeo (new Ojeo ());
   	  assertTrue (j.getOjeos ().length==1);
    }
    
}
