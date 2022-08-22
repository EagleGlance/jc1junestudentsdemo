package com.noirix.util;

import com.noirix.domain.Cat;
import com.noirix.exception.NoSuchEntityException;
import org.apache.log4j.Logger;

public class CatUtil {

    private static final Logger log = Logger.getLogger(CatUtil.class);

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

            NoSuchEntityException noSuchEntityException = new NoSuchEntityException("We cannot find any cat by query " + query, 404L);

            log.error("Throw exception", noSuchEntityException);
            throw noSuchEntityException;
        }

        return result;
    }

}
