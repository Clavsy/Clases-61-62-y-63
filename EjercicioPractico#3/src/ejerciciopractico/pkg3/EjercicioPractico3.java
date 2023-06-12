/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        DivisionNumero div = new DivisionNumero();

        int n1 = 0;
        int n2 = 0;
//        String n1 = "";
//        String n2 = "";
        int num1 = 0;
        int num2 = 0;

        try {
            System.out.println("Numero 1:");
            n1 = leer.nextInt();
            System.out.println("Numero 2:");
            n2 = leer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ingresar solo numeros!!!");
        }

//        try {
//            num1 = Integer.parseInt(n1);
//            num2 = Integer.parseInt(n2);
//        } catch (NumberFormatException e) {
//            System.out.println("Pipipipi");
//        }
        
        try{
            System.out.println(div.division(num1, num2));
        } catch(ArithmeticException e){
            System.out.println("Error ninin");
        }
        
    }

}
