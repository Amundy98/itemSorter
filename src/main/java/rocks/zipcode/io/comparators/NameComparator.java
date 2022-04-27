package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item name1, Item name2) {

        int nameCompare = name1.getName().compareTo(name2.getName());
        return nameCompare;
    }
}
