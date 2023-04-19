
/* 
 * La classe AlRistorente contiene il main che testerà oggetti di tipo Tavolo
 * 
 * Segui attentamente le indicazioni:
 * Avrai sicuramente capito che nel testare un oggetto appartenente alla classe restaurant.Tavolo dovrai necessariamente inserire nell'ordine n pietanze e, per ogni
 * pietanza, dovrai inserire la tipologia (PRIMO, SECONDO, DESSERT, ecc.) il nome della pietanza e il relativo prezzo. Lavoro alquanto noioso e dispendioso (in temini di tempo)
 * 
 * Al fine di "semplificarti la vita", ti vengono messi a disposizioneNave 2 array (paralleli) ovvero hanno la stessa lunghezza e puoi accedere al loro contenuto utilizzando lo stesso indice, 
 * che ti permetteranno di creare oggetti di tipo pietanza in modo veloce e sicuro.
 * Come puoi vedere gli array sono:
 * tipoPietanza (contiene la tipologia della pietanza: il carattere 'P' significa Primo, la 'S' significa Secondo, la 'B' significa Bibita, la 'C' significa Contorno, la 'D' significa Dessert.
 * nomePietanza (contiene il nome della pietanza)
 */ 
import java.util.Random;
import java.util.Scanner;


public class AlRistorante {
	  
      public static void main(String[] args) {
   
		Scanner tast = new Scanner(System.in);
		
		char[]   tipoPietanza = 	{'P','S','P','S','S','B','D','C','C','S','D','B','B','B','S'}; 
		String[] nomePietanza = 	{ 					"SPAGHETTI",
														"COSTATA",
														"GNOCCHI",
														"HAMBURGER",
														"BISTECCA",
														"COCA COLA",
														"DOLCE",
														"PATATINE",
														"VERDURE GRIGLIATE",
														"POLLO ALLO SPIEDO",
														"SORBETTO",
														"BIRRA",
														"ACQUA",
														"VINO",
														"POLENTA E SALSICCIA"
									};
        
        double[] prezzo = new double[nomePietanza.length];
        Random casual = new Random();
        for(int i=0;i<prezzo.length; i++)
        {
			prezzo[i] = casual.nextInt(20)+1;
        }
 		/* 11 - SCRIVI QUI il codice necessario per creare un oggetto tavolo1 di classe Tavolo che conterrà un ordine composto da 3 pietanze per ogni coperto
 		 * (prevedere la lettura del numero di coperti di tavolo1 da tastiera)
		 *  Le pietanze saranno prese casualmente dall'array nomePietanza (e, contestualmente, la tipologia dall'array parallelo tipoPietanza).
		 *  Il prezzo sarà generato casualmente attraverso un oggetto appartenente alla classe Random che dovrà restituire un valore casuale compreso tra 1.0 e 20.0 euro.
		 *  Suggerimento: genera in numero intero casuale compreso tra 10 e 200, poi dividilo per 10
		 */
		System.out.println("Inserisci il numero di coperti del primo tavolo");
		int numCoperti = tast.nextInt();
		
		Tavolo tavolo1 = new Tavolo(9, numCoperti); //numeroTavolo, numeroCoperti
		
		int contVolte=0;
		while(contVolte < (3*numCoperti))
		{
			int i=0;
			//Random casual = new Random();
			for(int volte=0; volte<10000; volte++)
			{
				i=casual.nextInt(nomePietanza.length-1);
			}
			
			//int cost = casual.nextInt(22);  //nextInt(max + min) + min
			
			Pietanza p = new Pietanza(tipoPietanza[i], nomePietanza[i], prezzo[i]);
			tavolo1.aggiungiPiet(p);			
			
			contVolte++;
		}
		
		//per vedere se va --> tavolo1.scontrino();
		
 		/* 12 - SCRIVI QUI il codice necessario per creare un oggetto tavolo2 di classe restaurant.
 		 * Tavolo che conterrà un ordine composto da tutte le pietanze presenti nell'array nomePietanza 
 		 */
		Tavolo tavolo2 = new Tavolo(36, 3);
 		
 		for(int i=0; i<nomePietanza.length; i++)
 		{
			System.out.println("Inserisci il costo del piatto all'indice " +i);
			int cost=tast.nextInt();
			Pietanza p = new Pietanza(tipoPietanza[i], nomePietanza[i], cost);
			tavolo2.aggiungiPiet(p);
 		}
		
		//per vedere se va -->
		tavolo2.scontrino();
		
 		/* 13 - SCRIVI QUI il codice necessario per visualizzare la simil-ricevuta del tavolo 1 e del tavolo 2 */
		System.out.println("Lo scontrino del primo tavolo e':");
		tavolo1.scontrino();
		System.out.println("-----------------------------------");
		System.out.println("Lo scontrino del secondo tavolo e':");
		tavolo2.scontrino();

		
		/* 14 - SCRIVI QUI il codice necessario per confrontare il ricavo del tavolo 1 con quello di tavolo 2 */
		System.out.println("-------------------------");
		
		int ricConf = tavolo1.confrontaRicavo(tavolo2);
		if(ricConf == 1)
			System.out.println("Il ricavato maggiore e' quello del primo tavolo");
		else if(ricConf == 2)
			System.out.println("Il ricavato maggiore e' quello del secondo tavolo");
		else
			System.out.println("Non si puo' confrontare il ricavato, in quanto non c'è una parita' di coperti");
		
		
 		/* 15 - SCRIVI QUI il codice necessario per testare almeno un'altro metodo della classe restaurant.Tavolo (diverso da quelli precedenti)*/
 		
 		//numero pietanze di un certo tipo
 		System.out.println("-------------------------");
 		System.out.println("Nel secondo tavolo ci sono " + tavolo2.numPiet("primo") + " primi piatti");
 		
 		

//TEST
/*		System.out.println("Inserisci il numero di coperti");
		int numCoperti = tast.nextInt();
		Tavolo tavolo1 = new Tavolo(40, numCoperti);
		System.out.println(tavolo1.toStringTav());
		
		Pietanza p1 = new Pietanza(tipoPietanza[0], nomePietanza[0], 9.32);
		//esempio --> Pietanza p1 = new Pietanza('P', "Spaghetti", 9.32);		
		tavolo1.aggiungiPiet(p1);
		System.out.println("--------------");
		tavolo1.scontrino();
*/

    } /* Fine metodo main */
} /* Fine classe AlRistorante */
        
        
        
