package scacchiera;

import java.util.ArrayList;

//qualcosa che controlli che il pezzo faccia una mossa "legale"
//qualcosa che controlli se in quella casella c'era un pezzo avversario
//qualcosa che controlli che non ci siano ostacoli fra dove si trova il pezzo 
//e dove si deve muovere

public class Scacchiera {
    
    private String[][] grid = new String[8][8];
    private ArrayList<Pezzo> pezzi;

    public static void main(String... args){

        //creo una scacchiera
        Scacchiera scacchiera = new Scacchiera();

        while(!scacchiera.isTheGameEnded()){
            //prendere coordinata pezzo da muovere
            String coordinataIniziale = ;
            //prendere coordinata in cui muoverlo
            String coordinataFinale = ;

            if(scacchiera.isMoveLegal(coordinataIniziale, coordinataFinale)){
                scacchiera.muoviPezzo(coordinataIniziale, coordinataFinale);
                System.out.println(scacchiera.toString());
                System.out.print("Inserisci nuova mossa: ");
            } else{
                System.out.println("Mossa illegale, riprova!");
            }

        }

        System.out.println("Il vincitore e': " + scacchiera.getWinner());


    }

    public Scacchiera(){
        pezzi = new ArrayList<>();


        pezzi.add(new Cavallo(...));
        pezzi.add(new Torre(...));

        for(int i = 0; i < 8; i++){
            pezzi.add(new Pedone(...));
        }

    }

    public boolean isMoveLegal(String coordinataIniziale, String coordinataFinale){
        //return false se non e' possibile la mossa
    }

    public void muoviPezzo(String coordinataIniziale, String coordinataFinale){
        
    }

    public boolean isTheGameEnded(){

    }

    public int getWinner(){

    }

    public String toString(){
        updateGrid();
        return getGridRepresentation();
    }

    private void updateGrid(){
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++)
                grid[i][j] = " - ";

        for(Pezzo pezzo: pezzi){
            int i = pezzo.getRiga();
            int j = pezzo.getColonna();
            grid[i][j] = pezzo.toString();
        }
    }

    private String getGridRepresentation(){
        String representation = "";
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                representation += " " + grid[i][j] + "|";
            }
            representation+="\n";
        }

    }


}