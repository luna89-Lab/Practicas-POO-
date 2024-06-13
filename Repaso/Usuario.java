
public class Usuario {

    int ID_US;
    String Usuario, contraseña;

    public String iniciar(String Usuario) {
        System.out.println("Se a iniciado sesion" + Usuario);
        String sesion = "True";
        this.ID_US = 1;
        return sesion;
    }

    /*public Usuario(int ID_US, String Usuario, String contraseña) {
     this.ID_US = ID_US;
     this.Usuario = Usuario;
     this.contraseña = contraseña;
     }*/
    public void cerrar() {
        System.out.println("Se cerro sesion");
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.iniciar("admin");
        usuario.cerrar();
        Usuario usuario2 = new Usuario();
        usuario2.Usuario = "admin";
    }

}
