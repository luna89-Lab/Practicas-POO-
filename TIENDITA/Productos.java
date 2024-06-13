package Models;
public class Productos {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    
        public Productos(int id, String nombre, String descripcion, double precio, int stock, int idCategoria) {
            this.id = id;
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
            this.stock = stock;
            this.idCategoria = idCategoria;
        }
    
        public int getId() {
            return id;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public void setPrecio(double precio) {
            this.precio = precio;
        }
    
        public void setStock(int stock) {
            this.stock = stock;
        }
    
        public void setIdCategoria(int idCategoria) {
            this.idCategoria = idCategoria;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public double getPrecio() {
            return precio;
        }
    
        public int getStock() {
            return stock;
        }
    
        public int getIdCategoria() {
            return idCategoria;
        }
    private int idCategoria;
    
    
    }
    