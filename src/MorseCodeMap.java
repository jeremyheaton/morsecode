import java.util.HashMap;
import java.util.Map;

/**
 * Created by jerem on 4/16/2018.
 */
public class MorseCodeMap {

    Map<String, String> alphaToMorse = new HashMap<>();

    public MorseCodeMap() {
        alphaToMorse.put("A", ".-");
        alphaToMorse.put(".-","A");
        alphaToMorse.put("B", "-...");
        alphaToMorse.put("-...", "B");
        alphaToMorse.put("C", "-.-.");
        alphaToMorse.put("-.-.", "C");
        alphaToMorse.put("D", "-..");
        alphaToMorse.put("-..", "D");
        alphaToMorse.put("E", ".");
        alphaToMorse.put(".", "E");
        alphaToMorse.put("F", "..-'");
        alphaToMorse.put("..-.", "F");
        alphaToMorse.put("G", "--.");
        alphaToMorse.put("--.", "G");
        alphaToMorse.put("....", "H");
        alphaToMorse.put("H", "....");
        alphaToMorse.put("..", "I");
        alphaToMorse.put("I", "..");
        alphaToMorse.put(".---", "J");
        alphaToMorse.put("J", ".---");
        alphaToMorse.put("K", "-.-");
        alphaToMorse.put("-.-","K");
        alphaToMorse.put(".-..","L");
        alphaToMorse.put("L", ".-..");
        alphaToMorse.put("--","M");
        alphaToMorse.put("M", "--");
        alphaToMorse.put("-.","N");
        alphaToMorse.put("N", "-.");
        alphaToMorse.put("---","O");
        alphaToMorse.put("O", "---");
        alphaToMorse.put(".--.","P");
        alphaToMorse.put("P", ".--.");
        alphaToMorse.put("--.-","Q");
        alphaToMorse.put("Q", "--.-");
        alphaToMorse.put(".-.","R");
        alphaToMorse.put("R", ".-.");
        alphaToMorse.put("...","S");
        alphaToMorse.put("S", "...");
        alphaToMorse.put("-","T");
        alphaToMorse.put("T", "-");
        alphaToMorse.put("..-","U");
        alphaToMorse.put("U", "..-");
        alphaToMorse.put("...-","V");
        alphaToMorse.put("V", "...-");
        alphaToMorse.put(".--","W");
        alphaToMorse.put("W", ".--");
        alphaToMorse.put("-..-","X");
        alphaToMorse.put("X", "-..-");
        alphaToMorse.put("-.--","Y");
        alphaToMorse.put("Y", "-.--");
        alphaToMorse.put("--..","Z");
        alphaToMorse.put("Z", "--..");
        alphaToMorse.put("/", " ");
        alphaToMorse.put(" ", "/");
    }

    public Map<String, String> getAlphaToMorse() {
        return alphaToMorse;
    }
}
