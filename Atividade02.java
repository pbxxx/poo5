import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("Aviso: Os números foram informados em ordem inversa. Invertendo...");
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println("Números no intervalo:");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}