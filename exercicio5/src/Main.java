import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em Km/h: ");
        double velocidadeEmKmPorHora = scanner.nextDouble();

        double velocidadeEmMetrosPorSegundo = velocidadeEmKmPorHora / 3.6;

        System.out.println("A velocidade em m/s é: " + velocidadeEmMetrosPorSegundo);

        scanner.close();
    }
}