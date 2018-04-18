import java.util.Scanner;

/**
 * Created by jerem on 4/16/2018.
 */
public class Translator {

    public static void main(String... args) {
        MorseCodeMap morseCodeMap = new MorseCodeMap();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 'E' to translate to English, enter 'M' to translate to Morse code");
            String response = input.nextLine().toUpperCase();
            if (response.equals("M")) {
                translate(morseCodeMap, input, "(?!^)", new EnglishParser());
            } else if (response.equals("E")) {
                translate(morseCodeMap, input, " ", new MorseParser());
            }
            System.out.println("Enter 'Q' to quit, any other key to continue translations");
            response = input.nextLine();
            if (response.equals("Q")) break;
        }
    }

    private static void translate(MorseCodeMap morseCodeMap, Scanner input, String delimiter, Parser parser) {
        String response;
        System.out.println("Enter the sequence you wish to translate");
        response = input.nextLine();
        String[] parsedResponse = response.split(delimiter);
        String translation = parser.parse(parsedResponse, morseCodeMap);
        System.out.println("Here is your translation");
        System.out.println(translation);
    }
}
