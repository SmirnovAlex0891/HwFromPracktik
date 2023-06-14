package hw_2023_06_13;
/**
 * Создать аннотацию @Cachable, которая будет применяться к методу и указывать,
 * что результат выполнения метода должен кэшироваться. Аннотация должна иметь следующие параметры:
 *
 * key: строка, представляющая ключ кэша, по которому будет производиться сохранение и получение результатов метода.
 * ttl: время жизни кэша в секундах.
 */

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(METHOD)
@interface Cachable {
    String key();
    int ttl();
}
