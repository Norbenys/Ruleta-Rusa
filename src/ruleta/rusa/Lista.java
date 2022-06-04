
package ruleta.rusa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lista {

    Nodo primero;
    Nodo ultimo;
    int total;
    PrintWriter pf;
    FileReader fr;

    public Lista() {
        primero = null;
        ultimo = null;
        total = 0;
    }

    public Lista ingresar(String nombre, String apellido, int edad) {
        Nodo nuevo = new Nodo(nombre, apellido, edad);
        if (primero == null) {
            primero = nuevo;
            ultimo = primero;
            primero.sig = ultimo;
        } else {
            ultimo.sig = nuevo;
            nuevo.sig = primero;
            ultimo = nuevo;
        }
        return this;
    }

    void crear() throws IOException {

    }

    void iniciarJuego() throws IOException {
        pf = new PrintWriter(new FileWriter("Derrotados.txt", true));
        Revolver r = new Revolver();
        Nodo aux = primero;
        Nodo actual = new Nodo();
        Nodo anterior = new Nodo();
        actual = primero;
        anterior = ultimo;

        while (aux.sig != null) {
            if (r.disparar() == true) {
                aux.vivo = true;
                System.out.println(aux.nombre + " " + aux.apellido + " vivo");
                System.out.println("");
                aux = aux.sig;
            } else {
                aux.vivo = false;
                System.out.println(aux.nombre + " " + aux.apellido + " ha muerto:(");
                System.out.println("");
                if (aux == primero) {
                    primero = primero.sig;
                    ultimo.sig = primero;
                    System.out.println("Se saco a " + aux.nombre + " " + aux.apellido);
                } else if (aux == ultimo) {
                    anterior.sig = ultimo.sig;
                    ultimo = anterior;
                    System.out.println("Se saco a " + aux.nombre + " " + aux.apellido);
                } else {
                    anterior.sig = actual.sig;
                    System.out.println("Se saco a " + aux.nombre + " " + aux.apellido);
                }

                pf.print("\n" + aux.nombre + " " + aux.apellido + " " + aux.edad);
                pf.close();
                aux.sig = null;
            }
            r.siguienteTiro();
            if (aux.vivo == true) {
                pf = new PrintWriter(new FileWriter("Ganador.txt", true));
                pf.print("\n" + aux.nombre + " " + aux.apellido + " " + aux.edad);
                pf.close();
            }

        }
    }

}
