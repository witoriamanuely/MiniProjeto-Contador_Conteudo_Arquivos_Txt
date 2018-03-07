import java.io.*;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;


public class Contagem {
    private int contVogais = 0, contConsoantes = 0, contCaracteres = 0, contDigitos = 0;
    private int contEspacoBranco = 0;
    private int contLinhas = 0;


    private static volatile int contFimThread = 0;
    private String consoantes = "bcdfghjklmnpqrstuvxwyz";
    private String vogais = "aeiouáâãàéôõêóúí";
    private String digitos = "0123456789";
    LineNumberReader lineCounter = null;
    private static volatile int totalVogais = 0, totalConso = 0, totalDig = 0, totalCarac = 0, totalEB = 0, totalLinhas = 0;
    private static long totalTempo = 0;

    public void contTextoArquivo(String textoArquivo) {

        for (int i = 0; i < textoArquivo.length(); i++) {
            for (int j = 0; j < vogais.length(); j++) {
                char letra = textoArquivo.charAt(i);
                char vogal = vogais.charAt(j);
                if (letra == vogal) {
                    this.contVogais += 1;
                }
            }
        }

        for (int i = 0; i < textoArquivo.length(); i++) {
            for (int j = 0; j < consoantes.length(); j++) {
                char letra = textoArquivo.charAt(i);
                char consoante = consoantes.charAt(j);
                if (letra == consoante) {
                    this.contConsoantes += 1;
                }
            }
        }

        for (int i = 0; i < textoArquivo.length(); i++) {
            char letra = textoArquivo.charAt(i);
            if (letra == ' ') {
                contEspacoBranco += 1;
            }
        }

        for (int i = 0; i < textoArquivo.length(); i++) {
            for (int j = 0; j < digitos.length(); j++) {
                char letra = textoArquivo.charAt(i);
                char digito = digitos.charAt(j);
                if (letra == digito) {
                    this.contDigitos += 1;
                }
            }
        }

        this.contCaracteres = textoArquivo.length() - (contConsoantes + contEspacoBranco + contDigitos + contVogais);
    }

    public int contaLinhas(String caminho) throws IOException {
        LineNumberReader contarLinha = new LineNumberReader(new InputStreamReader(new FileInputStream(caminho)));
        String proximaLinha;
        try {
            while ((proximaLinha = contarLinha.readLine()) != null) {
                if (proximaLinha == null) {
                    break;
                }
            }
            this.contLinhas = contarLinha.getLineNumber();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contLinhas;
    }

    public int getContVogais() {
        return contVogais;
    }

    public int getContConsoantes() {
        return contConsoantes;
    }

    public int getContCaracteres() {
        return contCaracteres;
    }

    public int getContDigitos() {
        return contDigitos;
    }

    public int getContEspacoBranco() {
        return contEspacoBranco;
    }

    public void somaPorExecucao(int somaLinhas, int somaVogais, int somaConso, int somaCarac, int somaDig, int somaEB, long somaTempo) {
        Contagem.totalLinhas += somaLinhas;
        Contagem.totalCarac += somaCarac;
        Contagem.totalConso += somaConso;
        Contagem.totalDig += somaDig;
        Contagem.totalEB += somaEB;
        Contagem.totalVogais += somaVogais;
        Contagem.totalTempo += somaTempo;
        Contagem.contFimThread++;
    }

    public static int getContFimThread() {
        return Contagem.contFimThread;
    }

    public void imprimiSoma() {
        System.out.println("Total de linhas: " + Contagem.totalLinhas);
        System.out.println("Total Consoantes: " + Contagem.totalConso);
        System.out.println("Total Vogais: " + Contagem.totalVogais);
        System.out.println("Total Digitos: " + Contagem.totalDig);
        System.out.println("Total Espaço em Branco: " + Contagem.totalEB);
        System.out.println("Total de Caracteres Especiais: " + Contagem.totalCarac);
        System.out.println("Total de Tempo de Execução das Threads: " + Contagem.totalTempo + " seg");
        System.out.println();
    }

}