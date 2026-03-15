// Nome: Tiago Falco França
// Matrícula: 1261942635


import java.util.Scanner;

   public class exercicio10 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); {

            System.out.println("Distância (km): ");
            double distancia = scanner.nextDouble();

            System.out.println("Velocidade média (km/h): ");
            double velocidade = scanner.nextDouble();

            double tempoHoras = distancia / velocidade;
            int horas = (int) tempoHoras;
            int minutos = (int) ((tempoHoras - horas) * 60);

             System.out.println("Tempo estimado: " + horas + " horas e " + minutos + " minutos.");


             scanner.close();    
    
    
        }

  
    }
  

}

