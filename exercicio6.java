// Nome: Tiago Falco França
// Matrícula: 1261942635

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); {

            System.out.println("Digite a base (em cm): ");
            double base = scanner.nextDouble();

            System.out.println("Digite a altura (em cm): ");
            double altura = scanner.nextDouble();

            double area = (base * altura);

            System.out.println("Área do retângulo: " + area + " cm²");

            scanner.close();

        }

    }

}
