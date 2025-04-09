package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Flor;
import co.edu.uniquindio.poo.model.MiniMapa;
import co.edu.uniquindio.poo.model.TipoFlor;
import co.edu.uniquindio.poo.model.TipoFlorFactory;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MiniMapa mapa = new MiniMapa(8,8);
        //es de 0 a 7 el mapa

        mapa.plantarFlor(7, 7, "Cerezo");
        mapa.plantarFlor(7, 2, "Cerezo");
        mapa.plantarFlor(4, 5, "Tulipan");
        mapa.plantarFlor(6, 3, "Rosa");
        mapa.plantarFlor(2,3, "Margarita");

        System.out.println("===================================");
        System.out.println("Bienvenido al MiniMapa con Flores");
        System.out.println("===================================");

        boolean ejecutando = true;

        mapa.mostrarMapa();

        while(ejecutando) {
        System.out.println("\n------- MENU PRINCIPAL -------");
        System.out.print("\n1.Plantar flor. ");
        System.out.print("\n2.Mostrar mapa. ");
        System.out.print("\n3.Imprimir flores plantadas. ");
        System.out.print("\n4.Salir. ");
        System.out.print("\nEscribe tu opcion: ");

        String opcion = sc.nextLine();

            switch (opcion){
                case "1":
                    try {
                        System.out.print("En que posicion en x quiere plantar flor: ");
                        int x = sc.nextInt();
                        System.out.print("En que posicion en y quiere plantar flor: ");
                        int y = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Que tipo de flor desea plantar (Margarita, Tulipan, Rosa, Cerezo): ");
                        System.out.print("\n1.Margarita: 🌼");
                        System.out.print("\n2.Tulipan 🌷 ");
                        System.out.print("\n3.Rosa 🌹");
                        System.out.println("\n4.Cerezo 🌸");
                        String tipo = "";
                        String opcionTipo = sc.nextLine();
                        switch (opcionTipo) {
                            case "1":
                                tipo = "Margarita";
                                break;
                            case "2":
                                tipo = "Tulipan";
                                break;
                            case "3":
                                tipo = "Rosa";
                                break;
                            case "4":
                                tipo = "Cerezo";
                                break;
                        }

                        mapa.plantarFlor(x-1, y-1, tipo);
                        System.out.println("Flor plantada con exito.");
                    }
                    catch(Exception e){
                        System.out.println("Entrada inválida. Intenta de nuevo.");
                    }
                    break;
                case "2":
                     mapa.mostrarMapa();
                    break;
                case "3":
                    for(Flor flor : mapa.getFlores()){
                        System.out.println(flor.toString() + " Código en memoria: " + System.identityHashCode(flor.getTipo()));//!!!!!!!!!
                    }
                    break;
                case "4":
                    ejecutando = false;
                    break;

            }
        }

    }

}