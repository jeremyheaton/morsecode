/**
 * Created by jerem on 4/16/2018.
 */
public class EnglishParser implements Parser {

    @Override
    public String parse(String[] response, MorseCodeMap morseCodeMap) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String character : response) {
            if(morseCodeMap.getAlphaToMorse().get(character) == null) {
                System.out.println("unsupported character");
            }
            stringBuilder.append(morseCodeMap.getAlphaToMorse().get(character));
            stringBuilder.append(" ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
    }
}
