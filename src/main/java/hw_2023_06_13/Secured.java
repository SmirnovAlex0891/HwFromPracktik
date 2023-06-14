package hw_2023_06_13;
/**
 * Создать аннотацию @Secured, которая будет применяться к методу и указывать,
 * что данный метод требует определенных прав доступа. Аннотация должна иметь следующие параметры:
 *
 * value: массив строк, представляющих разрешения, необходимые для выполнения метода.
 */

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
@interface Secured {
    String[] value();
}
