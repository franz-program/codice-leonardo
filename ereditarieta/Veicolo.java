package ereditarieta;

public class Veicolo {
    protected int cilindrata;
    protected String targa;

    public Veicolo(int cilindrata, String targa) {
        if(cilindrata <= 0){
            throw new IllegalArgumentException();
        }
        this.cilindrata = cilindrata;
        this.targa = targa;
    }

    public String toString(){
        System.out.println("CHIAMO VEICOLO");
        return String.format("Auto con targa: %s\nCilindrata: %d", targa, cilindrata);
    }

    public String getTarga(){
        return targa;
    }

}
