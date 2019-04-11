import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  //    static int currentIndex = 0;
//    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    static String rotor =    "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
//
//
  public static String CiperProces(String message) {
    Rotor rotor = Rotor.ROTOR1;

    Stream<Character> characterStream = message.chars()
        .mapToObj(c -> (char) c);

    characterStream.forEach(rotor::cipher);

    return "dupa";
  }


  public static void main(String[] args) {
    CiperProces("jasna dupa");
    Rotor rotor = Rotor.ROTOR1;

//        for (int i = 0; i < 30; i++) {
    rotor.setStartPosition('D');
    System.out.printf(rotor.cipher('A'));
    System.out.printf(rotor.cipher('D'));

//        }

  }
}
