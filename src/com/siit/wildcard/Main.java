package com.siit.wildcard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<BigDecimal> bigDecimalList = Arrays.asList(BigDecimal.TEN, BigDecimal.valueOf(20), new BigDecimal(5));
        List<String> strings = Arrays.asList("unu", "doi", "tri");
        print(integers);
        print(strings);
        System.out.println();
        System.out.println("sum of integers = " + calculateSum(integers));
        System.out.println("sum of bigDecimals = " + calculateSum(bigDecimalList));
//        System.out.println("sum of Strings = "+ calculateSum(strings)); GRESIT!!!! String-ul nu extinde clasa Number


        List<Integer> integerListSuper = new ArrayList<>();
        addNumbers(integerListSuper); // din cauza ca '? super Integer' metoda addNumber poate stoca elemente in List<Integer>/List<Number>/List<Object>
        System.out.println("Integer types");
        print(integerListSuper);

        List<Number> numberListSuper = new ArrayList<>();
        addNumbers(numberListSuper);
        System.out.println("Number types");
        print(numberListSuper);

        List<Object> objectListSuper = new ArrayList<>();
        addNumbers(objectListSuper);
        System.out.println("Object types");
        print(objectListSuper);

        List<Double> doubleListSuper = new ArrayList<>();
//        addNumbers(doubleListSuper); // nu merge din din cauza ca Double nu este parinte al lui Integer (nu este subclasa al lui integer)
        System.out.println("Object types");
        print(doubleListSuper);

    }

    private static void print(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    private static double calculateSum(List<? extends Number> numbers) {
        double sum = 0;

        for (Number elem : numbers) {
            sum = sum + elem.doubleValue();
        }
        return sum;
    }

    private  static void addNumbers(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
