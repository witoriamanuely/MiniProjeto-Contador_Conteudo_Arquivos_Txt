
public class Runner {
    public static void main(String[] args){
        Contagem g = new Contagem();
        String caminho1 = "/home/witoriamanuely/IdeaProjects/untitled/teste.txt";
        String texto1 = Arquivo.lerArquivo(caminho1);
        String caminho2 = "/home/witoriamanuely/IdeaProjects/untitled/arq2.txt";
        String texto2 = Arquivo.lerArquivo(caminho2);
        String caminho3 = "/home/witoriamanuely/IdeaProjects/untitled/texto3.txt";
        String texto3 = Arquivo.lerArquivo(caminho3);
        String caminho4 = "/home/witoriamanuely/IdeaProjects/untitled/texto4.txt";
        String texto4 =  Arquivo.lerArquivo(caminho4);

        new ImplementaThread(texto1.toLowerCase(), caminho1).start();
        new ImplementaThread(texto2.toLowerCase(), caminho2).start();
        new ImplementaThread(texto3.toLowerCase(), caminho3).start();
        new ImplementaThread(texto4.toLowerCase(), caminho4).start();

        int quantThreads = 4;





    }
}
