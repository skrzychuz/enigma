public class Main {

//    static int currentIndex = 0;
//    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    static String rotor = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
//
//
//    public static String Cipher(char msgLetter) {
//
//        if (currentIndex >= 26) {
//            currentIndex = 0;
//        }
//        int realIndex = alphabet.indexOf(msgLetter) + currentIndex++;
//
//        return String.valueOf(rotor.charAt(realIndex));
//
//    }


    public static void main(String[] args) {

        Rotor rotor = Rotor.ROTOR1;

//        for (int i = 0; i < 30; i++) {

        System.out.printf(rotor.cipher('A'));
        System.out.printf(rotor.cipher('D'));


//        }

    }
}
