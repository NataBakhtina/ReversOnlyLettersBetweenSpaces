package org.itstep;

import static org.itstep.StrFoRevers.TurnedAllLettersinTheStr;

public class AppRunner {
    public static void main(String[] args) {

//3. Преобразовать строку – сделать реверс букв не затрагивая цифр
//   ab1c2d3e f4gh5i6 7jlm8n -> ed1c2b3a i4hg5f6 7nml8j

        String str = TurnedAllLettersinTheStr("ab1c2d3e f4gh5i6 7jlm8n");
        System.out.println("str = "+str);
    }
}
