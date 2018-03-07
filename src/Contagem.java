import java.io.*;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class Contagem {
    private int contVogais = 0, contConsoantes = 0, contCaracteres = 0, contDigitos = 0;
    private int contEspacoBranco = 0;
    private int contLinhas = 0;



    private int contFimThread = 0;
    private String consoantes = "bcdfghjklmnpqrstuvxwyz";
    private String vogais = "aeiouáâãàéôõêóúí";
    private String digitos = "0123456789";
    LineNumberReader lineCounter = null;
    private int totalVogais = 0, totalConso = 0, totalDig = 0, totalCarac = 0, totalEB = 0, totalLinhas = 0;
    private long totalTempo = 0;

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
        }return contLinhas;
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
        this.totalLinhas += somaLinhas;
        this.totalCarac += somaCarac;
        this.totalConso += somaConso;
        this.totalDig += somaDig;
        this.totalEB += somaEB;
        this.totalVogais += somaVogais;
        this.totalTempo += somaTempo;
        this.contFimThread += 1;
        System.out.println("Total de linhas:"+this.totalVogais);
        System.out.println("Total Consoantes:"+this.totalConso);
        System.out.println("Total Vogais:"+this.totalVogais);
        System.out.println("Total Digitos:"+this.totalDig);
        System.out.println("Total Espaço em Branco:"+this.totalEB);
        System.out.println("Total de Caracteres Especiais:"+this.totalCarac);
        System.out.println("Total de Tempo de Execução das Threads:"+this.totalTempo);
    }
    public int getContFimThread() {
        return contFimThread;
    }
    public void imprimiSoma(){
        System.out.println("Total de linhas:"+this.totalVogais);
        System.out.println("Total Consoantes:"+this.totalConso);
        System.out.println("Total Vogais:"+this.totalVogais);
        System.out.println("Total Digitos:"+this.totalDig);
        System.out.println("Total Espaço em Branco:"+this.totalEB);
        System.out.println("Total de Caracteres Especiais:"+this.totalCarac);
        System.out.println("Total de Tempo de Execução das Threads:"+this.totalTempo);
    }

}
