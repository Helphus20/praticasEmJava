import java.util.Scanner;

public class Media {
    int quantAvaliacoes;
    float[] notas;
    float somaNotas = 0;
    String nome;
    Scanner scanner = new Scanner(System.in);

    public void adicionaNotas() {
        for (int i = 0; i < quantAvaliacoes; i++) {
            System.out.println("Digite a nota da avaliação " + (i + 1) + ":");// i + 1 pq se fosse só i seria 0
            if(!scanner.hasNextFloat() || scanner.nextFloat() < 0){
                System.out.println("Por favor, digite um número racional positivo e válido (lembre-se de usar vírgula ',' em vez do ponto '.')");
                System.out.println("Digite a nota da avaliação " + (i + 1) + ":");
                scanner.next();
            }
            notas[i] = scanner.nextFloat();// Como vai receber um dado flututante , usamos nextFloat
            somaNotas += notas[i];
        }
    }

    public void quantAvaliacoes() {
        System.out.println("Quantas avaliações você fez nessa unidade?");
        quantAvaliacoes = scanner.nextInt();// Como vai receber um dado inteiro, usamos nextInt
    }

    public void mostraNotas() {
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < quantAvaliacoes; i++) {
            System.out.println("Nota da " + (i + 1) + "° avaliação: " + notas[i]);
        }
        System.out.printf("Esta foi a sua média nesta unidade  %.2f\n", (somaNotas / quantAvaliacoes));
    }

    public static void main(String[] args) {
        Media boletim = new Media();
        boletim.quantAvaliacoes();
        boletim.notas = new float[boletim.quantAvaliacoes];
        boletim.adicionaNotas();
        boletim.mostraNotas();
    }
}

// como Executar: No terminal
// javac NomeDoArquivo.java
// java NomeDoArquivo(sem a extensão)