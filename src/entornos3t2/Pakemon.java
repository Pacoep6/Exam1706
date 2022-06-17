/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornos3t2;

/**
 * Juego de Pakemon
 * @author PACO
 * @version 5
 */
//Lidia Recio Santos
public class Pakemon {
    
    /**
     * @param nombreJugador nombre del jugador, se pide al crear el juego
     * @param juegoPasado indica si se ha pasado el juego o no
     * @param pakemonCapturados indica los pakemon que tiene el jugador en su poder
     * @param pakeballs disponibles para capturar pakemons
     */
    private String nombreJugador; //nombre del jugador, se pide al crear el juego
    private boolean juegoPasado; //indica si se ha pasado el juego o aún no
    private int pakemonCapturados; //indica los pakemon que tiene el jugador en su poder
    private int pakeballs; //disponibles para capturar pakemons

    /**
     * Constructor, si el jugador quiere ser anónimo será un vago para siempre. 
     * @param nombreIn 
     * @see Entornos3T2#capturarLista(String[], Pakemon) 
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
     * Método para capturar pojémos, tiene en cuenta la cantidad de pakeballs que tienes y el tipo de pakemon
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
     * Método que añade una pakeball y envía un mensaje de aviso
     */
    public void cogerPakeball() {
        this.pakeballs++;
        System.out.println("Se ha encontrado una Pakeball");
    }
    
    /**
     * Metodo para finalizar el juego, si se introduce la clave correctamente sale un mensaje, si no continúa
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

    public String getNombreJugador() {
        return nombreJugador;
    }

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
