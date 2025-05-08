import java.util.*;

class NFU {
    public static int simular(List<Integer> paginas, int quadros) {
        int[] memoria = new int[quadros];
        int[] frequencia = new int[quadros];
        int faltasDePagina = 0;

        Arrays.fill(memoria, -1);

        for (int pagina : paginas) {
            int indicePagina = -1;

            for (int i = 0; i < quadros; i++) {
                if (memoria[i] == pagina) {
                    frequencia[i]++;
                    indicePagina = i;
                    break;
                }
            }

            if (indicePagina == -1) {
                faltasDePagina++;
                int menorFrequencia = Integer.MAX_VALUE;
                int paginaParaSubstituir = -1;

                for (int i = 0; i < quadros; i++) {
                    if (frequencia[i] < menorFrequencia) {
                        menorFrequencia = frequencia[i];
                        paginaParaSubstituir = i;
                    }
                }

                memoria[paginaParaSubstituir] = pagina;
                frequencia[paginaParaSubstituir] = 1;
            }
        }

        return faltasDePagina;
    }
}
