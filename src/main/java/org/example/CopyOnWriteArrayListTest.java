package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {

    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("B");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            if(element.equals("A")){
                list.add("AA");
            }
        }

        System.out.println(list);
    }
}
