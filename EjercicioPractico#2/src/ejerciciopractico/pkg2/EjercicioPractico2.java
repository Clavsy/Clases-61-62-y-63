/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg2;

/**
 *
 * @author clavs
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] nombres = new String[3];
        
        try {

            for (int i = 0; i < 5; i++) {
                System.out.println(nombres[i]);
            }

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e + "Error ñaña");
        } catch(Exception e){
            System.out.println("Error ñaña jajaja");
        }

    }
}
