/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos3t2;

/**
 * Clase principal, sólo sirve para crear objetos y probar
 *
 * @author PACO
 */
public class Entornos3T2 {

    private int numRamas;
    private String ramaPrincipal;
    private String ramaEvolucionada;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pakemon juego1 = new Pakemon("");
        //primero cojo alguna pakeball
        juego1.cogerPakeball();
        juego1.cogerPakeball();

        
        //intento capturar pakemons
        String[] listadoPakemon = {"Staryu", "Mew", "Pikachu", "Charmander", "Lapras", "Gyarados"};
        capturarLista(listadoPakemon, juego1);

        //intento ganar
        System.out.println(juego1.decirClaveFinal(122344324));
    }
/**
 * 
 * @see Pakemon
 * @param pakemon
 * @param juego1 
 */
    public static void capturarLista(String[] pakemon, Pakemon juego1) {
        //Cambiado pakemon.length a 6 para optimizarlo
        for (int i = 0; i < 6; i++) {
            if (juego1.getPakeballs() > 0) {
                juego1.capturarPakemon(pakemon[i]);
            } else {
                //cambio el sout para que sea mas optimo y haga un sout de una variable
                String out=("No tienes Pakeballs");
                System.out.println(out);
            }
        }
    }

}
