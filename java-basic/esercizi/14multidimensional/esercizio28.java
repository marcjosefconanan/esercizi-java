//Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e 
//di scambiare le sue righe e le sue colonne stampandola a video. matrice di partenza

//1 2 3
//4 5 6
//matrice risultato
 //1 4
 //2 5
 //3 6

//il problema sussiste ancora, cosa succede con una "matrice" del genere: int[][] matrice = {{1, 2, 3,4,5}, {4, 5, 6,7}};

import java.io.StringReader;

public class esercizio28 {
    public static void main(String[] args) {
        //int[][] matrice = {{1, 2, 3}, {4, 5, 6}};
        //int[][] matrice = {{1, 2, 3,4}, {4, 5, 6}};

        int[][] matrice = {{1, 2, 3}, {4, 5, 6}}; //dimensioni 2 x 4 possono funzionare.
        // se metto int[][] matrice = {{1, 2, 3, 4}, {4, 5, 6}};
        //il codice non funziona xke il quarto intero nel primo matrice va oltre l'altro

        System.out.println("matrice di partenza: ");
        stampaMatrice(matrice);

        int[][] matriceScambiata = switchRigheColonne(matrice);

        System.out.println("Matrice risultato:");
        stampaMatrice(matriceScambiata);
        System.out.println(isvalidMatrix(matrice));
    }

    public static boolean isvalidMatrix(int[][] matrice) { //ho aggiunto questo metodo che controlla se i array nelmatrice sono uguali.
        boolean flag = false;
        int[] array1 = matrice[0];
        for (int i = 0; i < matrice.length; i++) {
            if (array1.length == matrice[i].length) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static int[][] switchRigheColonne(int[][] matrice) {
        if (isvalidMatrix(matrice) == true) {

            int righe = matrice.length;
            int colonne = matrice[0].length;

            int[][] nuovoMatrice = new int[colonne][righe];

            for (int i = 0; i < righe; i++) {
                for (int j = 0; j < colonne; j++) {
                    nuovoMatrice[j][i] = matrice[i][j];
                }
            }
            return nuovoMatrice;
        }
        return matrice;
    }


        public static void stampaMatrice ( int[][] matrice){
            for (int[] riga : matrice) {
                for (int element : riga) {
                    System.out.print(element + "");
                }
                System.out.println();
            }
        }
    }


