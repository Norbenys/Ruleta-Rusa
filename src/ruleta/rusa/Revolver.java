
package ruleta.rusa;

public class Revolver {

    private int PosicionBalaActual;
    private int PosicionBala;

    public Revolver() {
        PosicionBalaActual = Bala.generarNumeroAleatorio(1, 6);
        PosicionBala = Bala.generarNumeroAleatorio(1, 6);
    }

    public boolean disparar() {

        boolean Fuego = true;

        if (PosicionBalaActual == PosicionBala) {

            Fuego = false;
        }
        return Fuego;
    }

    public void siguienteTiro() {

        if (PosicionBalaActual == 6) {
            PosicionBalaActual = 1;
        } else {
            PosicionBalaActual++;
        }
    }

}
