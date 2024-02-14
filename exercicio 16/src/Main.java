import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do cone: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        double volume = (1.0/3.0) * Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("o volume do cone é: " +volume );

        scanner.close();
    }
}

