import java.util.Scanner;

  public class exercicio8 {
    
    public static void main(String[] args) [

        Scanner sc = new Scanner(System.in); {

            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            System.out.println("Fahrenheit: " + (celsius * 9/5) + 32);
            double fahrenheit = sc.nextDouble();

            System.out.printf("Kelvin: %.2f", celsius + 273.15);

            
              sc.close();

            
        }
    ]
  }
