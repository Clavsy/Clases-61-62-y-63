package Entidades;

public class Armadura {

    private String color1;

    private String color2;

    private Botas botas;

    private Guantes guantes;

    private Casco casco;

    private int resistencia;

    private String material;

    private int salud;

    public Armadura() {
    }

    public Armadura(String color1, String color2, Botas botas, Guantes guantes, Casco casco, int resistencia, String material, int salud) {
        this.color1 = color1;
        this.color2 = color2;
        this.botas = botas;
        this.guantes = guantes;
        this.casco = casco;
        this.resistencia = resistencia;
        this.material = material;
        this.salud = salud;
    }
    
    
}
