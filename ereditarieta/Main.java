package ereditarieta;

public class Main {
    //create main, initialize one garage, add 3 cars and 2 trucks, print the garage
    public static void main(String[] args) {
        Garage garage = new Garage();
        
        garage.addVeicolo(new Auto(1000, "AA123BB", 100));
        garage.addVeicolo(new Auto(2000, "BB123CC", 200));
        garage.addVeicolo(new Auto(3000, "CC123DD", 300));
        garage.addVeicolo(new Furgone(1000, "DD123EE", 100));
        garage.addVeicolo(new Furgone(2000, "EE123FF", 200));
        System.out.println(garage);
    }


    /**
     * public void stampaNelFlusso(FlussoDiDati flusso){
     *    flusso.write("ciao");
     * }
     * 
     * main(){
     *      stampaNelFlusso(new ServerTCP(191.3.4.5));
     *      stampaNelFlusso(new File("file.txt"));
     * }
     * 
     * EREDITARIETA IN A NUTSHELL:
     * 1. il metodo "stampaNelFlusso" pensa di avere un oggetto di tipo FlussoDiDati
     * 2. Il main passa al metodo un oggetto ServerTCP (che e' una sottoclasse)
     * 3. quando eseguo, viene eseguito il codice specifico di serverTCP anche se 
     * il metodo "stampaNelFlusso" NON LO SA
     * 
     * 
     */
}
