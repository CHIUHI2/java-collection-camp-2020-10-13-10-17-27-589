package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        int arraySize = arrayList.size();
        return arrayList.stream().mapToDouble(number -> number).reduce(0.0, (average, number) -> (average * arraySize  + number) / arraySize);
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream().filter(number -> number % 2 != 0).reduce((firstNumber, secondNumber) -> secondNumber).get();
    }
}
