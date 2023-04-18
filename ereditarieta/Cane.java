package ereditarieta;

public class Cane extends Animale{

    private String nomePadrone;
    
    public Cane(String nome, String nomePadrone){
        super(4, "bau", nome); 

        this.nomePadrone = nomePadrone;
        
        /**
         * Cose da sapere:
         * - sintassi: super(campo1, campo2, ...) chiama il costruttore della classe padre
         * - la chiamata a super(....) va fatta come PRIMA RIGA
         * 
         * 
         */
        
    }

    

}
