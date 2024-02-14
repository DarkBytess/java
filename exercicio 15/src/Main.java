import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do cilindro: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do cilidro: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) * altura;

        System.out.println("o volume do cilindro é: " + area);

        scanner.close();
    }
}

