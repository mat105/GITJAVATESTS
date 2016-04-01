from suds.client import Client

def crearOjeo (client, clubActual, comentarios, costoPase, fecha):
   ojeo = client.factory.create('ojeo')
   ojeo.clubActual = clubActual
   ojeo.comentarios = comentarios
   ojeo.costoPase = costoPase
   ojeo.fecha = fecha
   return ojeo

def crearJugador (client, nombre, posicion):
   jugador = client.factory.create('jugador')
   jugador.nombre = nombre
   jugador.posicion = posicion
   return jugador

def listarJugadoresClub (client, club):
   jugadoresClub = []
   
   for jugador in client.service.listarJugadores()[0]:
      if (client.service.listarOjeos(jugador)):
         ojeos = client.service.listarOjeos(jugador)[0]
         clubActual = ojeos[len(ojeos)-1].clubActual
         if (clubActual == club):
            jugadoresClub.append (jugador)
   return jugadoresClub

def listarJugadoresPase (client, pase):
   jugadoresCostoAlto = []
   
   for jugador in client.service.listarJugadores()[0]:
      if (client.service.listarOjeos(jugador)):
         ojeos = client.service.listarOjeos(jugador)[0]
         costoPase = ojeos[len(ojeos)-1].costoPase
         if (costoPase >= pase):
            jugadoresCostoAlto.append (jugador)
   return jugadoresCostoAlto

def main():
   client = Client("http://localhost:9999/ws/ojeador?wsdl")
   
   jugador1 = crearJugador (client, "Pepe", "Arquero")
   ojeo1 = crearOjeo (client, "Quilmes", "regular", 1500, "2015/10/11")
   jugador2 = crearJugador (client, "Palermo", "Delantero")
   ojeo2 = crearOjeo (client, "Boca", "bueno", 20000, "2015/12/1")
   jugador3 = crearJugador (client, "Messi", "Delantero")
   ojeo3 = crearOjeo (client, "Barcelona", "bueno", 9000000, "2016/3/1")
   
   client.service.agregarJugador(jugador1)          
   client.service.agregarOjeo(jugador1, ojeo1)
   client.service.agregarJugador(jugador2)          
   client.service.agregarOjeo(jugador2, ojeo2)
   client.service.agregarJugador(jugador3)          
   client.service.agregarOjeo(jugador3, ojeo3)


   for jugador in listarJugadoresClub (client, "Quilmes"):
      client.service.eliminarJugador(jugador)
   for jugador in listarJugadoresPase (client, 1000000):
      client.service.eliminarJugador(jugador)
      
   print (client.service.listarJugadores()[0])
   
main()
