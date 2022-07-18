package com.noirix.collections;

import com.noirix.domain.Cat;
import com.noirix.util.CollectionsUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {
    public static void main(String[] args) {
        //ArrayList<Object> objects = new ArrayList<>();

        List<Cat> cats = new LinkedList<>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        CollectionsUtil.print(cats);

        List<Integer> objects = new LinkedList<>();

        objects.add(10);
        objects.add(77);
        objects.add(88);
        objects.add(99);
        objects.add(100);
        objects.add(100);
        objects.add(100);
        objects.add(100);
        objects.add(100);
        objects.add(100);
        objects.add(100);
        objects.add(100);
        objects.add(100);


        List<Integer> sublist = new LinkedList<>();
        sublist.add(99);
        sublist.add(100);
        sublist.add(100);

        boolean b = objects.containsAll(sublist);
        System.out.println(b);

        List<Integer> integers = objects.subList(1, 5);
        CollectionsUtil.print(integers);

        //objects.trimToSize();  ArrayList link to collection

        System.out.println("Collection size is: " + objects.size());

        objects.remove(1);
        objects.remove(0);

        System.out.println("Collection size is: " + objects.size());
        CollectionsUtil.print(objects);


        //FIFO
        LinkedList<Cat> linkedCats = new LinkedList<>();
        linkedCats.add(new Cat());

        linkedCats.getFirst();
        linkedCats.getLast();

        Cat pop = linkedCats.pop(); //remove and get first element
        linkedCats.poll(); //remove and get first element with NullPointerException check

        System.out.println(pop);

    }
}
