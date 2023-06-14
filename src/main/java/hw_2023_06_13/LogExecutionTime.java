package hw_2023_06_13;
/**
 * Создайте аннотацию @LogExecutionTime, которая будет использоваться для измерения и логирования времени выполнения методов.
 * Аннотация должна иметь поле value, чтобы указать название лога.Аннотируемые методы: Все методы
 * Хранение (@Retention): RUNTIME
 */

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {
    String value();
}
