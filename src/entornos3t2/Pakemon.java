/*
 * Gonzalo López Fernández
 */
package entornos3t2;

/**
 * Gestiona todo lo referente a Pakemons y su captura.
 *
 * @author PACO
 * @version 1.0
 * @see Entornos3T2#capturarLista 
 */
public class Pakemon {

    /**
     * Nombre del jugador, se pide al crear el juego.
     */
    private String nombreJugador;
    /**
     * Indica si se ha pasado el juego o aún no.
     */
    private boolean juegoPasado;
    /**
     * Indica los pakemon que tiene el jugador en su poder.
     */
    private int pakemonCapturados;
    /**
     * Disponibles para capturar pakemons.
     */
    private int pakeballs;

    /**
     * Genera un Pakemon dado su nombre.
     *
     * @param nombreIn nombre del Pakemon.
     */
    public Pakemon(String nombreIn) {
        if (nombreIn.equals("")) {
            this.nombreJugador = "Vago/a";
        } else {
            this.nombreJugador = nombreIn;
        }
        this.juegoPasado = false;
        this.pakemonCapturados = 0;
    }

    /**
     * Captura, o no, un pakemon introducido su nombre.
     *
     * @param nombrePakemon nombre del Pakemon.
     * @return true si se ha capturado, false en otro caso.
     */
    public boolean capturarPakemon(String nombrePakemon) {
        if (this.getPakeballs() == 0) {
            System.out.println("No se puede capturar");
            return false;
        } else if (nombrePakemon.equals("Mew")) {
            System.out.println("Casi imposible, majo");
            return false;
        } else {
            System.out.println("¡Capturado!");
            this.setPakeballs(this.getPakeballs() - 1);
            return true;
        }
    }

    /**
     * Añade una pakeball al inventario.
     */
    public void cogerPakeball() {
        this.setPakeballs(this.getPakeballs() + 1);
        System.out.println("Se ha encontrado una Pakeball");
    }

    /**
     * Comprueba que la clave final es la correcta.
     *
     * @param claveFin clave que se intenta comprobar.
     * @return resultado de la comprobación.
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }

    /**
     * Actualiza el nombre dle jugador.
     * 
     * @return el nombreJugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * El nombre del jugador.
     * 
     * @param nombreJugador el nombre del jugador.
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * Si el juego ha sido pasado.
     * 
     * @return si juegoPasado
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }

    /**
     * Actualiza si se ha pasado el juego.
     * 
     * @param juegoPasado si el juego ha sido pasado.
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }

    /**
     * Pakemos capturados.
     * 
     * @return los pakemonCapturados
     */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }

    /**
     * Cambia los Pakemos capturados.
     * 
     * @param pakemonCapturados los pakemon capturados.
     */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }

    /**
     * Cantidad de pakeballs.
     * 
     * @return las pakeballs.
     */
    public int getPakeballs() {
        return pakeballs;
    }

    /**
     * Cambia la cantidad de pakeballs.
     * 
     * @param pakeballs pakeballs actuales
     */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
