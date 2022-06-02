
package ruleta.rusa;
import java.io.*;

public class LeerArchivos {

    public String LeerParticipantes(String Archivo) throws IOException {

            BufferedReader bf = new BufferedReader(new FileReader(Archivo));
            String Participantes;
            Participantes = bf.readLine();
            String Texto = Participantes;
            
            
            while ((Participantes = bf.readLine()) != null) {
              Texto += " " + Participantes;
              }
            return Texto;  
    }
       static void mostrarArchivo(String Dirección, String Mensaje, String Dato) throws IOException {
       
        FileWriter archivo = new FileWriter(Dirección, true);
        
        try (PrintWriter pw = new PrintWriter(archivo)) {
            pw.println(Dato);
            pw.println(Mensaje);
            pw.close(); 
        }
    }
}

 