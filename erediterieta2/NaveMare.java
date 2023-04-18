package erediterieta2;

public abstract class NaveMare {

    
    protected Coppia posizione;
    protected int nPezzi;

    public NaveMare(Coppia posizione, int nPezzi){
        if(nPezzi <= 0){
            throw new IllegalArgumentException();
        }
        this.nPezzi = nPezzi;
        this.posizione = posizione;
    }

    public abstract String stato();

    public boolean affondata(){
        return this.stato().equals("affondato");
    }

}
