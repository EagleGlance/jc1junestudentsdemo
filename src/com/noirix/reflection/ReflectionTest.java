package com.noirix.reflection;

import com.noirix.domain.Cat;
import com.noirix.domain.Gender;
import com.noirix.service.CatActionInterface;
import com.noirix.util.ReflectionUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static com.noirix.util.ReflectionUtil.printClassInfo;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Cat> catClass = Cat.class;
        Class<CatActionInterface> catActionInterfaceClass = CatActionInterface.class;

        printClassInfo(catClass);
        printClassInfo(catActionInterfaceClass);


        Class<Gender> genderClass = Gender.class;


        System.out.println(genderClass.isEnum() ? "Enum" : "Not Enum");

        if (genderClass.isEnum()) {
            for (Gender enumConstant : genderClass.getEnumConstants()) {
                System.out.println(enumConstant);
            }
        }


        System.out.println("Fields");
        Cat cat = new Cat("adsasdas", "black", 10);

        System.out.println(cat);
        Field[] fields = catClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);

            field.setAccessible(true);

            for (Annotation annotation : field.getAnnotations()) {

                if (annotation instanceof CustomAnnotation) {
                    String s = (String) field.get(cat);

                    if (s.contains("a")) {
                        field.set(cat, "white");
                    }
                }

                System.out.println(field.get(cat));
            }
        }
        System.out.println(cat);


        System.out.println("Constructors");
        for (Constructor<?> declaredConstructor : catClass.getDeclaredConstructors()) {
            System.out.println(declaredConstructor);

            declaredConstructor.setAccessible(true);

            System.out.println(declaredConstructor.getParameterCount());
            ReflectionUtil.printAnnotationsInfo(declaredConstructor.getDeclaredAnnotations());

            if (declaredConstructor.getParameterCount() == 0) {
                System.out.println("Cat created without declaration of \"new\" operator");
                System.out.println(declaredConstructor.newInstance());
            }

            if (declaredConstructor.getParameterCount() == 3) {
                System.out.println("Cat created without declaration of \"new\" operator with 3 params");
                System.out.println(declaredConstructor.newInstance("constructor", "with params", 3));
            }
        }

        System.out.println("Methods");

        Method[] declaredMethods = catClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);

            declaredMethod.setAccessible(true);

            if (declaredMethod.getName().contains("get") &&
                    declaredMethod.getParameterCount() == 0) {
                System.out.println(declaredMethod.invoke(cat));
            }

            for (Annotation annotation : declaredMethod.getAnnotations()) {

                if (annotation instanceof CustomAnnotation &&
                        declaredMethod.getName().contains("get") &&
                        declaredMethod.getParameterCount() == 0) {

                    System.out.println(declaredMethod.invoke(cat));
                    System.out.println(declaredMethod.invoke(cat));
                    System.out.println(declaredMethod.invoke(cat));
                }
            }

            ReflectionUtil.printClassInfo(declaredMethod.getExceptionTypes());
            ReflectionUtil.printAnnotationsInfo(declaredMethod.getAnnotations());

        }
    }
}
