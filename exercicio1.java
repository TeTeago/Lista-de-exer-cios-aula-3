// Nome: Tiago Falco França
// Matrícula: 1261942635

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);{

        System.out.print("Digite um valor: ");
        double num1 =scanner.nextDouble();

        System.out.print("Digite outro valor: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
    }
   
    }   

}