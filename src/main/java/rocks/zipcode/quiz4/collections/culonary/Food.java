package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food <SpiceType extends Class<? extends Spice>> {
    public ArrayList<Spice> spices = new ArrayList<>();
    public Map<SpiceType, Integer> spiceTypeMap;

    public Food(){
        this.spices =new ArrayList<>();
        this.spiceTypeMap = new HashMap<>();

    }
    public List<Spice> getAllSpices() {


        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        for(Spice s:spices){
            if(spiceTypeMap.containsKey(s)){
                spiceTypeMap.put(getType(s), spiceTypeMap.get(s)+1);
            }
            else{
                spiceTypeMap.put(getType(s), 1);
            }
        }

        return (Map<SpiceType, Integer>)spiceTypeMap;
    }

    public SpiceType getType(Spice spice){
        return (SpiceType) spice.getClass();
    }

    public void applySpice(Spice spice) {
        this.spices.add(spice);
    }
}
