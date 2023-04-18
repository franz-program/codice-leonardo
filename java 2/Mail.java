import java.util.Date;

public class Mail {
    private String testo;
    private String mailMittente;
    private Date dataCreazione;
    private boolean hasBeenOpened;

    public Mail(String testo, String mailMittente){
        this.testo = testo;
        this.mailMittente = mailMittente;
        this.hasBeenOpened = false;
        this.dataCreazione = new Date();
    }

    public String toString(){
        return "La mail del mittente: " + this.mailMittente +
        "\nHa testo: " + this.testo +
        "\n e' stata creata: " + dataCreazione.toString();
    }

    public Date getDataCreazione(){
        return this.dataCreazione;
    }

    public String getTesto(){
        this.hasBeenOpened = true;
        return this.testo;
    }

    public String getMailMittente(){
        return this.mailMittente;
    }

    
}