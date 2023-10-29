public class PesoAltura { //criando uma classe 
    int peso; // peso em kg
    int altura; //altura em cm
    
}

class EstruturaSimples {//em java, cada arquivo só pode ter uma classe pública
    public static final int alturaMaxima = 255;
    public static void main(String[] args){
        PesoAltura pessoa1 = new PesoAltura();
        pessoa1.peso = 80;
        pessoa1.altura = 185;
        System.out.print("Peso :" + pessoa1.peso + ", Altura " + pessoa1.altura + ". ");
        if (pessoa1.altura > alturaMaxima) System.out.println("Altura acima da máxima.");
        else System.out.println("Altura dentro do limite, tudo certo!");
    }
}

// como Executar: No terminal 
// javac NomeDoArquivo.java
// java NomeDoArquivo(sem a extensão)