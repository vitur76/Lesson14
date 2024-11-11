package Task1;

import java.util.ArrayList;
import java.util.List;

public class ListaLucruri {

    public static void main(String[] args) {
        List<String> listaDeLucruriDeFacut = lucruriDeFacutAzi();

        System.out.println("Lista de lucruri de făcut astăzi:");
        for (String lucru : listaDeLucruriDeFacut) {
            System.out.println("- " + lucru);
        }
    }

    // Metoda care returnează lista de lucruri de făcut astăzi
    public static List<String> lucruriDeFacutAzi() {
        List<String> lista = new ArrayList<>();

        lista.add("Finalizează raportul de vânzări");
        lista.add("Participă la întâlnirea cu echipa");
        lista.add("Trimite e-mailuri clienților");
        lista.add("Pregătește prezentarea pentru proiectul nou");
        lista.add("Revizuiește bugetul pentru trimestrul următor");

        return lista;
    }
}

