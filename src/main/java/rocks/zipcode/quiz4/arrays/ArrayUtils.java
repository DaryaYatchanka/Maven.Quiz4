package rocks.zipcode.quiz4.arrays;


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
        StringBuilder sb = new StringBuilder();
        String[] afterRemoval = new String[0];
        int mid = values.length-1/2;
        for (int i = 0; i <=mid; i++) {
         afterRemoval[i]+=(values[i]);
            
        }
        for(int i =mid; i<values.length-1; i++){
          afterRemoval[i]+=(values[i]);
        }
        return afterRemoval;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        return null;
    }
}