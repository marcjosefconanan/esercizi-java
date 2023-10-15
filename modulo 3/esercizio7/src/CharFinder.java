class CharFinder {
    public final String inputString;

    public CharFinder(String inputString) {
        this.inputString = inputString;
    }

    public String findCharacter(int index) {
        StringBuilder result = new StringBuilder();

        if (index < 0 || index >= inputString.length()) {
            result.append("Error");
        } else {
            char character = inputString.charAt(index);
            result.append("Il carattere in posizione ").append(index).append(" è '").append(character).append("'");
        }

        return result.toString();
    }
}