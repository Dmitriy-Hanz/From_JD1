package Kurs_27_01_2022.T72;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AcademyInfo {
    int year();
}
