import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] cardapio = {
            "100 - Cachorro Quente - R$ 1,20",
            "101 - Bauru Simples - R$ 1,30", 
            "102 - Bauru com ovo - R$ 1,50",
            "103 - Hambúrguer - R$ 1,20",
            "104 - Cheeseburguer - R$ 1,30",
            "105 - Refrigerante - R$ 1,00"
        };
        
        double[] precos = {1.20, 1.30, 1.50, 1.20, 1.30, 1.00};
        
        System.out.println("=== CARDÁPIO ===");
        for (String item : cardapio) {
            System.out.println(item);
        }
        System.out.println("=================");
        
        double totalPedido = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("\nDigite o código do item (ou 0 para finalizar): ");
            int codigo = scanner.nextInt();
            
            if (codigo == 0) {
                continuar = false;
                continue;
            }
            
            if (codigo < 100 || codigo > 105) {
                System.out.println("Código inválido! Tente novamente.");
                continue;
            }
            
            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();
            
            int index = codigo - 100;
            double valorItem = precos[index] * quantidade;
            totalPedido += valorItem;
            
            System.out.printf("Item: %s - Quantidade: %d - Valor: R$ %.2f\n", 
                            cardapio[index].substring(0, cardapio[index].indexOf("-")), 
                            quantidade, valorItem);
        }
        
        System.out.printf("\nTotal do pedido: R$ %.2f\n", totalPedido);
        scanner.close();
    }
}