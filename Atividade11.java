public class Atividade11 {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    
    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    
    public void abastecerPorValor(double valor) {
        if (valor <= 0) {
            System.out.println("Valor deve ser positivo!");
            return;
        }
        
        double litros = valor / valorLitro;
        if (litros > quantidadeCombustivel) {
            System.out.println("Quantidade insuficiente na bomba!");
            return;
        }
        
        quantidadeCombustivel -= litros;
        System.out.printf("Abastecidos %.2f litros de %s\n", litros, tipoCombustivel);
        System.out.printf("Valor pago: R$ %.2f\n", valor);
    }
    
    public void abastecerPorLitro(double litros) {
        if (litros <= 0) {
            System.out.println("Quantidade deve ser positiva!");
            return;
        }
        
        if (litros > quantidadeCombustivel) {
            System.out.println("Quantidade insuficiente na bomba!");
            return;
        }
        
        double valor = litros * valorLitro;
        quantidadeCombustivel -= litros;
        System.out.printf("Valor a ser pago: R$ %.2f\n", valor);
        System.out.printf("Abastecidos %.2f litros de %s\n", litros, tipoCombustivel);
    }
    
    public void alterarValor(double novoValor) {
        if (novoValor > 0) {
            this.valorLitro = novoValor;
            System.out.println("Valor do litro alterado para: R$ " + novoValor);
        } else {
            System.out.println("Valor deve ser positivo!");
        }
    }
    
    public void alterarCombustivel(String novoTipo) {
        if (novoTipo != null && !novoTipo.trim().isEmpty()) {
            this.tipoCombustivel = novoTipo;
            System.out.println("Tipo de combustível alterado para: " + novoTipo);
        } else {
            System.out.println("Tipo de combustível inválido!");
        }
    }
    
    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidadeCombustivel = novaQuantidade;
            System.out.println("Quantidade de combustível alterada para: " + novaQuantidade + " litros");
        } else {
            System.out.println("Quantidade não pode ser negativa!");
        }
    }
    
    public void mostrarStatus() {
        System.out.println("\n=== STATUS DA BOMBA ===");
        System.out.println("Tipo: " + tipoCombustivel);
        System.out.println("Valor por litro: R$ " + valorLitro);
        System.out.println("Quantidade disponível: " + quantidadeCombustivel + " litros");
    }
    
    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.89, 1000.0);
        bomba.mostrarStatus();
        
        System.out.println("\nAbastecendo por valor (R$ 50.00):");
        bomba.abastecerPorValor(50.00);
        
        System.out.println("\nAbastecendo por litro (10 litros):");
        bomba.abastecerPorLitro(10);
        
        bomba.mostrarStatus();
        
        System.out.println("\nAlterando valor do litro:");
        bomba.alterarValor(6.20);
        
        System.out.println("\nAlterando tipo de combustível:");
        bomba.alterarCombustivel("Etanol");
        
        bomba.mostrarStatus();
    }
}