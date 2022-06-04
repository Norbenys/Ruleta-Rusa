

package ruleta.rusa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Participantes {

    String nombre, apellido;
    int edad;
    PrintWriter pf;
    FileReader fr;

    void crear(String pNombre) throws IOException {
        pf = new PrintWriter(new FileWriter(pNombre, true));
        pf.write("Norbenys" + " " + "Noriega" + " " + "19");
        pf.append("\nYohan" + " " + "Briceño" + " " + "19");
        pf.append("\nRodny" + " " + "Antepaz" + " " + "19");
        pf.append("\nSilvestre" + " " + "uwu" + " " + "23");
        pf.append("\nPedro" + " " + "Ríos" + " " + "19");
        pf.append("\nPablo" + " " + "Segundo" + " " + "19");
        pf.append("\n");
        pf.close();
        System.out.println("Los participantes han sido creados con éxito.");

    }

    void leer(String pNombre, Lista lis) throws IOException {
        fr = new FileReader(pNombre);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(" ");
            String nombre = datos[0];
            String apellido = datos[1];
            int edad = Integer.parseInt(datos[2]);
            lis.ingresar(nombre, apellido, edad);

        }
    }

}

    

