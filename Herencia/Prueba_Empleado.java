package herencia_simple_;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prueba_Empleado {

    public static void main(String[] args) {
        int op;
        String nom, dom, tel, curp, rfc;
        float sb, sn, imp, pph;
        int ed, ht;
        Empleado_Adm EA1 = new Empleado_Adm();
        Empleado_Op EO1 = new Empleado_Op();

        //Scanner io = new Scanner(System.in);
        while (true) {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menú de Opciones \n"
                    + "1.- Alta Empleado Operativo\n"
                    + "2.- Cálculo de Sueldo Empleado Administrativo\n"
                    + "3.- Listar datos Empleado Operativo\n"
                    + "4.- Salir"));
            switch (op) {
                case 1:
                    nom = JOptionPane.showInputDialog("Nombre del Empleado: ");
                    ed = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
                    dom = JOptionPane.showInputDialog("Domicilio: ");
                    tel = JOptionPane.showInputDialog("Teléfono: ");
                    ht = Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas:"));
                    pph = Float.parseFloat(JOptionPane.showInputDialog("Precio por Hora:"));
                    curp = JOptionPane.showInputDialog("CURP: ");
                    rfc = JOptionPane.showInputDialog("RFC: ");
                    sn = ht * pph;

                    EO1.altaTrabajador(nom, dom, tel, curp, rfc, ed, sn, sn, pph, sn);

                    break;
                case 2:
                    sb = Float.parseFloat(JOptionPane.showInputDialog("Sueldo base:"));
                    imp = sb * .32f;
                    JOptionPane.showMessageDialog(null, "El Sueldo Neto del Empleado es: " + EA1.CalculoSueldoNeto(sb, imp));
                    break;
                case 3:
                    EO1.listarDatos();
                    break;
                case 4:
                    System.exit(0);
            }

        }
    }
}
/*  public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int op;

 while (true) {
 System.out.println("Menú de Opciones:");
 System.out.println("1.- Alta Empleado Operativo");
 System.out.println("2.- Cálculo de Sueldo Empleado Administrativo");
 System.out.println("3.- Listar datos Empleado Operativo");
 System.out.println("4.- Salir");
 System.out.print("Seleccione una opción: ");
 op = Integer.parseInt(scanner.nextLine());

 switch (op) {
 case 1:
 System.out.print("Nombre del Empleado: ");
 String nom = scanner.nextLine();
 System.out.print("Edad: ");
 int ed = Integer.parseInt(scanner.nextLine());
 System.out.print("Domicilio: ");
 String dom = scanner.nextLine();
 System.out.print("Teléfono: ");
 String tel = scanner.nextLine();
 System.out.print("Horas Trabajadas: ");
 int ht = Integer.parseInt(scanner.nextLine());
 System.out.print("Precio por Hora: ");
 float pph = Float.parseFloat(scanner.nextLine());
 System.out.print("CURP: ");
 String curp = scanner.nextLine();
 System.out.print("RFC: ");
 String rfc = scanner.nextLine();
 float sn = ht * pph;
 // EO1.altaTrabajador(nom, dom, tel, curp, rfc, ed, sn, sn, pph, sn); // Uncomment this line if EO1.altaTrabajador is defined
 System.out.println("Trabajador registrado exitosamente:");
 System.out.println("Nombre: " + nom);
 System.out.println("Edad: " + ed);
 System.out.println("Domicilio: " + dom);
 System.out.println("Teléfono: " + tel);
 System.out.println("CURP: " + curp);
 System.out.println("RFC: " + rfc);
 System.out.println("Sueldo Neto: " + sn);
 break;
 case 2:
 System.out.print("Sueldo base: ");
 float sb = Float.parseFloat(scanner.nextLine());
 float imp = sb * 0.32f;
 float sueldoNeto = sb - imp;
 System.out.println("El Sueldo Neto del Empleado es: " + sueldoNeto);
 break;
 case 3:
 System.out.println("Listado de datos del empleado operativo:");
 break;
 case 4:
 System.out.println("Saliendo del programa.");
 scanner.close();
 System.exit(0);
 default:
 System.out.println("Opción no válida.");
 }
 }
 }
 }
 */
