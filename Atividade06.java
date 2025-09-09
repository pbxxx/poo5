public class Atividade06 {
    private double lado;
    
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    public void mudarLado(double novoLado) {
        this.lado = novoLado;
    }
    
    public double retornarLado() {
        return this.lado;
    }
    
    public double calcularArea() {
        return this.lado * this.lado;
    }
    
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5.0);
        System.out.println("Lado: " + quadrado.retornarLado());
        System.out.println("Área: " + quadrado.calcularArea());
        
        quadrado.mudarLado(7.0);
        System.out.println("Novo lado: " + quadrado.retornarLado());
        System.out.println("Nova área: " + quadrado.calcularArea());
    }
}