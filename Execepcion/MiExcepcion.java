package ejemploExcepciones;

public class MiExcepcion extends Exception {

    MiExcepcion() {

        super();
    }

    MiExcepcion(String cadena) {
        super(cadena);
    }
}
