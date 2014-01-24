package br.com.henriqueso.training.interfacepatterns.adapter;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class SortListAdapter implements Sorter {

    /**
     * @see br.com.henriqueso.training.interfacepatterns.adapter.Sorter#sort(int[])
     */
    public int[] sort(final int[] numbers) {

        // convert the array to a List
        List<Integer> numberList = convertToList(numbers);
        
        // call the adapter
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);
        
        // convert the list back to an array and return
        int[] sortedNumbers = convertToArray(numberList);
        
        return sortedNumbers;
    }

    /**
     * @param numberList
     * @return
     */
    private int[] convertToArray(final List<Integer> numberList) {
        int[] numbers = new int[numberList.size()];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = numberList.get(index);
        }

        return numbers;
    }

    /**
     * @param numbers
     * @return
     */
    private List<Integer> convertToList(final int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i : numbers) {
            list.add(Integer.valueOf(i));
        }

        return list;
    }

}
