/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg1;

import Objects.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author clavs
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona = new Persona();
        PersonaService serv = new PersonaService();

        //System.out.println("Crear Persona:");
        //serv.crearPersona(persona);
        int mayorDeEdad = 0;

        System.out.println(persona.getEdad());
            
        try {

            boolean per1edad = serv.esMayorDeEdad(persona);
            if (per1edad) {
                mayorDeEdad++;
            }
            
        } catch(Exception a){
            
            System.out.println("ERROR!!!");
            System.out.println(a.getMessage());
            
        }
        

    }

}
