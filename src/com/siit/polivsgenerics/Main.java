package com.siit.polivsgenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer integer = 200;
        Number number = integer;

//        List<Integer> integerList = new ArrayList<>();
//        List<Number>numberList = integerList;

        List<Integer> integerList = new ArrayList<>();
//        List<Number>numberList = integerList; pentru generice nu se aplica polirfismul



    }
}
