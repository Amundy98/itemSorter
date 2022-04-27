package rocks.zipcode.io.comparators.idcomparator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.comparators.IdComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NeutralCompareToTest {
    @Test
    public void test1() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 0L;
        Item item1 = new Item(id, null, 3.0);
        Item item2 = new Item(id, null, 4.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }

    @Test
    public void test2() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 1L;
        Item item1 = new Item(id, null, 4.0);
        Item item2 = new Item(id, null, 4.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }

    @Test
    public void test3() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 2L;
        Item item1 = new Item(id, null, 3.0);
        Item item2 = new Item(id, null, 2.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }


    @Test
    public void test4() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 3L;
        Item item1 = new Item(id, null, 1.0);
        Item item2 = new Item(id, null, 2.0);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }

    @Test
    public void test5() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 4L;
        Item item1 = new Item(id, null, 1.1);
        Item item2 = new Item(id, null, 1.1);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }

    @Test
    public void test6() {
        // given
        Comparator<Item> idComparator = (Comparator<Item>) new IdComparator();
        Long id = 5L;
        Item item1 = new Item(id, null, 2.0);
        Item item2 = new Item(id, null, 1.2);

        // when
        Integer comparisonValue = idComparator.compare(item2, item1);

        // then
        Assert.assertEquals(0, comparisonValue, 0);
    }
}
