
import java.util.*;

public class Shop {
    private static int COUNT = 5;


    private static Queue<String> checkout1 = new LinkedList<>();
    private static Queue<String> checkout2 = new LinkedList<>();

    public static void addPerson (LinkedList<String> persons) {
        if (persons.size() <= COUNT && checkout1.size() == 0) {
            checkout1.addAll(persons);
        } else if (persons.size() > 10) {
            galua();
        }else {

            for (String person : persons) {
                System.out.println(persons.size());
                while (checkout1.size() < COUNT) {
                    int size = new Random().nextInt(persons.size());
                    checkout1.add(persons.get(size));
                   removePerson(persons, persons.get(size));
                }
                System.out.println(checkout1);
                System.out.println(persons.size());
                while (checkout2.size() < COUNT && persons.size() != 0){
                    int size = new Random().nextInt(persons.size());
                    checkout2.add(persons.get(size));
                    removePerson(persons, persons.get(size));
                }
                System.out.println(checkout2);
            }
        }

    }

    private static void removePerson(LinkedList<String> persons, String s) {
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).equals(s)) {
                persons.remove(i);
            }
        }
    }


    private static void galua () {
        System.out.println("Позовите Галю");
    }
}
