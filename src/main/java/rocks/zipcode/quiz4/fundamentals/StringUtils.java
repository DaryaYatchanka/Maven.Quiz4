package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
       char c = string.charAt(string.length()/2);

        return c;
    }

    public static String capitalizeMiddleCharacter(String str) {
      String result =  str.substring(0, str.length()/2);
      Character mid = Character.toUpperCase(getMiddleCharacter(str));
      String third = str.substring((str.length()/2)+1, str.length());
      String finalResult = result+mid+third;


        return finalResult;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String result =  str.substring(0, str.length()/2);
        Character mid = Character.toLowerCase(getMiddleCharacter(str));
        String third = str.substring((str.length()/2)+1, str.length());
        String finalResult = result+mid+third;


        return finalResult;
    }

    public static Boolean isIsogram(String str) {
        String[] ch = str.split( "");
        LinkedHashSet<String> tr = new LinkedHashSet<String>(Arrays.asList(ch));
        if(ch.length==tr.size()){
            return true;
        }
        return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1; i++) {

                if(str.charAt(i)==str.charAt(i+1)){
                    return true;
                }

            }




        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
//      String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {

                str = str.substring(0, i) + str.substring(i+2);
            }
//                i++;
//
//            }
//            else{
//                result +=str.charAt(i);
//
//            }
//
//        }
//        result +=str.charAt(str.length()-1);
        }
        return str;
    }

    public static String invertCasing(String str) {

        String willBeReturn = "";
        for (int i = 0; i <str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
               willBeReturn+= Character.toLowerCase(str.charAt(i));

            }
          else{
             willBeReturn += Character.toUpperCase(str.charAt(i));
            }
        }

        return willBeReturn ;
    }
}