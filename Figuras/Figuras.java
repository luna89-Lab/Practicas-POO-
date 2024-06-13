package figuras;

public class Figuras extends figura {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Pirámide", 5, 3);
        Triangulo triangulo2 = new Triangulo();
        Circulo rueda = new Circulo("Llanta", 15);
        Circulo volante = new Circulo("Volante deportivo", 31);
        Rectangulo rectangulo = new Rectangulo("Edificio", 6);
        Rectangulo caja = new Rectangulo();

        triangulo.Area();
        triangulo2.nombre = "Bill";
        triangulo2.DibujarFigura();
        rueda.Area();
        volante.DibujarFigura();
        rectangulo.Area();
        caja.nombre = "Caja";
        caja.Area(4);
        caja.DibujarFigura();
    }
}
