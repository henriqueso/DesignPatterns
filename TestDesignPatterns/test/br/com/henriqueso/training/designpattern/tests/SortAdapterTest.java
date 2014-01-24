package br.com.henriqueso.training.designpattern.tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import br.com.henriqueso.training.interfacepatterns.adapter.SortListAdapter;
import br.com.henriqueso.training.interfacepatterns.adapter.Sorter;


/**
 * 
 */
public class SortAdapterTest {

    @Test
    public void test() {
        int[] numbers = new int[] { 34, 2, 4, 12, 1 };

        Sorter sorter = new SortListAdapter();
        int[] sortedNumbers = sorter.sort(numbers);

        assertArrayEquals("Array not sorted as expected",
                        new int[] { 1, 2, 4, 12, 34 }, // expected
                        sortedNumbers); // actual
    }

}
