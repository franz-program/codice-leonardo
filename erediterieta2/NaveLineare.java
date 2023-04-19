package erediterieta2;

public class NaveLineare extends NaveMare{

    //direzione = 0 -> nord, direzione = 1 -> est
    /*
     * posizioneNave  -   -   -   - (est)
     * 
     *     1             2       3
     * 1(nord)
     * 2   -
     * 3   -
     * 4   -
     * 5posizioneNave
     * 
     */
    protected int direzione;
    protected String stato;
    protected boolean[] statoPezzi;
    
    public NaveLineare(Coppia posizioneNave, int nPezzi, int direzione){
        super(posizioneNave, nPezzi);
        this.direzione = direzione;
        this.stato = "integra";
        statoPezzi = new boolean[nPezzi];
    }

    public String fuoco(Coppia coordinateColpo){
        if(direzione == 0)
            return fuocoNord(coordinateColpo);
        if(direzione == 1)
            return fuocoEst(coordinateColpo);
    }

    private boolean fuocoNord(Coppia coordinateColpo){
        int lunghezza = this.nPezzi;
        int riferimentoNaveX = posizioneNave.getX();
        int riferimentoNaveY = posizioneNave.getY();

        int puntoSparoX = coordinateColpo.getX();
        int puntoSparoY = coordinateColpo.getY();

        if(puntoSparoX != riferimentoNaveX)
            return false;
    }

    public String stato(){
        return stato;
    }



}
