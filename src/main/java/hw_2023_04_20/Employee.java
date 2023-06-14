package hw_2023_04_20;

public class Employee {
   private String name;
   private String lastName;
   private String sex;
   private int age;
   private int salary;

   public Employee(String name, String lastName, String sex, int age, int salary) {
      this.name = name;
      this.lastName = lastName;
      this.sex = sex;
      this.age = age;
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public String getLastName() {
      return lastName;
   }

   public int getSalary() {
      return salary;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "name='" + name + '\'' +
              ", lastName='" + lastName + '\'' +
              ", sex='" + sex + '\'' +
              ", age=" + age +
              ", salary=" + salary +
              '}';
   }
}
