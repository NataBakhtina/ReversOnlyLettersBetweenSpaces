package org.itstep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StrFoReversTest {

    @Test
    void turnedAllLettersinTheStr() {
        String strData = StrFoRevers.TurnedAllLettersinTheStr("ab1c2d3e f4gh5i6 7jlm8n");
        Assertions.assertEquals("ed1c2b3a i4hg5f6 7nml8j",strData);
    }

    @Test
    void reverseOnlyLettersInStringFirstWord() {
        String strData0 = StrFoRevers.ReverseOnlyLettersInString("ab1c2d3e");
        Assertions.assertEquals("ed1c2b3a",strData0);
    }
    @Test
    void reverseOnlyLettersInStringSecondWord() {
        String strData1 = StrFoRevers.ReverseOnlyLettersInString("f4gh5i6");
        Assertions.assertEquals("i4hg5f6",strData1);
    }
    @Test
    void reverseOnlyLettersInStringTherdWord() {
        String strData2 = StrFoRevers.ReverseOnlyLettersInString("7jlm8n");
        Assertions.assertEquals("7nml8j",strData2);
    }
}