import java.io.IOException;

public class ImplementaThread extends Thread {
    private String arquivo, caminho;

    ImplementaThread(String a, String c) {
        this.arquivo = a;
        this.caminho = c;

    }

    public void run() {
        long inicio = 0, fim = 0, total = 0;
        inicio = System.currentTimeMillis();
        Contagem cont = new Contagem();
        cont.contTextoArquivo(this.arquivo);

        try {
            System.out.println("Linhas: " + cont.contaLinhas(this.caminho));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Consoantes: " + cont.getContConsoantes());
        System.out.println("Vogais: " + cont.getContVogais());
        System.out.println("Digitos: " + cont.getContDigitos());
        System.out.println("Espaços em Brancos: " + cont.getContEspacoBranco());
        System.out.println("Caracteres Especiais: " + cont.getContCaracteres());
        fim = System.currentTimeMillis();
        total = (fim - inicio) / 10;
        System.out.println("Tempo: " + total + " seg");
        System.out.println();

        try {
            cont.somaPorExecucao(cont.contaLinhas(this.caminho), cont.getContVogais(), cont.getContConsoantes(), cont.getContCaracteres(), cont.getContDigitos(), cont.getContEspacoBranco(), total);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}