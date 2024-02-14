import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a media em milimetros");
        double milimetros = scanner.nextDouble();
        double polegadas = milimetros / 25.4;
        System.out.println("a medida em polegadas e:" + polegadas );
        scanner.close();
    }
}
