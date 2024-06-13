package herencia_simple_;

public class Empleado_Adm extends Persona {

    public Empleado_Adm() {
    }

    public Empleado_Adm(String nombre, String domicilio, String curp, int telefono, int rfc, int edad) {
    }

    /* public void altaTrabajador( String nombre, String domicilio, String curp, int telefono, int rfc, int edad, float sueldoBase, float isr) {
     this.sueldoBase = sueldoBase;
     this.isr = isr;
     this.nombre = nombre;
     this.domicilio = domicilio;
     this.curp = curp;
     this.telefono = telefono;
     this.rfc = rfc;
     this.edad = edad;
     }*/
    public float CalculoSueldoNeto(float sB, float imp) {
        sueldoBase = sB;
        isr = imp;
        sueldoneto = sueldoBase - isr;

 //System.out.println("Sueldo neto"+sueldoneto);
        return sueldoneto;
    }

}
