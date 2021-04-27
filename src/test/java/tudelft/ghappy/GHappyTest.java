package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void trueFalse(){
        boolean result = new GHappy().gHappy("xxggyygxx");
        Assertions.assertEquals(false, result);

    }
}
