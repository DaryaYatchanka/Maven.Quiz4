package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
       char c = string.charAt(string.length()/2);

      //  return string.charAt(string.substring(position, position+length));
        return c;
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuffer strBf = new StringBuffer();
        getMiddleCharacter(str);
        char ch = Character.toUpperCase(strBf.charAt(getMiddleCharacter(str)));
        str.replace(getMiddleCharacter(str), ch);


        return strBf.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        HashSet<String> s = new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {

        }
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}