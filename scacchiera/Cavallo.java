package scacchiera;

public class Cavallo extends Pezzo{

    

    public boolean movePiece(int riga, int colonna){
        //controllare che la mossa ha senso
        if(riga - this.riga == 2 && colonna - this.colonna == 1){
            this.riga = riga;
            this.colonna = colonna;
            return true;
        } else if(riga - this.riga == 2 && colonna - this.colonna == -1){
            this.riga = riga;
            this.colonna = colonna;
            return true;
        } else if(riga - this.riga == -2 && colonna - this.colonna == 1){
            this.riga = riga;
            this.colonna = colonna;
            return true;
        } else if(riga - this.riga == -2 && colonna - this.colonna == -1){
            this.riga = riga;
            this.colonna = colonna;
            return true;
        } //mancano 4 casi

        return false;
    }

    
}
