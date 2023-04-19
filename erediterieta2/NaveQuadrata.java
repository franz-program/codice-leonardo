package erediterieta2;

public class NaveQuadrata extends NaveMare{

    private boolean[][] statoPezzi;
    private int lunghezza;

    public NaveQuadrata(Coppia posizioneNave, int nPezzi){

        /* 1           2      3
         *1-           -      -
         *2-           -      -
         *3rif         -      -    
         * -----LUNGHEZZA = sqrt(nPezzi)----
         */
        super(posizioneNave, nPezzi);
        if(!eUnQuadrato(nPezzi)){
            throw new IllegalArgumentException();
        }
        this.lunghezza = (int) Math.sqrt(nPezzi);
        statoPezzi = new boolean[lunghezza][lunghezza];
    }

    public String stato(){
        return "boh";
    }

    public String fuoco(Coppia coordinateColpo){
        //se coordinateColpo si trova sulle stesse coordinateColpo di un pezzo allora e' colpito
        if(this.colpito(coordinateColpo)){
            nPezzi--;
            if(nPezzi > 0)
                return "colpito";
            else
                return "affondato";
        } else{
            return "acqua";
        }    

    }

    private boolean colpito(Coppia coordinateColpo){
        int riferimentoNaveX = posizioneNave.getX();
        int riferimentoNaveY = posizioneNave.getY();

        int puntoSparoX = coordinateColpo.getX();
        int puntoSparoY = coordinateColpo.getY();

        int lunghezza = this.lunghezza;

        if(puntoSparoX < riferimentoNaveX)
            return false;
        if(puntoSparoX >= riferimentoNaveX + lunghezza)
            return false;
        if(puntoSparoY > riferimentoNaveY)
            return false;
        if(puntoSparoY < riferimentoNaveY - lunghezza)
            return false;

        if(statoPezzi[puntoSparoX][puntoSparoY] == true){
            return false;
        } else{
            statoPezzi[puntoSparoX][puntoSparoY] = true;
            return true;
        }
    }

    public static boolean eUnQuadrato(int n){
        //return true if the number is a perfect square
        int i = 1;
        while(i*i < n){
            i++;
        }
        return i*i == n;
    }
    
}
