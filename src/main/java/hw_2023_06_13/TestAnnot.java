package hw_2023_06_13;

public class TestAnnot {
    @DeprecatedMethod(since = "1.1", forRemoval = true)
    void method1() {

    }
    @Secured(value = {"admin", "superAdmin"})
    void method2() {

    }
    @Cachable(key = "cache", ttl = 5)
    int method3() {
        return -1;
    }
    @LogExecutionTime("LogName1")
    void method4() {

    }
    @LogExecutionTime("LogName2")
    void method5() {

    }
}
