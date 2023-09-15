package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        String inputStr = "Happy independence Day";
        List<String> stringList = Arrays.asList(inputStr.split(""));
        System.out.println(stringList);
        Map<String, Long> listMap = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(listMap);

    }
}