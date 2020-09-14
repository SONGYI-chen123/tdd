import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {

    public void should_return_a_new_string_when_the_number_of_vowels_are_more_than_30_of_the_string_length(){
        Mommifier mommifier = new Mommifier();
        String string= new String("aejv");
        String result = mommifier.convert(string);
        assertEquals("amommyejvmommy",result);
    }
}
