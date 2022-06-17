/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 * @author Manuel
 * @author PACO
 */


public class Pakemon {

    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    private int pakeballs; //disponibles para capturar pakemons
    /**
     * 
     * Entra un String
     * 
     * @param nombreIn 
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
 * Entra un String y sale un boolean
 * 
 * @param nombrePakemon
 * @return boolean
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
 * 
 * Cuando se ejecuta el codigo devuelve una frase
 * 
 */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }
    /**
     *  Entra el Int claveFin y sale un String
     * 
     * @param claveFin
     * @return String
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
 * @return nombreJugador
 */
    public String getNombreJugador() {
        return nombreJugador;
    }
/**
 *  Setea el nombreJugador a this.nombreJugador
 * @param nombreJugador 
 */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
/**
 * 
 * @return juegoPasado 
 */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }
/**
 * 
 * @param boolean
 * @param juegoPasado 
 */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }
/**
 * 
 * @return pakemonCapturados 
 */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }
/**
 * 
 *
 * @param pakemonCapturados 
 */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }
/**
 * 
 * 
 * @return pakeballs
 */
    public int getPakeballs() {
        return pakeballs;
    }
/**
 * 
 * 
 * @param pakeballs 
 */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
