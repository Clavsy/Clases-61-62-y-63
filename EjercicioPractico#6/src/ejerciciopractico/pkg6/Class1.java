/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico.pkg6;

/**
 *
 * @author clavs
 */
public class Class1 {

    public static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("42");
            valor = valor + 1;
            System.out.println("Valor final del try :" + valor
            );
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch  :" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor
            );
        }
        valor = valor + 1;
        System.out.println(
                "Valor antes del return: " + valor
        );
        return valor;
    }
}