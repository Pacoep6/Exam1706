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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Se genera un objeto de la clase pakemon
         */
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
     * @param pakemon nombre del pakemon
     * @param juego1 nombre del objeto de la clase Pakemon
     */
    public static void capturarLista(String[] pakemon, Pakemon juego1) {
        int length;
        length = pakemon.length;
        for (int i = 0; i < length; i++) {
            if (juego1.getPakeballs() > 0) {
                juego1.capturarPakemon(pakemon[i]);
            } else {
                System.out.println("No tienes Pakeballs");
            }
        }
    }

}
