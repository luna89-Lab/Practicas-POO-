
public class Empleado extends Usuario {

    int numTarj, numDepart, antiguedad;

    public Empleado() {
        System.out.println("Se a creado un emleado");
    }

    public Empleado(int numTarj, int numDepart, int antiguedad, int ID_US, String Usuario, String contraseña) {
        this.numTarj = numTarj;
        this.numDepart = numDepart;
        this.antiguedad = antiguedad;
        this.ID_US = ID_US;
        this.Usuario = Usuario;
        this.contraseña = contraseña;

    }

    public String iniciar() {
        System.out.println("Se a iniciado sesion");
        System.out.println("");
        System.out.println("Su numero de tarjeta es" + this.numTarj);
        String sesion = "True";
        this.ID_US = 1;
        return sesion;
    }
}
