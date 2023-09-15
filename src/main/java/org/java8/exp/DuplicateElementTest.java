package org.java8.exp;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElementTest {


    public static void getDuplicateElementUsingGroupingBy(Stream<Integer> intStream){
        Set<Integer> collect = intStream.collect(Collectors .groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println(collect);
    }

    public static void getDuplicateElementUsingFrequency(List<Integer> list){
        Set<Integer> collect1 = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
        System.out.println(collect1);
    }

    public static void main(String[] args) {

        Stream<Integer> intStream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        getDuplicateElementUsingGroupingBy(intStream);

        List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        getDuplicateElementUsingFrequency(list);


    }
}
