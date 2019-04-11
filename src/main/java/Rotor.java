public enum Rotor {

    ROTOR1("EKMFLGDQVZNTOWYHXUSPAIBRCJ", 'Q'),
    ROTOR2("AJDKSIRUXBLHWTMCQGZNPYFVOE", 'E'),
    ROTOR3("BDFHJLCPRTXVZNYEIWGAKMUSQO", 'V');

    final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String map;
    char turnOverNotch;
    int currentPosition;

    Rotor(String map, char turnOverNotch) {
        this.map = map;
        this.turnOverNotch = turnOverNotch;
        this.currentPosition = 0;
    }


    public String cipher(char msgLetter) {

        if (this.currentPosition >= 26) {
            this.currentPosition = 0;
        }

        int realIndex = this.alphabet.indexOf(msgLetter) + this.currentPosition++;
        return String.valueOf(this.map.charAt(realIndex));

    }
}
