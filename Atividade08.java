public class Atividade08 {
    private int numeroConta;
    private String nome;
    private double saldo;
    
    public ContaBancaria(int numeroConta, String nome, double saldoInicial) {
        if (validarNumeroConta(numeroConta)) {
            this.numeroConta = numeroConta;
        } else {
            throw new IllegalArgumentException("Número de conta inválido");
        }
        
        if (validarNome(nome)) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome inválido");
        }
        
        this.saldo = saldoInicial;
    }
    
    private boolean validarNumeroConta(int numero) {
        return numero > 0;
    }
    
    private boolean validarNome(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }
    
    private boolean validarValor(double valor) {
        return valor > 0;
    }
    
    public void alterarNome(String novoNome) {
        if (validarNome(novoNome)) {
            this.nome = novoNome;
            System.out.println("Nome alterado com sucesso!");
        } else {
            System.out.println("Nome inválido!");
        }
    }
    
    public void deposito(double valor) {
        if (validarValor(valor)) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }
    
    public void saque(double valor) {
        if (validarValor(valor) && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente!");
        }
    }
    
    public void mostrarDados() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: R$ " + saldo);
    }
    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(12345, "Maria Silva", 1000.0);
        conta.mostrarDados();
        
        System.out.println("\nApós depósito de R$ 500:");
        conta.deposito(500);
        conta.mostrarDados();
        
        System.out.println("\nApós saque de R$ 200:");
        conta.saque(200);
        conta.mostrarDados();
        
        System.out.println("\nAlterando nome:");
        conta.alterarNome("Maria Santos");
        conta.mostrarDados();
    }
}