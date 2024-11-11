package Task2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaUnica {

    public static void main(String[] args) {
        List<String> listaCuDuplicate = new ArrayList<>();
        listaCuDuplicate.add("mere");
        listaCuDuplicate.add("pere");
        listaCuDuplicate.add("mere");
        listaCuDuplicate.add("banane");
        listaCuDuplicate.add("portocale");
        listaCuDuplicate.add("banane");

        Set<String> valoriUnice = obtineValoriUnice(listaCuDuplicate);

        System.out.println("Colecția de valori unice:");
        for (String valoare : valoriUnice) {
            System.out.println("- " + valoare);
        }
    }

    public static Set<String> obtineValoriUnice(List<String> lista) {
        return new HashSet<>(lista);
    }
}
