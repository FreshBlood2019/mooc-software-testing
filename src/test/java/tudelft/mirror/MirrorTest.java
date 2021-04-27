package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
     @Test
    public void backwardsWords(){
        String result = new Mirror().mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);
    }
}
