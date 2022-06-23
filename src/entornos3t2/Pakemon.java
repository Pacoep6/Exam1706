/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 *Nestor de frutos alonso
 * @author PACO
 * @version 1
 * @see Entornos3T2#capturarLista(java.lang.String[], entornos3t2.Pakemon)
 */
public class Pakemon {
//Nestor de frutos alonso
   
    
    /**
     * nombre del jugador, se pide al crear el juego
     */
    private String nombreJugador; 
     /**
     * indica si se ha pasado el juego o aún no
     */
    private boolean juegoPasado; 
     /**
     * indica los pakemon que tiene el jugador en su poder
     */
    private int pakemonCapturados; 
     /**
     * disponibles para capturar pakemons
     */
    private int pakeballs; 

    /**
     * Metodo para poner nombre al jugador
     * @param nombreIn 
     * 
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
     * Metodo para capturar pokemons
     * @param nombrePakemon
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
 * metodo para cojer pakeballs
 */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }
/**
 * Metodo para escribir la clave final
 * @param claveFin
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
 * Metodo para devolver el nombre del jugador
 * @return 
 */
    public String getNombreJugador() {
        return nombreJugador;
    }
/**
 * Metodo para cambiar el nombre del jugador
 * @param nombreJugador 
 */
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public boolean isJuegoPasado() {
        return juegoPasado;
    }

    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }

    public int getPakemonCapturados() {
        return pakemonCapturados;
    }

    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }

    public int getPakeballs() {
        return pakeballs;
    }

    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
