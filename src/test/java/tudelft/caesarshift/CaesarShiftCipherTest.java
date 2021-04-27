package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void VerifyResult() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }

}
