package figuras;

public class Triangulo extends figura {
   double base;
    double altura;

    public Triangulo() {
        super();
        System.out.println("Se creo un triangulo");
    }

    public Triangulo(String nom, double b, double al) {
        super(nom, 0);
        this.base = b;
        this.altura = al;
    }

}

