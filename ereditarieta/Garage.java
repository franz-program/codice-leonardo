package ereditarieta;
import java.util.ArrayList;

public class Garage {
    private final int MAX_POSTI = 15;
    private ArrayList<Veicolo> listaVeicoli;

    public Garage(){
        this.listaVeicoli = new ArrayList<>();
    }

    public boolean addVeicolo(Veicolo veicolo){
        if(listaVeicoli.size() >= MAX_POSTI)
            return false;

        listaVeicoli.add(veicolo);
        return true;
    }

    public String toString(){
        String rappresentazione = "";
        for(Veicolo veicolo: listaVeicoli)
            rappresentazione += veicolo.toString() + "\n\n";
        return rappresentazione;
    }

}