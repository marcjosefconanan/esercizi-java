class CharFinder {
    public String inputString;

    public CharFinder(String inputString) {
        this.inputString = inputString;
    }

    public String findCharacter(int index) {
        StringBuilder result = new StringBuilder();

        if (index < 0 || index >= inputString.length()) {
            result.append("Errore"); // dice "Errore" se resulta out of bounds.
        } else {
            char character = inputString.charAt(index); // riprende il char
            result.append("Il carattere in posizione ").append(index).append(" è '").append(character).append("'");
        }

        return result.toString();
    }
}