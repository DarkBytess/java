import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a media em polegadas");
        double polegadas = scanner.nextDouble();
        double milimetros = polegadas / 2.54 ;
        System.out.println("a medida em milimetros e:" + milimetros );
        scanner.close();
    }
}
