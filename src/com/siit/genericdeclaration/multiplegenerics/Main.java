package com.siit.genericdeclaration.multiplegenerics;

import com.siit.genericdeclaration.generictype.Box;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new OrderedPair<Integer, String>(1, "unu");
        Pair<Integer, Integer> integerPair = new IntegerPair(10, 20);
        IntegerPair integerPair2 = new IntegerPair(20, 40);
        Pair<Double, Double> sameTypePair = new SameTypePair<>(10d, 20d);
        SameTypePair<Double> sameTypePair2 = new SameTypePair<>(15d, 30d);

        Box<String> stringBox = new Box<>();
        stringBox.set("Interiorul cutiei");

        Pair<Integer, Box<String>> p4 = new OrderedPair<>(1, stringBox);
        p4.getValue().get();
        System.out.println(p1.getKey() + " " + p1.getValue());

    }
}
