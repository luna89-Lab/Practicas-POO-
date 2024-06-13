
package figuras;

public class Circulo extends figura {
   double radio;
    public Circulo(){
        super();
        System.out.println("Se creo un circulo");
    }

    public Circulo(String nom, double r){
        super(nom, 0);
        this.radio = r;
    }

    public void Area() {
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area de la figura "+nombre+" es: "+area);
    }

    public void DibujarFigura() {
        System.out.println("Dibujando un circulo llamado: "+nombre);
    }
}
