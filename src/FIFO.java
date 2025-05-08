import java.util.*;

public class FIFO {
    public static int simular(List<Integer> paginas, int quadros) {
        Queue<Integer> fila = new LinkedList<>();
        Set<Integer> memoria = new HashSet<>();
        int faltas = 0;

        for (int pagina : paginas) {
            if (!memoria.contains(pagina)) {
                faltas++;
                if (memoria.size() == quadros) {
                    int removida = fila.poll();
                    memoria.remove(removida);
                }
                fila.add(pagina);
                memoria.add(pagina);
            }
        }

        return faltas;
    }
}
