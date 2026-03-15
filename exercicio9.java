// Nome: Tiago Falco França
// Matrícula: 1261942635


import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in); { 

            System.out.println("Preço do produto: ");
            double precoProduto = scanner.nextDouble();

            System.out.println("Valor pago: ");
            double valorPago = scanner.nextDouble();

            System.out.println("Troco: " + (valorPago - precoProduto));


            scanner.close();


        }


    }


}