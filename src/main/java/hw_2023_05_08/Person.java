package hw_2023_05_08;

import java.util.List;

class Person {
    private String name;
    private List<String> friends;

    public Person(String name, List<String> friends) {
        this.name = name;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }
}
