import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  //    static int currentIndex = 0;
//    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    static String rotor =    "EKMFLGDQVZNTOWYHXUSPAIBRCJ";

//         "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//  ROTOR1("EKMFLGDQVZNTOWYHXUSPAIBRCJ", 'Q'), //16
//
//         "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//  ROTOR2("AJDKSIRUXBLHWTMCQGZNPYFVOE", 'E'),
//
//         "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//  ROTOR3("BDFHJLCPRTXVZNYEIWGAKMUSQO", 'V');
//
//
  public static String CiperProces(String message) {
    Rotor rotor = Rotor.ROTOR1;

    Stream<Character> characterStream = message.chars()
        .mapToObj(c -> (char) c);

    characterStream.forEach(msgLetter -> rotor.cipher(msgLetter));
//    characterStream.forEach(System.out::println);

    return "dupa";
  }

  public static String CiperProces2(String message) {
    Rotor rotor1 = Rotor.ROTOR1;
    Rotor rotor2 = Rotor.ROTOR2;
    Rotor rotor3 = Rotor.ROTOR3;

    Stream<Character> characterStream = message.chars()
        .mapToObj(c -> (char) c);

//    characterStream.forEach(msgLetter -> rotor.cipher(msgLetter));
//    characterStream.forEach(System.out::println);

    return "dupa";
  }


  public static void main(String[] args) {
//    CiperProces("HIPOPOTAM");
    Rotor rotor1 = Rotor.ROTOR1;
    Rotor rotor2 = Rotor.ROTOR2;

    char char1 = rotor1.cipher('A');
    char char2 = rotor2.cipher(char1);

    System.out.println(char1);
    System.out.println(char2);

    char char3 = rotor1.cipher('A');
    char char4 = rotor2.cipher(char1);

    System.out.println(char3);
    System.out.println(char4);

  }
}
