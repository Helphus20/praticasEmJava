import java.util.Scanner;

public class Media {
    int quantAvaliacoes;
    float[] notas;
    float somaNotas = 0;
    String nome;

    public void adicionaNotas() {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < quantAvaliacoes; i++) {
                System.out.println("Digite a nota " + (i + 1) + ":");// i + 1 pq se fosse só i seria 0
                notas[i] = scanner.nextFloat();//Como vai receber um dado flututante , usamos nextInt
                somaNotas += notas[i];
            }
        }
        System.out.println("Esta foi a sua média das avaliações nesta unidade" + somaNotas/quantAvaliacoes);
    }
    public void quantAvaliacoes(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Quantas avaliações você fez nessa unidade?");
            quantAvaliacoes = scanner.nextInt();//Como vai receber um dado inteiro, usamos nextInt
        }
    }
    public void mostraNotas(){
        for(int i = 0; i < quantAvaliacoes; i++){
            System.out.println("Nota da " + (i + 1) + "° avaliação: " + notas[i]);
        }
        System.out.println("Média na unidade: " + somaNotas/quantAvaliacoes);
    }
    public static void main(String[] args) {
        Media boletim = new Media();
        boletim.quantAvaliacoes = 3; // quantidade de unidades
        boletim.notas = new float[boletim.quantAvaliacoes];
        boletim.quantAvaliacoes();
        boletim.adicionaNotas();
        boletim.quantAvaliacoes();
    }
}

// como Executar: No terminal
// javac NomeDoArquivo.java
// java NomeDoArquivo(sem a extensão)