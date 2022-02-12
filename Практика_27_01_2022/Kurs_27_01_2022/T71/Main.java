package Kurs_27_01_2022.T71;

import Kurs_27_01_2022.T70.Man;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        HelloWorld hv = new HelloWorld();
        try {
            Method m = hv.getClass().getDeclaredMethod("printHelloWorld");
            m.setAccessible(true);
            m.invoke(hv);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
