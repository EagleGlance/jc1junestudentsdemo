package com.noirix.streamapi;

import com.noirix.domain.Animal;
import com.noirix.domain.Cat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        Cat customCat = new Cat();
        customCat.setColor("black, pink, green");
        customCat.setWeight(5.7);
        cats.add(customCat);

        Cat cat1 = new Cat();
        cat1.setColor("black, white, red");
        cat1.setWeight(55);
        cats.add(cat1);

        Stream<Cat> stream = cats.stream();

        Stream<String> a1 = Stream.of("a1", "a2", "a3");

        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);

        Predicate<Cat> ageAndNameFilter = cat -> cat.getAge() > 1 && cat.getName().contains("a");
        Predicate<Cat> weightAndColorFilter = cat -> cat.getWeight() >= 0  && cat.getColor() != null && cat.getColor().contains("a");
        Function<Cat, Cat> catUpdater = cat -> {
            cat.setAge(cat.getAge() + 1);
            cat.setColor("white");
            return cat;
        };

        //Optional<Cat> first =
        //long count =
        //Set<Cat> collect =
        //String collect =
        Optional<Double> weightSum = stream
                .skip(0)
//                .filter(ageAndNameFilter)
                .filter(weightAndColorFilter)
//                .map(catUpdater)
                //.map(Cat::toString)
                .map(Cat::getWeight)
                //.peek(cat -> System.out.println("Cat name is: " + cat.getName()))
                //.mapToLong(Animal::getId)
                //.flatMap(cat -> Arrays.stream(cat.getColor().split(", ")))
                //.limit(3)
                .distinct()
                //.sorted(Comparator.reverseOrder())
                //.forEach(cat -> System.out.println(cat));
                //.findFirst()
                //.findAny()
                //.collect(Collectors.toList())
                //.collect(Collectors.toSet())
                //.collect(Collectors.joining(",\n"))
                //.collect(Collectors.)
                //.min(Comparator.naturalOrder())
                .reduce(Double::sum);
        //.count()
//.forEach(System.out::println)

        //System.out.println(collect);

        //System.out.println(count);

        //first.ifPresent(System.out::println);
        weightSum.ifPresent(System.out::println);
//        if (first.isPresent()) {
//            System.out.println(first.get());
//        }

//        for (Cat cat : collect) {
//            System.out.println(cat);
//        }

    }
}
