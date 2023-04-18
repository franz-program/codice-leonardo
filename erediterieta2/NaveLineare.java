package erediterieta2;

public class NaveLineare extends NaveMare{

    protected int direzione;
    
    public NaveLineare(Coppia posizione, int nPezzi, int direzione){
        super(posizione, nPezzi);
        this.direzione = direzione;
    }

    public String stato(){
        
    }

}
