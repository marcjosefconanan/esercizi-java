//Definire una funzione che accetti in ingresso una stringa e ne restituisca la lunghezza

public class esercizio6 {
    public static void main(String args []){
        String name = "name";
        int length = lengthOfString(name);

        System.out.println("this is the length of the string: " + length);
    }
        public static int lengthOfString(String s){
        return s.length();
    }

}