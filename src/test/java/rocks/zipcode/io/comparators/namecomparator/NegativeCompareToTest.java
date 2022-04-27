package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
@SuppressWarnings("all")
public class NegativeCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(5L, "Apple", 2.0);
        Item item2 = new Item(4L, "Banana", 3.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(4L, "Banana", 3.0);
        Item item2 = new Item(5L, "Wild Cherry", 3.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(4L, "Plums", 5.0);
        Item item2 = new Item(2L, "Pumpkin", 4.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(6L, "Banana", 4.0);
        Item item2 = new Item(5L, "apple", 44.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(5L, "Banana", 6.0);
        Item item2 = new Item(6L, "wild Cherry", 5.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(7L, "Plums", 6.0);
        Item item2 = new Item(6L, "pumpkin", 5.0);

        // when
        Integer comparisonValue = nameComparator.compare(item1, item2);

        // then
        Assert.assertTrue(comparisonValue < 0);
    }

}
