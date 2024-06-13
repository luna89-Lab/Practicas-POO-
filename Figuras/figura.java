package figuras;

public class figura {
  String nombre;
    double area;

    public figura() {
        System.out.println("Se creo una figura");
    }

    public figura(String nom, double a) {
        this.nombre = nom;
        this.area = a;
    }

    public void Area() {
        System.out.println("El area de la figura "+nombre+" es: "+area);
    }

    public void DibujarFigura() {
        System.out.println("Dibujando figura "+nombre);
    }
    
}
