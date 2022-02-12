package Kurs_27_01_2022.T70;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        try {
            Method m = man.getClass().getDeclaredMethod("reflectionPrinter");
            m.setAccessible(true);
            m.invoke(man);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
