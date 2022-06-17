/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 *
 * @author PACO
 */
public class Pakemon {
    // Javier Merida Gutierrez

    /**
     * @param nombreJugador nombre del jugador , se pide al crear el juego
     * @param indica si se ha pasado el juego o aún no
     * @param indica los pakemon que tiene el jugador en su poder
     * @param disponibles para capturar pakemons
     * 
     */
    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    private int pakeballs; //disponibles para capturar pakemons

    /**
     * 
     * @param nombreIn nombre de entrada del jugador
     * constructor de la clase
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
     * 
     * @param nombrePakemon nombre del pokemon a capturar
     * @return devuelve si el pokemon ha sido capturados o no
     * metodo para capturar pokemons
     */
    public boolean capturarPakemon(String nombrePakemon) {
        if (this.pakeballs == 0) {
            System.out.println("No se puede capturar");
            return false;
        } else if (nombrePakemon.equals("Mew")) {
            System.out.println("Casi imposible, majo");
            return false;
        } else {
            System.out.println("¡Capturado!");
            this.pakeballs--;
            return true;

        }
    }

    /**
     * metodo para coger pokeballs
     */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }
    /**
     * 
     * @param claveFin numero para comprobar si se ha ganado
     * @return devuelve si has ganado o no
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }
    
    /**
     * 
     * @return devuelve el nombre del jugador 
     */
    public String getNombreJugador() {
        return nombreJugador;
    }
    
    /**
     * 
     *setter nombre del jugador
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * 
     * @return devuelve si el juego se ha completado o no 
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }
    
    /**
     * 
     * @param juegoPasado indica si el juego se ha completado o no
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }

    /**
     * 
     * @return indica los pokemon capturados 
     */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }

    /**
     * 
     * @param pakemonCapturados nombre del pakemon capturado
     */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }

    /**
     * 
     * @return pokeballs
     */
    public int getPakeballs() {
        return pakeballs;
    }
    
    /**
     * 
     *setter pokeballs
     */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
