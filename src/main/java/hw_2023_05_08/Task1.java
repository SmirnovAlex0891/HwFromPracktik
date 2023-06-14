package hw_2023_05_08;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Задача: Дана коллекция объектов класса Person, содержащая поля name и список friends,
 * представляющий список друзей данного человека. Напишите метод, который находит двух людей в коллекции,
 * у которых максимальное число общих друзей. Если таких людей несколько, то вернуть список их имен.
 */
public class Task1 {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", new ArrayList<>(Arrays.asList("Adam", "Ann", "Pol")));
        Person person2 = new Person("Nik", new ArrayList<>(Arrays.asList("Adam", "Ann", "Fil")));
        Person person3 = new Person("John", new ArrayList<>(Arrays.asList("Jack", "Ann", "Harry")));
        Person person4 = new Person("Charley", new ArrayList<>(Arrays.asList("Oskar", "Helen", "Adam")));
        Person person5 = new Person("Oliver", new ArrayList<>(Arrays.asList("Oskar", "Ann", "Adam")));

        List<Person> list = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        personWithMaxFriends(list);
    }

    private static void personWithMaxFriends(List<Person> list) {
        List<String> uniqFrends = list.stream()
                .flatMap(p -> p.getFriends().stream())
                .distinct()
                .toList();

        Map<String, List<String>> map = list.stream()
                .collect(HashMap::new, (m, p) -> {
                    for (String s : uniqFrends) {
                        if (p.getFriends().contains(s) && m.containsKey(s)) {
                            List<String> tmpName = m.get(s);
                            tmpName.add(p.getName());
                            m.put(s, tmpName);
                        } else if (p.getFriends().contains(s) && !m.containsKey(s)) {
                            List<String> tmpName = new ArrayList<>(Arrays.asList(p.getName()));
                            m.put(s, tmpName);
                        }
                    }
                }, HashMap::putAll);
        int x = map.entrySet().stream()
                .max(Comparator.comparing(m -> m.getValue().size()))
                .map(m -> m.getValue().size())
                .orElse(-1);

        map.entrySet().stream()
                .filter(m -> m.getValue().size() == x)
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.toMap(s -> s, n -> 1, Integer::sum))
                .entrySet().stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
