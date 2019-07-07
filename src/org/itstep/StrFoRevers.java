package org.itstep;

public class StrFoRevers {

    public static String  TurnedAllLettersinTheStr(String str){
//Метод принимает (константа)строку и режет по пробелам ,вызывает метод ReverseOnlyLettersInString(String str)
//и конкатенирует полученные строки (после обработки)
//Массив стрингов strArr_[3]
        String [] strArr = str.split("\\s");
//Три строки из strArr_[3]
        String str1 = strArr[0];
        String str2 = strArr[1];
        String str3 = strArr[2];
        System.out.println("\nString str1 = "+str1+"\nString str2 = "+str2+"\nString str3 = "+str3);

        StringBuilder oneStr = new StringBuilder(ReverseOnlyLettersInString(str1)).append(" ");
        oneStr.append(ReverseOnlyLettersInString(str2)).append(" ");
        oneStr.append(ReverseOnlyLettersInString(str3));
        String totalStr = oneStr.toString();
        return totalStr;
    }

    public static String ReverseOnlyLettersInString(String str){
        //Метод принимает строку и переворачивает только буквы
//массив чисел String [] strNum а буквы заменим дефизом(чем нибудь)
        String s = str.replaceAll("(\\D)", "-");
        System.out.println("\nstring without leters = "+s);
//(revers) из StringBuffer вставляю в String revers
        String reverse1 = new StringBuffer(str).reverse().toString();
        System.out.println("String reverse1 = "+reverse1);
// (split) из String revers цифры и вставила буквы в масив String [] strNum
        String [] strNum = reverse1.split("\\d");
//методои append заталкала их в strBuilder;
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < strNum.length; i++) {
            strBuilder.append(strNum[i]);
        }
//вставила в строку String newString из strBuilder.toString()
        String newString = strBuilder.toString();
        System.out.println("\nnewString = "+newString);
////преобразовываем строку в массив
        char[] s_chArray = s.toCharArray();//цифры и дефизы
        char[] newString_chArray = newString.toCharArray();//буквы
        StringBuilder total = new StringBuilder();
//перебираем все элементы чар-массивов
        for(int i = 0, j = 0; i<s_chArray.length; i++){
            if(s_chArray[i] == '-'){//находим -
                total.append(newString_chArray[j]);//заменяем
                j++; }
            else { total.append(s_chArray[i]); }
        }
        String newStr = total.toString();
        System.out.println("\nnewString = "+newStr);

        return newStr;
    }

}
