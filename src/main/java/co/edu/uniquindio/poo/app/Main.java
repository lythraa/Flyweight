package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.MiniMapa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MiniMapa mapa = new MiniMapa(8,8);
        Scanner scanner = new Scanner(System.in);

        //es de 0 a 7 el mapa
        mapa.plantarFlor(2,3, "Margarita");
        mapa.plantarFlor(4, 5, "Tulipan");
        mapa.plantarFlor(7, 2, "Cerezo");
        mapa.plantarFlor(6, 3, "Rosa");
        mapa.plantarFlor(7, 7, "Cerezo");

        System.out.println("Bienvenido al MiniMapa con Flores");
        boolean ejecutando = true;
        mapa.mostrarMapa();
        while(ejecutando) {
        System.out.print("\n1.Plantar flor: ");
        System.out.print("\n2.Mostrar mapa: ");
        System.out.print("\n3.Salir ");
        System.out.print("\nEscribe tu opcion: ");

        String opcion = scanner.nextLine();

            //hacer el switch para el menu
            //los comentarios
            // el metodo que maneje cuando el tipo de flor sea null (ver TipoFlor!!)
        }
    }
}