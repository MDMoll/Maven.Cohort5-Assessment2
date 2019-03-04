package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    public HashMap<String, Integer> inv = new HashMap<>();

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for (String s : strings) {
            if (inv.containsKey(s)) {
                inv.put(s, inv.get(s) + 1);
            }
            inv.put(s, 1);
            //inv.merge(s, 1, Integer::sum);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inv = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        inv.put(item, inv.get(item) + 1);

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inv.put(item, inv.get(item) + -1);
        ;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return inv.get(item);
    }
}
