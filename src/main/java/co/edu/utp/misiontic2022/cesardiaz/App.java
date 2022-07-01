package co.edu.utp.misiontic2022.cesardiaz;

import co.edu.utp.misiontic2022.cesardiaz.modelo.Casilla;
import co.edu.utp.misiontic2022.cesardiaz.modelo.Color;
import co.edu.utp.misiontic2022.cesardiaz.modelo.Jugador;
import co.edu.utp.misiontic2022.cesardiaz.modelo.Tablero;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        var tablero = new Tablero("Cesar Diaz", "Brayan Valencia");

        tablero.imprimirTablero();
    }
}
