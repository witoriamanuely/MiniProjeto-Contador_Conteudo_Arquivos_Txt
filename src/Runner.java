public class Runner {
    public static void main(String[] args){
        String texto = arquivo.lerArquivo("/home/witoriamanuely/IdeaProjects/untitled/src/Runner.txt");

        String nome = "W1t0ri4 !!";
        Contagem objeto = new Contagem();
        objeto.contTextoArquivo(texto.toLowerCase());
        System.out.println(objeto.getContVogais());
        System.out.println(objeto.getContConsoantes());
        System.out.println(objeto.getContEspacoBranco());
        System.out.println(objeto.getContCaracteres());
        System.out.println(objeto.getContDigitos());
    }
}
