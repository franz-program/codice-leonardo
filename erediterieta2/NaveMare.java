package erediterieta2;

public abstract class NaveMare {

    
    protected Coppia posizioneNave;
    protected int nPezzi;

    public NaveMare(Coppia posizioneNave, int nPezzi){
        if(nPezzi <= 0){
            throw new IllegalArgumentException();
        }
        this.nPezzi = nPezzi;
        this.posizioneNave = posizioneNave;
    }

    public abstract String stato();

    public boolean affondata(){
        return this.stato().equals("affondato");
    }

}
