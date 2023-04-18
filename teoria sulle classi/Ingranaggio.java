public class Ingranaggio {
    private int lunghezza;
    private int altezza;

    public Ingranaggio(int lunghezza, int altezza){
        //tutte le operazioni che dovrei fare quando creo un oggetto
        //spesso solamente settare i campi
        //spesso CONTROLLARE le variabili date in ingresso
        if(lunghezza <= 0 || lunghezza > altezza*3 || altezza <= 0){
            throw new IllegalArgumentException("lunghezza troppo grande");
        }
        this.lunghezza = lunghezza;
        this.altezza = altezza;
    }

    public int getAltezza(){
        return altezza;
    }

    public void setAltezza(int altezza){
        if(this.lunghezza > altezza*3 || altezza <= 0){
            throw new IllegalArgumentException("va in mona");
        }
        this.altezza = altezza;
    }

}