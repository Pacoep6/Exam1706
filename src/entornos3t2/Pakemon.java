/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 *
 * @author PACO
 * @version Esmeralda
 * @see Entornos3T2#capturarLista(java.lang.String[], entornos3t2.Pakemon) 
 * Pokemon Esmeralda en examen. Clase Pakemon.
 */
public class Pakemon {

    // David Martín
    
    /**nombre del jugador, se pide al crear el juego*/
    private String nombreJugador; 
    /**indica si se ha pasado el juego o aún no*/
    private boolean juegoPasado;
    /**indica los pakemon que tiene el jugador en su poder*/
    private int pakemonCapturados; 
    /**disponibles para capturar pakemons*/
    private int pakeballs; 

    /**
     * @param nombreIn para poder meter el nombre del jugador si lo quieres */  
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
     * @param nombrePakemon capta el nombre del Pokemon para compararlo a los ratios de captura
     * @return en booleano si lo has capturado o no
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
     * Coges del suelo una pakeball
     */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }
    
    /**
     * @param claveFin te pasa la clave para ganar la partida
     * @return mensajito que te pone si has ganado
     */
    public String decirClaveFinal(int claveFin) {
        if (claveFin == 1223424345) {
            return "¡Has ganado!";
        } else {
            return "¡Chicos, hay que estudiar más!";
        }
    }
    
    
    /**@return nombreJugador coge Nombre jugador*/
    public String getNombreJugador() {
        return nombreJugador;
    }
    /** @param nombreJugador pone Nombre jugador*/
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    /**@return mensajito que te dice si
     * te pasaste el juego?
     */
    public boolean isJuegoPasado() {
        return juegoPasado;
    }
    /**@param juegoPasado activa que te hayas pasado el juego
     */
    public void setJuegoPasado(boolean juegoPasado) {
        this.juegoPasado = juegoPasado;
    }
    /** @return pakemon Capturados te dice cuantos pakemons has capturado*/
    public int getPakemonCapturados() {
        return pakemonCapturados;
    }
    /**@param pakemonCapturados te actualiza los pokes capturados*/
    public void setPakemonCapturados(int pakemonCapturados) {
        this.pakemonCapturados = pakemonCapturados;
    }
    /**@return pakeballs te dice cuantos pakeballs tienes*/
    public int getPakeballs() {
        return pakeballs;
    }
    /**@param pakeballs te pone pakeballs*/
    public void setPakeballs(int pakeballs) {
        this.pakeballs = pakeballs;
    }

}
