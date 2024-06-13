
public class Main extends Usuario {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.iniciar("admin");
        usuario.cerrar();
        Usuario usuario2 = new Usuario();
        usuario2.Usuario = "admin";
    }
}
