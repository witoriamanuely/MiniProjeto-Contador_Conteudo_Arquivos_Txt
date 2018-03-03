import java.io.*;

public class arquivo {

    public static String lerArquivo (String caminho){
        String conteudo = "";
        InputStream arq = null;
        InputStreamReader leitor = null;
        BufferedReader lerArq = null;
        try {
            arq = new FileInputStream(caminho);
            leitor = new InputStreamReader(arq);
            lerArq = new BufferedReader(leitor);
            String linha = "";
            linha = lerArq.readLine();
            while (linha!=null){
                conteudo+= linha;
                linha = lerArq.readLine();

            }
        }catch (IOException e){
            System.out.print("Erro ao ler arquivo");

        }finally {
            try {
                lerArq.close();
                leitor.close();
                arq.close();
            }catch (IOException e){
                System.out.print("Erro ao fecha arquivo");
            }

        }

        return conteudo;
    }
}
