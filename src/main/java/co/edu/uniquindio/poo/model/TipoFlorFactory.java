package co.edu.uniquindio.poo.model;
import java.util.HashMap;

public class TipoFlorFactory {
                                //emoji , objeto
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

}
