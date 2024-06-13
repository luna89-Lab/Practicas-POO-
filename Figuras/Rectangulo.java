package figuras;

public class Rectangulo extends Figuras {

    double lado;

    public Rectangulo() {
        super();
        System.out.println("Se creo un rectangulo");
    }

    public Rectangulo(String nom, double l) {
        super(nom, 0);
        this.lado = l;
    }

    public void Area() {
        area = lado * lado;
        System.out.println("El area de la figura " + nombre + " es: " + area);
    }

    public void Area(double lado) {
        area = lado * lado;
        System.out.println("El area de la figura " + nombre + " con el valor agregado es: " + area);
    }

    public void DibujarFigura() {
        System.out.println("Dibujando figura rectangulo llamada: " + nombre);
    }

}
