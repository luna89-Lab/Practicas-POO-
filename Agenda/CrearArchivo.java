package contactos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

public class CrearArchivo {

    public void creaArchivo() {
//Creación del Archivo
        try {
            FileOutputStream f = new FileOutputStream("agenda.dat");

            DataOutputStream archivo = new DataOutputStream(f);
        } catch (FileNotFoundException ex) {
            System.out.println("Existe un error " + ex);
        }
    }
}
