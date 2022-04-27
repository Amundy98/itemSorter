package rocks.zipcode.io.itemsorter;

import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {


    @Test
    public void test1() {
        Item item1 = new Item(45L, "laptop", 45.0);
        Item item2 = new Item(65L, "dell", 56.0);
        Item item3 = new Item(32L, "camel", 78.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item1, item2, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();
    }


   @Test
    public void test2() {
        Item item1 = new Item(5L, "blue", 85.0);
        Item item2 = new Item(6L, "pink", 96.0);
        Item item3 = new Item(2L, "green", 58.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item1, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();
    }


    @Test
    public void test3() {
        Item item1 = new Item(55L, "laptop", 22.0);
        Item item2 = new Item(75L, "dell", 36.0);
        Item item3 = new Item(42L, "camel", 48.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item1, item2, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();
    }
}
