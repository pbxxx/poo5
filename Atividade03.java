import java.util.Scanner;

public class Atividade03 {
    
    public static double somar(double a, double b) {
        return a + b;
    }
    
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Soma: " + somar(num1, num2));
        System.out.println("Subtração: " + subtrair(num1, num2));
        System.out.println("Multiplicação: " + multiplicar(num1, num2));
        
        try {
            System.out.println("Divisão: " + dividir(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        scanner.close();
    }
}