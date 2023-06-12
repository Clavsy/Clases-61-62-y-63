/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg6;

/**
 *
 * @author clavs
 */
public class EjercicioPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Class1 e1 = new Class1();
        Class2 e2 = new Class2();
        Class3 e3 = new Class3();
        
//        try {
//            System.out.println(e1.metodo());
//        } catch (Exception e) {
//            System.err.println("Excepcion en metodo() ");
//            e.printStackTrace();
//        }
        
//        try {
//            System.out.println(e2.metodo());
//        } catch (Exception e) {
//            System.err.println("Excepcion en metodo() ");
//            e.printStackTrace();
//        }
        
        try {
            System.out.println(e3.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
    }
}
