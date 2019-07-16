package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private String[] strings;
    private Map<String, Integer> map;

    public WordCounter(String... strings) {
        this.map = new HashMap<>();
        this.strings=strings;

    }

    public Map<String, Integer> getWordCountMap() {

        for(String s: this.strings){
           if(map.containsKey(s)) {
               map.put(s, map.get(s) + 1);
           }
            else{
                map.put(s, 1);
           }
        }
        return map;
    }
}
