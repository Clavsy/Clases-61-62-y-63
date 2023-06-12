package Entidades;

public class Casco {

    private Sintetizador sinte;

    public Casco() {
    }

    public Casco(Sintetizador sinte) {
        this.sinte = sinte;
    }

    public Sintetizador getSinte() {
        return sinte;
    }

    public void setSinte(Sintetizador sinte) {
        this.sinte = sinte;
    }
    
}
