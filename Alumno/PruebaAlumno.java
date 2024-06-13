package Alumno;

import java.util.Scanner;

public class PruebaAlumno  {

    public static void main(String[] args) {
        String nom, apaterno, amaterno, sex, dir;
        int ed;    Alumno A1 = new Alumno();
        Alumno A2 = new Alumno();
        Scanner ai = new Scanner(System.in);

        for (int x = 1; x <= 2; x++) {
            System.out.println("Nombre del Alumno " + x + ": ");
            nom = ai.nextLine();
            System.out.println("Apellido Paterno:");
            apaterno = ai.nextLine();
            System.out.println("Apellido Materno:");
            amaterno = ai.nextLine();
            System.out.println("Sexo: ");
            sex = ai.nextLine();
            System.out.println("Dirección: ");
            dir = ai.nextLine();
            System.out.println("Edad: ");

            while (!ai.hasNextInt()) {
                System.out.println("Por favor, introduzca un número válido para la edad:");
                ai.next(); // descarta la entrada inválida
            }
            ed = ai.nextInt();
            ai.nextLine(); // consume el salto de línea restante

            if (x == 1) {
                A1.altaAlumnos(nom, apaterno, amaterno, sex, dir, ed);
            } else if (x == 2) {
                A2.altaAlumnos(nom, apaterno, amaterno, sex, dir, ed);
            }
        }

        {            System.out.println("\nDatos del Alumno 1:");
            A1.listarDatos();
       
            System.out.println("\nDatos del Alumno 2:");
            A2.listarDatos();
        }

        ai.close();
    }
}
/*
import java.util.Scanner;

public class PruebaAlumno extends alumno {

    public static void main(String[] args) {
        String nom, apaterno, amaterno, sex, dir;
        int ed;

        alumno A1 = new alumno();
        alumno A2 = new alumno();
        int na;
        Scanner ai = new Scanner(System.in);

        for (int x = 1; x <= 2; x++) {

            System.out.println("Nombre del Alumno: " + x);
            nom = ai.nextLine();
            System.out.println("Apellido Paterno:");
            apaterno = ai.nextLine();
            System.out.println("Apellido Materno:");
            amaterno = ai.nextLine();
            System.out.println("Sexo: ");
            sex = ai.nextLine();
            System.out.println("Dirección: ");
            dir = ai.nextLine();
            System.out.println("Edad: ");
            ed = ai.nextInt();

            A1.altaAlumnos(nom, apaterno, amaterno, sex, dir, ed);

            A1.listarDatos();
        }
    }

    public PruebaAlumno(String nombre, String apellidopaterno, String apellidomaterno, String sexo, String direccion, int edad) {
        super(nombre, apellidopaterno, apellidomaterno, sexo, direccion, edad);
    }
}
*/
