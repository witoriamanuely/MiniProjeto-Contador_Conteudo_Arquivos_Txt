public class Runner {
    public static void main(String[] args){
        String texto = Arquivo.lerArquivo("/home/witoriamanuely/IdeaProjects/untitled/src/teste.txt");
        Contagem objeto = new Contagem();
        objeto.contTextoArquivo(texto.toLowerCase());
        System.out.println(objeto.getContVogais());
        System.out.println(objeto.getContConsoantes());
        System.out.println(objeto.getContEspacoBranco());
        System.out.println(objeto.getContCaracteres());
        System.out.println(objeto.getContDigitos());
    }
}
