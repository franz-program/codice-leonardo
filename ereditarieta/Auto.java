package ereditarieta;

public class Auto extends Veicolo{
    private int volumeBagagliaio;

    public Auto(int cilindrata, String targa, int volumeBagagliaio){
        super(cilindrata, targa);
        if(volumeBagagliaio < 0){
            throw new IllegalArgumentException();
        }

        this.volumeBagagliaio = volumeBagagliaio;
    }

    public String toString(){
        //IDEA: voglio non riscrivere il codice della classe veicolo, e in piu'
        //aggiungerci del testo 
        System.out.println("CHIAMO AUTO");
        return super.toString() + String.format("\nBagaglio cm^3: %d", volumeBagagliaio);
    }

    public void stampaTarga(){
        System.out.println("Targa: " + getTarga());
    }
    
}