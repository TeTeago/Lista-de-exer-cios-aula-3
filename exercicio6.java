// Nome: Tiago Falco França
// Matrícula: 1261942635

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de elementos do vetor: ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / n;

        System.out.println("A média dos elementos do vetor é: " + media);

        scanner.close();
    }
}