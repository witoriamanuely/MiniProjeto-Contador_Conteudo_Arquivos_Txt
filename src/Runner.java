import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args){
        Contagem g = new Contagem();
        int quantThreads = 4;
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


        /*String temp;
        for(String arg : args) {
            temp = Arquivo.lerArquivo(arg);
            new ImplementaThread(temp.toLowerCase(), arg).start();
        }
        */
        if (quantThreads != 0) {
            while (true) {
                if (Contagem.getContFimThread() == args.length) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    g.imprimiSoma();
                    break;
                }
            }
        } else {
            System.out.println("Nenhum arquivo para leitura");
        }

    }
}