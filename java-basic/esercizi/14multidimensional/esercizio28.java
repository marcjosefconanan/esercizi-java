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
        int[][] matrix = {{1, 2, 3},{4, 5, 6}};

        
        System.out.println("matrix di partenza:");
        stampamatrix(matrix); 

        int[][] matrixScambiata = scambiaRigheConColonne(matrix); 
.
        System.out.println("matrix risultato:");

        stampamatrix(matrixScambiata);
    }

    public static int[][] scambiaRigheConColonne(int[][] matrix) {

        // Ottieni il numero di righe e colonne.
        int righe = matrix.length;
        int colonne = matrix[0].length;

        // nuova matrix con colonne e righe scambiate
        int[][] matrixScambiata = new int[colonne][righe];

        // Scambia righe con colonne.
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matrixScambiata[j][i] = matrix[i][j]; 
            }
        }

        //la matrice scambiata.
        return matrixScambiata; 
    }

    public static void stampamatrix(int[][] matrix) {
        for (int[] riga : matrix) { //for each 
            //ripete attraverso le righe della matrice
            for (int elemento : riga) {
            //  ripete attraverso gli elementi della riga 
                System.out.print(elemento + " "); 
            } 
            System.out.println(); 
        }
    }
}