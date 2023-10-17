//Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e 
//di scambiare le sue righe e le sue colonne stampandola a video. matrice di partenza

//1 2 3
//4 5 6
//matrice risultato
 //1 4
 //2 5
 //3 6

 public class esercizio28 {
     public static void main(String[] args) {
         //int[][] matrice = {{1, 2, 3}, {4, 5, 6}};
         //int[][] matrice = {{1, 2, 3,4}, {4, 5, 6}};

         int[][] matrice = {{1, 2, 3,4}, {4, 5, 6,7}}; //dimensioni 2 x 4 possono funzionare.
         // se metto int[][] matrice = {{1, 2, 3, 4}, {4, 5, 6}};
         //il codice non funziona xke il quarto intero nel primo matrice va oltre l'altro

         System.out.println("matrice di partenza: ");
         stampaMatrice(matrice);

         int[][] matriceScambiata = switchRigheColonne(matrice);

         System.out.println("Matrice risultato:");
         stampaMatrice(matriceScambiata);
     }
     public static int[][] switchRigheColonne(int [][] matrice){

         int righe = matrice.length;
         int colonne = matrice[0].length;

         int [][] nuovoMatrice = new int [colonne][righe];

         for (int i=0; i < righe; i++){
             for (int j = 0; j < colonne; j++){
                 nuovoMatrice[j][i] = matrice[i][j];
             }
         }

         return nuovoMatrice;
     }

     public  static void  stampaMatrice(int[][] matrice){
         for (int[] riga: matrice) {
             for (int element : riga) {
                 System.out.print(element + "");
             }
             System.out.println();
         }
     }
}

