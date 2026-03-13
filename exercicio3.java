import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); {


            System.out.println("Digite o valor em dólar: ");
            double valorDolar = scanner.nextDouble();
            final double COTACAO = 4.95;

            double valorReal = valorDolar * COTACAO;

            System.out.println("Valor convertido: ");
            System.out.printf("%.2f", valorReal);

            scanner.close();
            
}

}

}
