package ejemploExcepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class PruebaExcepcion {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream entrada = null;
        Lanzadora lanza = new Lanzadora();
        int leo;
        try {
            entrada = new FileInputStream("archivo.txt");

            while ((leo = entrada.read()) != -1) {
                lanza.lanzaSiNegativo(leo);
            }
            System.out.println("Todo fue bien");
        } catch (MiExcepcion e) {
            System.out.println("Excepcion presentada: " + e.getMessage());
        }
    }
}
