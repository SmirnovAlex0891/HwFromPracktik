package hw_2023_06_13;
/**
 Создать аннотацию @DeprecatedMethod для пометки метода как устаревшего.
 Методы, помеченные этой аннотацией, должны быть доступными только в режиме
 чтения и должны выдавать предупреждение о своем использовании.
 */
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Documented
@Target(METHOD)
@Retention(RetentionPolicy.SOURCE)
@interface DeprecatedMethod {
    String since() default "";
    boolean forRemoval() default false;

}
