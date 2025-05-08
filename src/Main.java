import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sequência de páginas separadas por vírgula (ex: 1,2,3,4,1,2): ");
        String input = scanner.nextLine();

        List<Integer> paginas = Arrays.stream(input.split(","))
            .map(String::trim)
            .map(Integer::parseInt)
            .toList();

        System.out.println("Digite o número de quadros de página (ex: 3): ");
        int quadros = scanner.nextInt();

        System.out.println("\nResultados:");
        System.out.println("FIFO - " + FIFO.simular(paginas, quadros) + " faltas de página");
        System.out.println("LRU - " + LRU.simular(paginas, quadros) + " faltas de página");
        System.out.println("Clock - " + Clock.simular(paginas, quadros) + " faltas de página");
    }
}
