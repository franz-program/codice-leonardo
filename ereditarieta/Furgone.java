package ereditarieta;

public class Furgone extends Veicolo{
    private int capienza;

    public Furgone(int cilindrata, String targa, int capienza){
        super(cilindrata, targa);
        if(capienza < 1){
            throw new IllegalArgumentException();
        }

        this.capienza = capienza;
    }

    public String toString(){
        //IDEA: voglio non riscrivere il codice della classe veicolo, e in piu'
        //aggiungerci del testo 
        return  String.format("\nCapienza: %d", capienza);
    }

}