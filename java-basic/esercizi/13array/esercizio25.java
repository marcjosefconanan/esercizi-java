//Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri. 
//Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano.

public class   esercizio25 {
    public static void main(String[] args) {
        char[] characters = createArray();
        stampaA(characters);
    }
    public static char[] createArray(){
        char[] array = {'a','b','c','d','e','f','a','a','a','a'};
            return array;
    }
   public static void stampaA (char [] array){
     int contaA = 0;

       for (char character : array){
           if (character == 'a'){
               contaA++;
           }
     }
       if (contaA > 0) {
           System.out.println(" 'a' appare " + contaA + " volte");
       }else{
           System.out.println("a non ce" );
       }
    }
}




