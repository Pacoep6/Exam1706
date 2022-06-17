/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 *
 * @author PACO
 * @version 1.0
 * @see capturarLista()
 */
public class Pakemon {
    //LENA SIMON RUBIO
    /**
     * @param nombreJugador 
     * @param juegoPasado 
     * @param pakemonCapturados 
     * @param pakeballs 
     */
    
    /**
     * nombre del jugador, se pide al crear el juego
     */
    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    /**
     * indica si se ha pasado el juego o aún no
     */    
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    /**
     * indica los pakemon que tiene el jugador en su poder
     */
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    /**
     * disponibles para capturar pakemons
     */
    private int pakeballs; //disponibles para capturar pakemons

    
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
     * 
     * Se capturará un pokemon dependiendi de las pakeballs que queden
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
     * se encuentran pakeballs
     */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }
    /**
     * 
     * Se entregara la clave final
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }
    
    /**
     * @return 
     * 
     * Se escribe el nombre del jugador
     */
    public String getNombreJugador() {
        return nombreJugador;
    }
    /**
     * 
     * 
     * Se escribe el nombre del jugador
     */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    /**
     * @return 
     * Se ha pasado el juego
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }
    /**
     *  
     * 
     * Se ha pasado el juego
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }
    /**
     * @return 
     * 
     * Numero de pakemons capturados
     */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }
    /**
     * 
     * Numero de pakemons capturados
     */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }
    /**
     * @return
     * 
     * Numero de pakeballs obtenidas
     */
    public int getPakeballs() {
        return pakeballs;
    }
    /**
     *  
     * 
     * Numero de pakeballs obtenidas
     */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
