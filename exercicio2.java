import java.util.Scanner;

public class exercicio2 {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in); {

System.out.print("Digite X: ");
int num1 = scanner.nextInt();

System.out.print("Digite Y: ");
int num2 = scanner.nextInt();

int resto = num1 % num2;

System.out.println("O resto da divisão de " + num1 + " por " + num2 + " é: " + resto);

scanner.close();

}

}

}