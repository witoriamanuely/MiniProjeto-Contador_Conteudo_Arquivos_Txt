import java.io.*;

public class Arquivo {
    public static String lerArquivo (String caminho){
        String conteudo = "";
        InputStream arquivo = null;
        InputStreamReader leitor = null;
        BufferedReader ler = null;
        try {

            arquivo = new FileInputStream(caminho);
            leitor = new InputStreamReader(arquivo);
            ler = new BufferedReader(leitor);
            String linha = "";
            linha = ler.readLine();
            while (linha!=null){
                conteudo+= linha;
                linha = ler.readLine();

            }
        }catch (FileNotFoundException e){
            System.out.print("Erro ao criar arquivo");
        }catch (IOException e){
            System.out.print("Erro ao ler arquivo");

        } finally {
            try {
                ler.close();
                leitor.close();
                arquivo.close();
            }catch (IOException e){
                System.out.print("Erro ao fechar arquivo");
            }

        }

        return conteudo;
    }
}
