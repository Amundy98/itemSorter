package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    public int compare(Item Id1, Item Id2) {

        int IdCompare = Id1.getId().compareTo(Id2.getId());
        return IdCompare;
    }
}
