package rocks.zipcode.quiz4.arrays;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        int end = values.length-1;
        int mid = end/2;

        return values[mid];
    }

    public static String[] removeMiddleElement(String[] values) {

//        String[] afterRemoval = new String[values.length-1];
//        int mid = (values.length)/2;
//        for (int i = 0; i <mid; i++) {
//         afterRemoval[i]=values[i];
//
//        }
//        for(int i =mid+1; i<values.length; i++){
//          afterRemoval[i-1]=values[i];
//        }
//
//
//        return afterRemoval;

        ArrayList<String> al = new ArrayList<>(Arrays.asList(values));
        al.remove(getMiddleElement(values));
         return al.toArray(new String[values.length-1]);
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
//        String[] result = new String[values.length-1];
//        for (int i = 0; i <values.length-1 ; i++) {
//            result[i]=values[i];
//
//        }
//
//        return result;

        return Arrays.copyOf(values, values.length-1);
    }
}