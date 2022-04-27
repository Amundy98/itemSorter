package rocks.zipcode.io.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PositiveCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(7L, "Apple", 9.0);
        Item item2 = new Item(8L, "Banana", 5.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(7L, "Banana", 7.0);
        Item item2 = new Item(4L, "Wild Cherry", 6.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test3() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(6L, "Plums", 4.0);
        Item item2 = new Item(4L, "Pumpkin", 56.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test4() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(7L, "Banana", 5.0);
        Item item2 = new Item(8L, "apple", 4.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(5L, "Banana", 78.0);
        Item item2 = new Item(8L, "wild Cherry", 98.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }


    @Test
    public void test6() {
        // given
        Comparator<Item>nameComparator = (Comparator<Item>)new NameComparator();
        Item item1 = new Item(4L, "Plums", 6.0);
        Item item2 = new Item(6L, "pumpkin", 67.0);

        // when
        Integer comparisonValue = nameComparator.compare(item2, item1);

        // then
        Assert.assertTrue(comparisonValue > 0);
    }

}
