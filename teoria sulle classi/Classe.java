public class Classe{
    public static void main(String[] args){
        System.out.println("lunghezza: " + args[0] + ", altezza: "+ args[1]);
        int lunghezza = Integer.parseInt(args[0]);
        int altezza = Integer.parseInt(args[1]);

        Ingranaggio ing = new Ingranaggio(lunghezza, altezza);
        
        ing.setAltezza(50);


    }
}