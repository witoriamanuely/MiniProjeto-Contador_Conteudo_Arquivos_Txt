public class Runner {
    public static void main(String[] args){
        String texto1 = Arquivo.lerArquivo("teste.txt");
        String texto2 = Arquivo.lerArquivo("arq2.txt");
        new SimpleThread(texto1).start();
        new SimpleThread(texto2).start();

    }
}
