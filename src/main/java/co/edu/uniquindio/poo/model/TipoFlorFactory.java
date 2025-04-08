package co.edu.uniquindio.poo.model;
import java.util.HashMap;
import java.util.Scanner;

public class TipoFlorFactory {
    private static final HashMap<String, TipoFlor> listaTiposFlores = new HashMap<>();

    public static TipoFlor getTipo(String tipo) {

        if (!listaTiposFlores.containsKey(tipo)) {
            String simbolo = switch (tipo) {
                case "Margarita" -> "🌼";
                case "Tulipan"   -> "🌷";
                case "Rosa"      -> "🌹";
                case "Cerezo"    -> "🌸";
                default          ->  null;
            };

            if (simbolo == null) {
                return null;
            }

            listaTiposFlores.put(tipo, new TipoFlor(tipo, simbolo));

        }

        return listaTiposFlores.get(tipo);
    }

    public String ingresarTipo() {
        System.out.print("Que tipo de flor desea plantar(Margarita, Tulipan, Rosa, Cerezo): ");
        System.out.print("\n1.Margarita: 🌼");
        System.out.print("\n2.Tulipan 🌷 ");
        System.out.print("\n3.Rosa 🌹");
        System.out.println("\n4.Cerezo 🌸");
        Scanner sc = new Scanner(System.in);
        String tipo = "";
        String opcion = sc.nextLine();
        switch (opcion) {
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
        return tipo;
    }

}
