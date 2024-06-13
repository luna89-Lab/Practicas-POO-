package contactos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Agenda {

    public static void main(String[] args) {
        CrearArchivo obj1 = new CrearArchivo();
        AgregarContactos obj2 = new AgregarContactos();
        while (true) {
            int op;
            op = Integer.parseInt(JOptionPane.showInputDialog("Menú de Opciones\n"
                    + "1.- Crear Archivo 'agenda.dat'\n"
                    + "2.- Agregar Contactos\n"
                    + "3.- Desplegar Contactos\n"
                    + "4.- Salir"));
            switch (op) {
                case 1:
                    obj1.creaArchivo();
                    break;
                case 2:
                    obj2.agregaContacto();
                    break;
                case 3:
                    try {
                        BufferedReader fd = new BufferedReader(new FileReader("agenda.dat"));
                        String linea = "";
                        while ((linea = fd.readLine()) != null) {
                            JOptionPane.showMessageDialog(null, linea);
                        }
                        fd.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("No pude abrir el archivo agenda.dat");
                    } catch (IOException e) {
                        System.out.println("Error al leer");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
