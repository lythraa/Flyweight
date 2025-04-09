package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class MiniMapa {
    private final int ancho;
    private final int alto;
    private final String[][] area;
    private final List<Flor> flores = new ArrayList<>();

    public MiniMapa(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.area = new String[ancho][alto];

        for (int y= 0; y < ancho; y++) {
            for (int x = 0; x < alto; x++) {
                area[y][x] = "\uD83C\uDF31";
            }
        }
    }

    public void plantarFlor(int posicionFlorEnX, int posicionFlorEnY, String tipoNombre) {
        TipoFlor tipo = TipoFlorFactory.getTipo(tipoNombre);
        Flor flor = new Flor(posicionFlorEnX, posicionFlorEnY, tipo);
        flores.add(flor);
        area[posicionFlorEnY][posicionFlorEnX] = flor.getSimbolo();
        //se pinta la flor en esa posicion
    }

    public void mostrarMapa(){
        for (int y = 0; y < ancho; y++) {
            for (int x = 0; x < alto; x++) {
                System.out.print(area[y][x]+ " ");
            }
            System.out.println();
        }
    }

    public List<Flor> getFlores() {
        return flores;
    }
}
