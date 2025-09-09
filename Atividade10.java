import java.util.Scanner;

public class Atividade10 {
    private int canal;
    private int volume;
    private final int CANAL_MIN = 1;
    private final int CANAL_MAX = 100;
    private final int VOLUME_MIN = 0;
    private final int VOLUME_MAX = 100;
    
    public Televisor() {
        this.canal = 1;
        this.volume = 50;
    }
    
    public void mudarCanal(int novoCanal) {
        if (novoCanal >= CANAL_MIN && novoCanal <= CANAL_MAX) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para: " + this.canal);
        } else {
            System.out.println("Canal inválido! Deve estar entre " + CANAL_MIN + " e " + CANAL_MAX);
        }
    }
    
    public void aumentarVolume() {
        if (this.volume < VOLUME_MAX) {
            this.volume++;
            System.out.println("Volume aumentado para: " + this.volume);
        } else {
            System.out.println("Volume máximo atingido!");
        }
    }
    
    public void diminuirVolume() {
        if (this.volume > VOLUME_MIN) {
            this.volume--;
            System.out.println("Volume diminuído para: " + this.volume);
        } else {
            System.out.println("Volume mínimo atingido!");
        }
    }
    
    public void mostrarStatus() {
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Televisor tv = new Televisor();
        
        int opcao;
        do {
            System.out.println("\n=== CONTROLE DA TV ===");
            System.out.println("1 - Mudar canal");
            System.out.println("2 - Aumentar volume");
            System.out.println("3 - Diminuir volume");
            System.out.println("4 - Mostrar status");
            System.out.println("0 - Desligar");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o número do canal: ");
                    int canal = scanner.nextInt();
                    tv.mudarCanal(canal);
                    break;
                case 2:
                    tv.aumentarVolume();
                    break;
                case 3:
                    tv.diminuirVolume();
                    break;
                case 4:
                    tv.mostrarStatus();
                    break;
                case 0:
                    System.out.println("Desligando TV...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}