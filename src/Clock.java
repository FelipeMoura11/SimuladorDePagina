import java.util.*;

public class Clock {
    public static int simular(List<Integer> paginas, int quadros) {
        int[] memoria = new int[quadros];
        boolean[] referencia = new boolean[quadros];
        Arrays.fill(memoria, -1);

        int ponteiro = 0, faltas = 0;

        for (int pagina : paginas) {
            boolean hit = false;
            for (int i = 0; i < quadros; i++) {
                if (memoria[i] == pagina) {
                    referencia[i] = true;
                    hit = true;
                    break;
                }
            }

            if (!hit) {
                faltas++;
                while (referencia[ponteiro]) {
                    referencia[ponteiro] = false;
                    ponteiro = (ponteiro + 1) % quadros;
                }
                memoria[ponteiro] = pagina;
                referencia[ponteiro] = true;
                ponteiro = (ponteiro + 1) % quadros;
            }
        }

        return faltas;
    }
}
