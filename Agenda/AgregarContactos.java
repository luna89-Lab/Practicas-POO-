package contactos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AgregarContactos {

    public void agregaContacto() {
      
        String nombre, direccion, telefono, sexo, ocupacion;
        int edad;
        FileWriter w;
        try {
            w = new FileWriter("agenda.dat", true);
            PrintWriter wr = new PrintWriter(w);
            nombre = (JOptionPane.showInputDialog("Nombre: "));
            direccion = (JOptionPane.showInputDialog("Dirección: "));
            telefono = (JOptionPane.showInputDialog("Teléfono: "));
            sexo = (JOptionPane.showInputDialog("Sexo: "));
            ocupacion = (JOptionPane.showInputDialog("Ocupación: "));

            edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
            wr.println(nombre + " " + direccion + " " + telefono + " " + sexo + " " + edad);
            wr.close();
            w.close();
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }
}
