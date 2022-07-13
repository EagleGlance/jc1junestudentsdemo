package com.noirix;

import com.noirix.domain.Cat;
import com.noirix.domain.GenericMethod;
import com.noirix.domain.Template;
import com.noirix.domain.User;

public class GenericTest {
    public static void main(String[] args) {
        Template<Long, Cat> catTemplate = new Template<>();
        Long key = catTemplate.getKey();
        Cat value = catTemplate.getValue();

        Template<Integer, Cat> userTemplate = new Template<>();
        Integer key1 = userTemplate.getKey();

        Template<Double, Cat> strTemplate = new Template<>();


        System.out.println(GenericMethod.someFunctionality(1000D, "Percentage: "));
    }
}
