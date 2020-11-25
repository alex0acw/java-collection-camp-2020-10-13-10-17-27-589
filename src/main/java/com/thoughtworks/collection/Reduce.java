package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream()
                .mapToDouble(Integer::doubleValue)
                .reduce(0d, (left, right) -> left + right / arrayList.size());
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(null, (integer, integer2) -> {
            if (integer == null) return integer2;
            else if (integer2 > integer) return integer2;
            return integer;
        });
    }

    public int getLastOdd() {
        return arrayList.stream().reduce(null, (integer, integer2) -> {
            if (integer2 % 2 != 0)
                return integer2;
            else return integer;
        });
    }
}
