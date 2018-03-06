import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class Contagem {
    private int contVogais = 0, contConsoantes = 0, contCaracteres = 0, contDigitos = 0 ;
    private int contEspacoBranco = 0;
    private String consoantes = "bcdfghjklmnpqrstuvxwyz";
    private String vogais = "aeiouáâãàéôõêóúí";
    private String digitos = "0123456789";
    private Map<String, Integer> dictConts = new HashMap<String, Integer>();

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

        for (int i = 0 ; i < textoArquivo.length(); i++) {
            for (int j = 0; j < consoantes.length(); j++) {
                char letra = textoArquivo.charAt(i);
                char consoante = consoantes.charAt(j);
                if (letra == consoante){
                    this.contConsoantes += 1;
                }
            }
        }

        for (int i = 0 ; i < textoArquivo.length(); i++) {
            char letra = textoArquivo.charAt(i);
            if (letra == ' '){
                contEspacoBranco += 1;
            }
        }

        for (int i = 0 ; i < textoArquivo.length(); i++) {
            for (int j = 0; j < digitos.length(); j++) {
                char letra = textoArquivo.charAt(i);
                char digito = digitos.charAt(j);
                if (letra == digito){
                    this.contDigitos += 1;
                }
            }
        }

        this.contCaracteres = textoArquivo.length() - (contConsoantes + contEspacoBranco + contDigitos + contVogais);
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

}
