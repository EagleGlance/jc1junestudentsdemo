package com.noirix.util;

import com.noirix.domain.Cat;
import com.noirix.exception.NoSuchEntityException;

public class CatUtil {

    public static Cat[] searchCatByParam(Cat[] cats, String query) {
        Cat[] result = new Cat[cats.length];

        int searchResultCount = 0;
        for (int i = 0; i < cats.length; i++) {
            boolean isEqualsNames = cats[i].getColor().equalsIgnoreCase(query);
            if (isEqualsNames) {
                result[i] = cats[i];
                searchResultCount++;
            }
        }

        if (searchResultCount == 0) {
            throw new NoSuchEntityException("We cannot find any cat by query " + query, 404L);
        }

        return result;
    }

}
