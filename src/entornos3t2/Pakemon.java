/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;
// Gonzalo Carrasco Álvarez
/**
 *
 * @author PACO
 * @version 12.5
 * @see Entornos3T2#capturarLista(java.lang.String[], entornos3t2.Pakemon) 
 */

/**
 * @param nombreJugador esta funcion indica cual es el nombre del usuario
 * @param juegoPasado esta funcion indica si el juego ya esta completo o no
 * @param pakemonCapturados esta funciona indica los pokemon capturados por el usuario
 * @param pakeballs  esta funcion indica las pakeballs que tiene el usuario
 */
public class Pakemon {

    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    private int pakeballs; //disponibles para capturar pakemons

    /**
     * 
     * @param nombreIn hacer referencia al nombre
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
     * @param nombrePakemon hacer referencia al nombre del Pakemon
     * @return 
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
 * Se utiliza para recoger una Pakeball
 */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }
/**
 * 
 * @param claveFin Se utiliza para decir una clave que te diga si has ganado o no
 * @return 
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
 * @return obtienes el nombre del jugador
 */
    public String getNombreJugador() {
        return nombreJugador;
    }
/**
 * 
 * @param nombreJugador Seleccionas el nombre del jugador
 */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
/**
 * 
 * @return Obtienes si el juego esta completado o no
 */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }
/**
 * 
 * @param juegoPasado Seleccionas si el juego esta completado o no
 */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }
/**
 * 
 * @return Obtienes los pakemons que has capturado
 */
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }
/**
 * 
 * @param pakemonCapturados Seleccionas los pakemons que has capturado
 */
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }
/**
 * 
 * @return Obtienes en numero de pakeballs que tienes
 */
    public int getPakeballs() {
        return pakeballs;
    }
/**
 * 
 * @param pakeballs Seleccionas el numero de pakeballs que tienes
 */
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
