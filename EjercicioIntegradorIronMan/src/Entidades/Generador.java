package Entidades;

public class Generador {

    private int energia;

    private Armadura armadura;

    public Generador() {
    }

    public Generador(int energia, Armadura armadura) {
        this.energia = energia;
        this.armadura = armadura;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
    
    
}
