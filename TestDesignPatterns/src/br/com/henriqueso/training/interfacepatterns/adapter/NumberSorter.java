package br.com.henriqueso.training.interfacepatterns.adapter;

import java.util.Collections;
import java.util.List;


/**
 * 
 */
public class NumberSorter {

    public List<Integer> sort(final List<Integer> numbers) {

        Collections.sort(numbers);

        return numbers;
    }
}
