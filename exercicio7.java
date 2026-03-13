// Nome: Tiago Falco França
// Matrícula: 1261942635

import java.util.Scanner;

   public class exercicio7 {

        public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); {

        System.out.println("Distância percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.println("Combustível gasto (litros): ");
        double combustivel = scanner.nextDouble();

        double consumo = distancia / combustivel;
        System.out.printf("Consumo médio: %.2f km/l", consumo);

        scanner.close();
    }

}

   }