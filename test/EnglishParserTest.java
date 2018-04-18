import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jerem on 4/17/2018.
 */
public class EnglishParserTest {

    @Test
    public void testMorseParser() {
        MorseCodeMap morseCodeMap = new MorseCodeMap();
        String testResponse = ". -. --. .-.. .. ... .... / .-.. .- -. --. ..- .- --. . / -- . ... ... .- --. .";
        String[] parsedResponse = testResponse.split(" ");
        Parser parser = new MorseParser();
        Assert.assertEquals(parser.parse(parsedResponse, morseCodeMap), ("English language message").toUpperCase());
    }

    @Test
    public void testEnglishParser() {
        MorseCodeMap morseCodeMap = new MorseCodeMap();
        String testResponse = "English language message".toUpperCase();
        String[] parsedResponse = testResponse.split("(?!^)");
        Parser parser = new EnglishParser();
        Assert.assertEquals(parser.parse(parsedResponse, morseCodeMap),
                ". -. --. .-.. .. ... .... / .-.. .- -. --. ..- .- --. . / -- . ... ... .- --. .");
    }

    @Test
    public void testBackAndForth() {
        MorseCodeMap morseCodeMap = new MorseCodeMap();
        String testResponse = "English language message".toUpperCase();
        String[] parsedResponse = testResponse.split("(?!^)");
        Parser parser = new EnglishParser();
        String morse = parser.parse(parsedResponse, morseCodeMap);
        Assert.assertEquals(morse,
                ". -. --. .-.. .. ... .... / .-.. .- -. --. ..- .- --. . / -- . ... ... .- --. .");
        parsedResponse = morse.split(" ");
        parser = new MorseParser();
        Assert.assertEquals(parser.parse(parsedResponse, morseCodeMap), ("English language message").toUpperCase());
    }
}
