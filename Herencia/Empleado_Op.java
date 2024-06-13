package herencia_simple_;

public class Empleado_Op extends Persona {

    float seldoBase, horasTra, precioporhora;

    public Empleado_Op() {
    }

    public Empleado_Op(String nombre, String domicilio, String curp, int telefono, int rfc, int edad) {
     this.seldoBase = seldoBase;
        this.horasTra = horasTra;
        this.precioporhora = precioporhora;
    }


   
   /* public void altaTrabajador(float seldoBase, float horasTra, float precioporhora, String nombre, String domicilio, String curp, int telefono, int rfc, int edad) {
        this.seldoBase = seldoBase;
        this.horasTra = horasTra;
        this.precioporhora = precioporhora;
        this.sueldoBase = sueldoBase;
        this.isr = isr;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.curp = curp;
        this.telefono = telefono;
        this.rfc = rfc;
        this.edad = edad;
    }*/

    public void listarDatos() {
        System.out.println("Nombre del empleado" + nombre + "CURP" + curp + "RFC" + rfc);
        System.out.println("Domicilio" + domicilio + "telefono" + telefono);
        System.out.println("Horas de trabajo" + horasTra + "Precio por horas trabajadas" + precioporhora + "Isr" + isr);
        System.out.println("sueldo" + sueldoBase);

    }

    void altaTrabajador(String nom, String dom, String tel, String curp, String rfc, int ed, float sn, float sn0, float pph, float sn1) {
    }

  
}
