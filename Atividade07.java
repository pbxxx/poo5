public class Atividade07 {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void envelhecer(int anos) {
        for (int i = 0; i < anos; i++) {
            this.idade++;
            if (this.idade < 21) {
                crescer(0.5);
            }
        }
    }
    
    public void engordar(double kg) {
        this.peso += kg;
    }
    
    public void emagrecer(double kg) {
        this.peso -= kg;
    }
    
    public void crescer(double cm) {
        this.altura += cm;
    }
    
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
    }
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 18, 70.0, 175.0);
        pessoa.mostrarDados();
        
        System.out.println("\nApós 3 anos:");
        pessoa.envelhecer(3);
        pessoa.mostrarDados();
        
        System.out.println("\nApós engordar 5kg:");
        pessoa.engordar(5);
        pessoa.mostrarDados();
    }
}