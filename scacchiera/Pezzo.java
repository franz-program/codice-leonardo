package scacchiera;

public class Pezzo {
    
    protected boolean squadra;
    protected int riga;
    protected int colonna;
    protected String simboloPezzo;

    public boolean movePiece(int riga, int colonna){
        return true;
    }

    //get riga e colonna
    public int getRiga(){
        return riga;
    }

    public int getColonna(){
        return colonna;
    }

}