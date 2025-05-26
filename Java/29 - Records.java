import java.util.*;
import java.util.stream.*;

record Person(String name, int age) {}

class Records{
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 17),
            new Person("Charlie", 25)
        );
        for (Person p : people) {
            System.out.println(p);
        }
        List<Person> adults = people.stream().filter(p -> p.age() >= 18).collect(Collectors.toList());
        for (Person p : adults) {
            System.out.println(p.name());
        }
    }
}
