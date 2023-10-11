//A partire dal programma creato precedentemente in cui si richiedeva il calcolo dell'area
// aggiungere una ulteriore classe chiamata Triangolo supportando poi il calcolo dell'area
// per quest'ultima figura



//polimorfismo = praticamente è labilità di diventare un GEN-Z puoi diventare qualsiasi cosa che vuoi
//o quante cose sia. esempio : "him,her,they,gatto,cane,elicottero" dicidi tu.
//scherzo e solo per farmelo riccordare bene Antoo
//Anto non bannarmi per questo HAHAHA


public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(1.0, 2.0);
        Triangolo triangolo = new Triangolo(1.0,2.0,3.0);

        Forma[] shapes ={rettangolo, triangolo};

        // non so se ce nel video ma ho trovato questo nel net
        // questo dovrebbe trovare l'area a tutti i sotto classi di Forma
        // invece di scriverlo uno a uno.

        for (Forma x : shapes){
            x.calcoloArea();
        }
    }
    //rettangolo.calcoloArea();
    //triangolo.calcoloArea();
}