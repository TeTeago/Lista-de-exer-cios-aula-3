// Nome: Tiago Falco França
// Matrícula: 1261942635

import java.util.Scanner;

public class exercicio5 {


    public static void main(String[] args) {

    
        Scanner scanner = new Scanner(System.in); {
            
            System.out.println("Digite a nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a nota 3: ");
            double nota3 = scanner.nextDouble();    

            double media = (nota1 + nota2 + nota3) / 3;
            System.out.printf("A média é: %.2f", media);

        
            scanner.close();


}


}

}