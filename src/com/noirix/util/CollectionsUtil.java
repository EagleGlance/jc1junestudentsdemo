package com.noirix.util;

import java.util.List;

public class CollectionsUtil {
    public static <E> void print(List<E> listForPrint) {
        for (E e : listForPrint) {
            System.out.println(e);
        }
    }
}
