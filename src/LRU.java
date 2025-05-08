import java.util.*;

public class LRU {
    public static int simular(List<Integer> paginas, int quadros) {
        List<Integer> memoria = new ArrayList<>();
        int faltas = 0;

        for (int pagina : paginas) {
            if (!memoria.contains(pagina)) {
                faltas++;
                if (memoria.size() == quadros) {
                    memoria.remove(0);
                }
            } else {
                memoria.remove((Integer) pagina);
            }
            memoria.add(pagina);
        }

        return faltas;
    }
}
