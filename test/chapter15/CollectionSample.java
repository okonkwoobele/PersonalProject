package chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class CollectionSample {
    public static void main(String[] args) {
        Map<String, String[]> nigeriaStates = new HashMap<>();
        nigeriaStates.put("Zamfara",new String[]{"Akure","Gusau"});
        nigeriaStates.put("Sokoto",new String[]{"Sokoto","Gusau"});
        nigeriaStates.put("Taraba",new String[]{"Gembu","jalingo municipal"});
        nigeriaStates.put("Akwa-ibom",new String[]{"ikote-epene","ikono"});
                      var set = nigeriaStates.entrySet();
    }
}
