
public class SimpleThread extends Thread {
    private String arquivo;
    SimpleThread(String a){
        this.arquivo = a;

    }
    public void run(){
        Contagem cont = new Contagem();
        cont.contTextoArquivo(arquivo);
        System.out.println("Consoantes:"+cont.getContConsoantes());
        System.out.println("Vogais:"+cont.getContVogais());
        System.out.println("Digitos:"+cont.getContDigitos());
        System.out.println("Espaços em Brancos:"+cont.getContEspacoBranco());
        System.out.println("Caracteres Especiais:"+cont.getContCaracteres());

        try {
            Thread.sleep((long)(Math.random()*1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
