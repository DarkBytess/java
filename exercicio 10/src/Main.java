
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a distancia em milhas ");
        double milhas = scanner.nextDouble();
        double quilometros = milhas  * 1.60934;
        System.out.println("a medida em quilometros e:" + quilometros);
        scanner.close();


    }
}