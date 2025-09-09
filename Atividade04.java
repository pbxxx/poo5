import java.util.Scanner;

public class Atividade04 {
    
    public static double calcularIR(double salarioBruto) {
        return salarioBruto * 0.11;
    }
    
    public static double calcularINSS(double salarioBruto) {
        return salarioBruto * 0.08;
    }
    
    public static double calcularSindicato(double salarioBruto) {
        return salarioBruto * 0.05;
    }
    
    public static double calcularTotalDescontos(double salarioBruto) {
        return calcularIR(salarioBruto) + calcularINSS(salarioBruto) + calcularSindicato(salarioBruto);
    }
    
    public static double calcularSalarioLiquido(double salarioBruto) {
        return salarioBruto - calcularTotalDescontos(salarioBruto);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite quanto você ganha por hora: R$ ");
        double valorHora = scanner.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        double salarioBruto = valorHora * horasTrabalhadas;
        
        System.out.println("\n--- Demonstrativo de Pagamento ---");
        System.out.printf("+ Salário Bruto : R$ %.2f\n", salarioBruto);
        System.out.printf("- IR (11%%) : R$ %.2f\n", calcularIR(salarioBruto));
        System.out.printf("- INSS (8%%) : R$ %.2f\n", calcularINSS(salarioBruto));
        System.out.printf("- Sindicato (5%%) : R$ %.2f\n", calcularSindicato(salarioBruto));
        System.out.printf("= Salário Líquido : R$ %.2f\n", calcularSalarioLiquido(salarioBruto));
        
        scanner.close();
    }
}