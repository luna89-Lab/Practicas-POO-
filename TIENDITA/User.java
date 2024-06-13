package Models;

public class User {

    private String nombre;
    private String idUsuario;
    private String email;
    private String pasword;
    private String role;
    private String direccion;
    private String telefono;
    private String estado;
    private String fecha_registro;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getPasword() {
        return pasword;
    }

    public String getRole() {
        return role;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public User(String nombre, String idUsuario, String email, String pasword, String role, String direccion, String telefono, String estado, String fecha_registro) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.email = email;
        this.pasword = pasword;
        this.role = role;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }

}
