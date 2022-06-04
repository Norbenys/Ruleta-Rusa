
package ruleta.rusa;

public class Nodo {

    String nombre, apellido;
    int edad;
    boolean vivo;
    Nodo sig;

    public Nodo(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Nodo() {
    }

}
