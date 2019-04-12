public enum Rotor {

  ROTOR1("EKMFLGDQVZNTOWYHXUSPAIBRCJ", 'Q'), //16
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

  public void setStartPosition(char startPosition) {
    currentPosition = alphabetLetterIndex(startPosition);
  }

  public int alphabetLetterIndex(char letter) {
    return alphabet.indexOf(letter);
  }

  public char cipher(char msgLetter) {

    if (this.currentPosition >= 26) {
      this.currentPosition = 0;
    }

    int realIndex = alphabetLetterIndex(msgLetter) + this.currentPosition++;
    if (realIndex >= 26) {
      realIndex = 0;
    }
//    System.out.println(String.valueOf(this.map.charAt(realIndex)));
//    return String.valueOf(this.map.charAt(realIndex));
    return this.map.charAt(realIndex);

  }
}
