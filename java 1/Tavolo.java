
import java.util.*;


/*
 * La classe Tavolo definisce (simula) un ipotetico tavolo al ristorante
 * E' rilevante memorizzare:
 * 	Il numero del tavolo
 *		Il numero di coperti
 * 	Un insieme di pietanze che saranno inseriti nel ordine di arrivo
 *     Ipotizzare che l'ordine può contenere fino a un massimo di 30 pietanze,
 * 	 
 */ 

/**
 * Classe Tavolo:
 * Rappresenta un tavolo di un ristorante con: un numero identificativo, un numero di coperti ed un ordine costituito al massimo da 30 pietanze
 */

public class Tavolo {
	/* 1 - DEFINISCI le variabili di esemplare */
    int nT;
    int nC;
    ArrayList<Pietanza> ordini;
    final int MAX = 30;
	
 
	/* 2 - SCRIVI QUI il costruttore che accetta il numero di tavolo, il numero dei coperti e costruisce un tavolo che non ha ancora effettuato l'ordine */	
	/**
	 * Istanzia l'oggetto
	 * @param tableNumber il numero del tavolo
	 * @param people il numero di coperti
	 */
	 public Tavolo(int nT, int nC)
	 {
		this.nT = nT;
        this.nC = nC;
        ordini = new ArrayList<>();
	 }
    
	/* 3 - SCRIVI QUI un metodo che aggiunge un coperto al tavolo */
	/**
	 * Aggiunge un coperto al tavolo
	 */	   
    public void aggiungiCop()
    {
		nC++;
	}
 
 	/* 4 - SCRIVI QUI un metodo che permette di aggiungere una pietanza p (entrante) all'ordine */		
 	public void aggiungiPiet(Pietanza p)
    {
        ordini.add(p);
	}
       
	/* 5 - SCRIVI QUI un metodo che permette di rimuovere una pietanza ordinata. 
	 * La pietanza da rimuovere dovrà essere ricercato in base al nome;
	 * Se la pietanza esiste va rimossa e non restituita (rimuovere un solo esemplare nel caso in cui siano presenti più pietanze con lo stesso nome); 
	 * se la pietanza non esiste, non va rimossa!
	 */
	/**
	 * rimuove una pietanza dall'ordine
	 * @param nome il nome della pietanza
	 */
    public void removePiet(String n)
    {
        for(int i = 0; i < ordini.size(); i++){
            Pietanza p = ordini.get(i);
            if(n.equals(p.getNome())){
                ordini.remove(i);
                return;
            } 
        }

	}
    
 	/* 6 - SCRIVI QUI un metodo che permette di calcolare e restituire il conto finale includendo anche 2 euro a coperto.  */
	 /**
	  * Restituisce il conto
	  * @return conto ( arrotondato a 2 cifre dopo la virgola )
	  */
	 public double contoTot()
	 {
        int costoCoperto = 2*nC;
        double costoPiatti = 0.0;
        for(int i = 0; i < ordini.size(); i++){
            Pietanza p = ordini.get(i);
            costoPiatti += p.getPrezzo(); 
        }

        double costoFinale = costoCoperto + costoPiatti;
        return costoFinale;
	 }
	 
	/* 7 - SCRIVI QUI un metodo che permette di calcolare e restituire il numero di pietanze di tipo t (definito come stringa entrante)  */
	/**
	 * Data una stringa che rappresenta un tipo di pietanza (PRIMO, SECONDO, ...), restituisce quante volte compare nell'ordine
	 * @param type il tipo di pietanza (Stringa)
	 * @return c un contatore che rappresenta il numero di volte in cui la pietanza compare
	 */
     public int numPiet(String tipo)
     {
        int cont = 0;
        for(int i = 0; i < ordini.size(); i++){
            Pietanza p = ordini[i];
            if( == tipo){
                cont++;
            }
        }
        return cont;
	 }

 
	/* 8 - SCRIVI QUI il metodo toString che costruisce e restituisce una stringa del tipo:
	 * 	"ORDINE del tavolo 5 con 4 coperti.
	 *  	  Dettaglio:
	 * 		SPAGHETTI (PRIMO) 2.5 euro
	 * 		BIRRA (BIBITE) 5.5 euro
	 * 		POLENTA E SALSICCIA (SECONDO) 10.0 euro
	 * 		SPAGHETTI (PRIMO) 2.0 euro
	 * 		HAMBURGER (SECONDO) 7.5 euro
	 * 		SPAGHETTI (PRIMO) 3.5 euro
	 */
	 public String toString()
	 {

	 }


	/* 9 - SCRIVI QUI un metodo che visualizza a video una simil-ricevuta dettagliata che comprende anche il conto totale */
	/**
	 * Stampa a schermo la ricevuta del tavolo
	 */	
	public void scontrino()
	{
		System.out.println(toString() + "\nIl costo totale e' " +contoTot());
	}
	

	/* 10 - SCRIVI QUI un metodo che confronta il ricavo di this con il ricavo di un altro tavolo 
	 * restituisce 1 se, a parità di coperti, this ha un ricavo maggiore dell'altro tavolo
	 * restituisce 2 se, a parità di coperti, this non ha un ricavo maggiore dell'altro tavolo
	 * retituisce 0 se i tavoli non sono confrontabili (non hanno lo stesso numero di coperti)
	 */
	/**
	 * Metodo che dato un oggetto di classe Tavolo confronta il ricavo di this con l'oggetto dato
	 * @param b il tavolo con cui confrontare this
	 * @return intero 0 se i tavoli non sono confrontabili (non hanno ugual numero di coperti), 1 se this vale più di $b, 2 altrimenti 
	 */
	 public int confrontaRicavo(Tavolo b)
	 {
        if(nC == b.getNumCop()){
            
        }
		 
	 }	 
	 
	 
	// Metodi getter

	/**
	 * Restituisce il numero di coperti
	 * @return coperti
	 */
	public int getNumCop()
	{

	}
	
	/** Restituisce il numero del tavolo
	 * @return numero
	 */
	 public int getNumTav()
	 {

	 }
	
} /* Fine classe Tavolo */

