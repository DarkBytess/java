import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        double velocidade_m_s = scanner.nextDouble();

        double velocidade_km_h = velocidade_m_s * 3.6;

        System.out.println("A velocidade em km/h é: " + velocidade_km_h);

        scanner.close();
    }
}
