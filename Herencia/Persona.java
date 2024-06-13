package herencia_simple_;

public class Persona {

    String nombre, domicilio, curp;
    int telefono, rfc, edad;
      float sueldoBase, isr,sueldoneto;


    /*public Persona(String nombre, String domicilio, String curp, int telefono, int rfc, int edad) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.curp = curp;
        this.telefono = telefono;
        this.rfc = rfc;
        this.edad = edad;
    }*/

    public void CalcularSueldo() {
        System.out.println("Calcular sueldo neto de perosona");
    }
}
