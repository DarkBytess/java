
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a medida em km");
        double quilometros  = scanner.nextDouble();
        double milhas = quilometros / 1.609;
        System.out.println("a medida em milhas e:" + milhas);
        scanner.close();


    }
}