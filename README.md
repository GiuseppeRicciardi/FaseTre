## Fase 3

Crea nel linguaggio di programmazione che preferisci un webservice REST (può girare in locale) in grado di ricevere richieste:

- `POST` per la creazione di un nuovo `Student`
- `GET` per il retrieve di tutti gli `Student` creati

Gli studenti che vengono creati possono essere salvati in un array/list di appoggio che vive solo per la durata dell'esecuzione del server.

Non è necessario creare un'interfaccia per fare le chiamate `POST` e `GET`, è sufficiente un esempio di utilizzo in [Postman](https://www.getpostman.com) o [cURL](https://curl.haxx.se/docs/manpage.html)

Il webservice sfrutta Maven

Il test per verificare il corretto funzionamento è stato eseguito su Postman.
Il body della chiamata `POST` è composto come segue:
```
{
    "id": "1",
    "name" : "Marco",
    "surname" : "Rossi"
    }
```
