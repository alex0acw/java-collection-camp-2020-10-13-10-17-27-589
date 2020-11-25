package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return (float) arrayList.stream().reduce(0, Integer::sum) / arrayList.size();
    }

    public int getMaxValue() {
        Optional<Integer> max = arrayList.stream().reduce(Integer::max);
        if (max.isPresent())
            return max.get();
        else
            throw new NoSuchElementException();
    }

    public int getLastOdd() {
        return arrayList.stream().reduce(null,
                (accumulated, current) ->
                        ((current % 2 != 0) ?
                                current : accumulated)
        );
    }
}
