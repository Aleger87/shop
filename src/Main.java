import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> persons = new LinkedList<>();
        persons.add("Люба");
        persons.add("Семен");
        persons.add("Степан");
        persons.add("Федор");
        persons.add("Лиза");
        persons.add("Галя");
        persons.add("Владимир");
        persons.add("Дмитрий");
        persons.add("Михаил");
        persons.add("Михаил");
;
        Shop.addPerson(persons);
    }
}