package Kurs_27_01_2022.T72;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Методы с аннотацией AcademyInfo: ");
        for (Method item: main.getClass().getDeclaredMethods()) {
            if (item.isAnnotationPresent(AcademyInfo.class)){
                System.out.println(item.getName());
            }
        }
    }

    @AcademyInfo(year = 1)
    public static void MethodWithAnn() {
        System.out.println("Кек");
    }

    public static void MethodWithoutAnn() {
        System.out.println("Кык");
    }
}
