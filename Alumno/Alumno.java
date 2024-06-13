package Alumno;

import java.util.Scanner;

public class Alumno {

    String nombre, apellidopaterno, apellidomaterno, sexo, direccion;
    int edad;

    Alumno A1 = new Alumno();
    Alumno A2 = new Alumno();
    int na;
    Scanner ai = new Scanner(System.in);

    public Alumno() {
    }

    
    public void altaAlumnos(String nom, String apaterno, String amaterno,
            String sex, String dir, int ed) {
        nombre = nom;
        apellidopaterno = apaterno;
        apellidomaterno = amaterno;
        sexo = sex;
        direccion = dir;
        edad = ed;
    }

    public void listarDatos() {
        for (int x = 1; x <= 2; x++) {

            System.out.println("Nombre del Alumno: " + x);
            nombre = ai.nextLine();
            System.out.println("Apellido Paterno:");
            apellidopaterno = ai.nextLine();
            System.out.println("Apellido Materno:");
            apellidomaterno = ai.nextLine();
            System.out.println("Sexo: ");
            sexo = ai.nextLine();
            System.out.println("Dirección: ");
            direccion = ai.nextLine();
            System.out.println("Edad: ");
            edad = ai.nextInt();

            A1.altaAlumnos(nombre, apellidopaterno, apellidomaterno, sexo, direccion, edad);

            A1.listarDatos();
        }
    }

}
/*
 public class alumno {
 String nombre, apellidopaterno, apellidomaterno, sexo, direccion;
 int edad;

  
 
 public void listarDatos(){
 System.out.println("Datos del Alumno ");
 System.out.println("Nombre: "+ nombre);
 System.out.println("Apellido paterno: " + apellidopaterno);
 System.out.println("Apellido Materno: "+ apellidomaterno);
 System.out.println("Sexo: "+ sexo);
 System.out.println("Dirección: "+ direccion);
 System.out.println("Edad: "+ edad);
 }

 public String getNombre() {
 return nombre;
 }

 public void setNombre(String nombre) {
 this.nombre = nombre;
 }

 public void setApellidopaterno(String apellidopaterno) {
 this.apellidopaterno = apellidopaterno;
 }

 public void setApellidomaterno(String apellidomaterno) {
 this.apellidomaterno = apellidomaterno;
 }

 public void setSexo(String sexo) {
 this.sexo = sexo;
 }

 public void setDireccion(String direccion) {
 this.direccion = direccion;
 }

 public void setEdad(int edad) {
 this.edad = edad;
 }

 public String getApellidopaterno() {
 return apellidopaterno;
 }

 public String getApellidomaterno() {
 return apellidomaterno;
 }

 public String getSexo() {
 return sexo;
 }

 public String getDireccion() {
 return direccion;
 }

 public int getEdad() {
 return edad;
 }

 public alumno(String nombre, String apellidopaterno, String apellidomaterno, String sexo, String direccion, int edad) {
 this.nombre = nombre;
 this.apellidopaterno = apellidopaterno;
 this.apellidomaterno = apellidomaterno;
 this.sexo = sexo;
 this.direccion = direccion;
 this.edad = edad;
 }
 public void altaAlumnos(String nom,String apaterno,String amaterno,
 String sex, String dir, int ed) {
 nombre=nom;
 apellidopaterno=apaterno;
 apellidomaterno=amaterno;
 sexo=sex;
 direccion=dir;
 edad=ed;
 }
 }*/
