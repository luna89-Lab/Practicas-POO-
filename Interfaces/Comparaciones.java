package Ejemplo_Relaciones;

import Ejemplo_Relaciones.Relaciones;

public class Comparaciones implements Relaciones {

    int numero1;
    int numero2;

    public Comparaciones() {
    }

    public Comparaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public boolean esMayorQue() {
        if ((this.numero1) <= (this.numero2)) {
            return false;
        }
        return true;

    }

    public boolean esMenorQue() {
        if ((this.numero1) >= (this.numero2)) {
            return false;
        }
        return true;
    }

    public boolean esIgualQue() {
        if (this.numero1 != this.numero2) {
            return false;
        }
        return true;
    }
}
