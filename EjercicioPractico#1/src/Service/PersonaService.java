/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Objects.Persona;

/**
 *
 * @author clavs
 */
public class PersonaService {

    public boolean esMayorDeEdad(Persona per) {

        boolean mayorDeEdad;

        if (per.getEdad() < 18 && per.getEdad() >= 1) {
            System.out.println("La persona es menor de edad.");
            mayorDeEdad = false;
        } else if(per.getEdad() >= 18){
            System.out.println("La persona es mayor de edad.");
            mayorDeEdad = true;
        }

        return mayorDeEdad;
    }
}
