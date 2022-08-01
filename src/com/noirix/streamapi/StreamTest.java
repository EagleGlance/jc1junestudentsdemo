package com.noirix.streamapi;

import com.noirix.domain.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        Stream<Cat> stream = cats.stream();

        Stream<String> a1 = Stream.of("a1", "a2", "a3");

        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);

        Predicate<Cat> ageAndNameFilter = cat -> cat.getAge() > 1 && cat.getName().contains("a");
        Predicate<Cat> weightAndColorFilter = cat -> cat.getWeight() > 3 && cat.getColor().contains("o");
        Function<Cat, Cat> catUpdater = cat -> {
            cat.setAge(cat.getAge() + 1);
            cat.setColor("white");
            return cat;
        };

        stream
                .skip(2)
//                .filter(ageAndNameFilter)
//                .filter(weightAndColorFilter)
                .map(catUpdater)
                .limit(3)
                .distinct()
                //.forEach(cat -> System.out.println(cat));
                .forEach(System.out::println);


    }
}
