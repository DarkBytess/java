import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("Digite o numero da nota:");
        n1 = in.nextDouble();
        System.out.println("Digite o numero da nota 2:");
        n2 = in.nextDouble();

        double n3 = (n1 * 1 + n2 * 2) / 3;
        System.out.println(n3);

    }
}