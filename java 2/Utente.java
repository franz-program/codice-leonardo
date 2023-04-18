import java.util.Date;
import java.util.ArrayList;

public class Utente {
    private String mail;
    private String password;
    private Date dataCreazione;
    private ArrayList<Mail> mailRicevute;
    
    public Utente(String mail, String password){
        if(!checkCreationCredentials(mail, password))
            throw new IllegalArgumentException("credenziali non accettabili");
        mailRicevute = new ArrayList<>();
        this.mail = mail;
        this.password = password;
    }

    private boolean checkCreationCredentials(String mail, String password){
        if(checkCreationMail(mail) && checkCreationPassword(password))
            return true;
        return false;
    }

    /**
     * per controllare che sia una mail:
     * - controllo che ci sia una @
     * - controllo che DOPO la @ ci sia un .
     * 
     * indexOf 
     * 
     * @param mail
     * @return
     */

    private boolean checkCreationMail(String mail){
    
    }

    /**
     * per controllare che sia una password accettabile deve:
     * - non deve contenere al suo interno la stringa "password"
     * - deve essere piu' lunga di 8 caratteri
     * - deve avere almeno un numero al suo interno
     * 
     */

    private boolean checkCreationPassword(String password){

    }

    public void addMail(Mail mail){

    }

    public ArrayList<Mail> getMailsAfterDay(Date from){

    }

    //restituisce true se data1 viene dopo data2
    private boolean isDateLaterInTime(Date date1, Date date2){
        return date1.after(date2);
    }


}
