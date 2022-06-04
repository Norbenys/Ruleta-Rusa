
package ruleta.rusa;
import java.io.IOException;
import java.util.Scanner; 
/**
 *
 * @ Norbenys Noriega, Yohan Briceño, Rodny Antepaz
 */
public class RuletaRusa {

    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        Lista l = new Lista();
        Participantes p = new Participantes();

        System.out.println("-------------------------------");
        System.out.println("Bienvenido a la Ruleta Rusa");
        System.out.println("-------------------------------");
        int opcion;
        int cantidad = 20;

        do {
            System.out.println("[1]Comenzar el juego."
                    + "\n[2]Salir.");
            System.out.print("¿Qué quieres hacer?: ");
            System.out.println("\n");
            opcion = t.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Comencemos");

                    p.crear("Participantes.txt");
                    p.leer("Participantes.txt", l);
                    for (int i = 0; i < cantidad; i++) {
                        l.iniciarJuego();
                    }
                    System.out.println("\n");
                    break;

                case 2:
                    opcion = 2;
                    break;

                default:
                    System.out.println("Por favor, ingresa alguna opción que se muestra en la pantalla.");
                    break;
            }

        } while (opcion != 2);

    }

}
