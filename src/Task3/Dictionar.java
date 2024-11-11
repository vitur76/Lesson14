package Task3;

import java.util.HashMap;
import java.util.Map;

public class Dictionar {

    public static void main(String[] args) {
        // Creăm un dicționar englez-român folosind HashMap
        Map<String, String> dictionarEnglezRoman = new HashMap<>();

        // Adăugăm 10 cuvinte și traducerile lor
        dictionarEnglezRoman.put("apple", "măr");
        dictionarEnglezRoman.put("book", "carte");
        dictionarEnglezRoman.put("car", "mașină");
        dictionarEnglezRoman.put("dog", "câine");
        dictionarEnglezRoman.put("house", "casă");
        dictionarEnglezRoman.put("water", "apă");
        dictionarEnglezRoman.put("sun", "soare");
        dictionarEnglezRoman.put("moon", "lună");
        dictionarEnglezRoman.put("tree", "copac");
        dictionarEnglezRoman.put("road", "drum");

        // Afișăm cuvintele și traducerile lor
        System.out.println("Dicționar englez-român:");
        for (Map.Entry<String, String> entry : dictionarEnglezRoman.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
