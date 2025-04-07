package co.edu.uniquindio.poo.model;

public class Flor {
    private final int x;
    private final int y;
    private final TipoFlor tipo;

    public Flor(int x, int y, TipoFlor tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TipoFlor getTipo() {
        return tipo;
    }

    public String getSimbolo(){
        return  tipo.getSimbolo();
    }
}
