public class Main {
    public static void main(String[] args) {
        double velocidadeInicial = 10.0;
        double aceleracao = 2.0;
        double tempo = 5.0;

        double velocidadeFinal = velocidadeInicial + (aceleracao * tempo);
        System.out.println("A velocidade final é " + velocidadeFinal + " m/s");
    }
}
