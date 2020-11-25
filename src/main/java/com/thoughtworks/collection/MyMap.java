package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(s -> s * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(integer -> letterList.get(integer - 1)).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
    }
}
