/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 * Define al un jugador de pakemon que tiene sus pakeballs y sus pakemons capturados
 * @see Entornos3T2#capturarLista(java.lang.String[], entornos3t2.Pakemon) 
 * @author PACO
 * @version 5
 */
public class Pakemon {
    /**
     * Comentario ejercicio 4 Victor González Cobos
     */
    /**
     * Nombre del jugador, se pide al crear el juego
     */
    private String nombreJugador;
    /**
     * Indica si se ha pasado el juego o aún no
     */
    private boolean juegoPasado;
    /**
     * Indica los pakemon que tiene el jugador en su poder
     */
    private int pakemonCapturados;
    /**
     * Disponibles para capturar pakemons
     */
    private int pakeballs;

    /**
     * Crea un jugador pakemon
     *
     * @param nombreIn Nombre
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
     * Captura el pakemon
     *
     * @param nombrePakemon El nombre del pakemon
     * @return Si se pudo o no
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
     * Coge una pokeball y la añades a tu bolsa
     */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }

    /**
     * Si has metido la clave final del juego ganas
     *
     * @param claveFin clave
     * @return Victoria o has de estudiar mas
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }

    /**
     * Nombre del jugador
     *
     * @return nombre
     */
    public String getNombreJugador() {
        return nombreJugador;
    }

    /**
     * Set name
     *
     * @param nombreJugador nombre nuevo
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    /**
     * Si se ha pasado el juego
     *
     * @return Si se ha pasado el juego
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }

    /**
     * Setea si se ha pasado el juego
     *
     * @param juegoPasado Se ha psadao el juego
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }

    /**
     * Obten cant pakemons
     *
     * @return cantidad pakemons
     */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }

    /**
     * Setea los pakemons capturados
     *
     * @param pakemonCapturados num de pakemons
     */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }

    /**
     * numero de pakeballs
     *
     * @return numero de pakeballs
     */
    public int getPakeballs() {
        return pakeballs;
    }
    /**
     * Di las pakeballs que tiene
     * @param pakeballs Pakeballs que tiene
     */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
