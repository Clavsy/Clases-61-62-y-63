/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ADIVINAR EL NUMERO");

        int num = (int) (Math.random() * 499 + 1);
        System.out.println(num);
        int contador = 0;
        boolean adivinar = false;
        int entrada;

        do {

            contador++;
            System.out.println("Intento #" + contador);
            System.out.println("Ingresar un numero");

            try {
                entrada = leer.nextInt();

                if (num == entrada) {
                    adivinar = true;
                    System.out.println("ADIVINASTE!!!!");
                    System.out.println("Intentos utilizados = " + contador);
                }

                if (num < entrada) {
                    System.out.println("El numero secreto es menor al ingresado.");
                }

                if (num > entrada) {
                    System.out.println("El numero secreto es mayor al ingresado.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo ingresar numeros enteros! // Intentos: " + contador);
                leer.next();
            }

        } while (!adivinar);
    }

}
