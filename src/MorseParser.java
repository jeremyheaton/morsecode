/**
 * Created by jerem on 4/16/2018.
 */
public class MorseParser implements Parser {

    @Override
    public String parse(String[] parsedRespinse, MorseCodeMap morseCodeMap) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String character : parsedRespinse) {
            if(morseCodeMap.getAlphaToMorse().get(character) == null) {
                System.out.println("unsupported character");
                return null;
            }
            stringBuilder.append(morseCodeMap.getAlphaToMorse().get(character));
        }
        return stringBuilder.toString();
    }
}
