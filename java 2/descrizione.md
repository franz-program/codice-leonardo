Vogliamo simulare un server per il login degli utenti. 

Ogni utente deve avere un mail, una password, una data di creazione utente. Ogni utente puo' ricevere delle mail. Ogni utente puo' controllare tutte le mail dopo una certa data.

La class Server tiene conto degli utenti usando una lista. La classe Server permette di iscrivere utenti, eliminare utenti, ed inviare alcune mail speciali "broadcast" a tutti gli utenti. La classe server permette di inviare automaticamente mail all'utente corrispondente specificando l'email del destinatario.

La classe mail, simula il contenuto di una email. Ogni mail ha un testo, un mittente, una data di creazione. L'oggeto mail deve dire se la mail e' stata mai aperta oppure no. 