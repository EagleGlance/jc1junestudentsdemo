package com.noirix.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;

public class ReflectionUtil {
    public static void printAnnotationsInfo(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

    public static void printInterfaces(Class<?>[] interfaces) {
        for (Class<?> tempInterface : interfaces) {
            System.out.println(tempInterface);
        }
    }

    public static void printClassInfo(Class<?> someClass) {
        System.out.println(someClass.getName());
        System.out.println(someClass.getSimpleName());
        System.out.println(someClass.getPackage().getName());
        System.out.println(someClass.getClassLoader());
        System.out.println(Modifier.toString(someClass.getModifiers()));

        System.out.println(someClass.getSuperclass());
        ReflectionUtil.printInterfaces(someClass.getInterfaces());
    }

    public static void printClassInfo(Class<?>[] someClass) {
        for (Class<?> aClass : someClass) {
            printClassInfo(aClass);
        }
    }
}
