package co.edu.uniquindio.poo.model;
//INTRINSECA = NO ES MODIFICABLE, SOLO SE CREA UNA VEZ
public class TipoFlor {
    private String nombre;
    private String simbolo;

    public TipoFlor(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
