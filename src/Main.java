import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        example();
    }

    public static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                if (i % 2 != 0 && j % 2 != 0) {
                    biDemArrList.get(i).add(j, "◯");
                }else if (i % 2 != 0 && j % 2 == 0){
                    biDemArrList.get(i).add(j, "●");
                } else if (i % 2 == 0 && j % 2 != 0) {
                    biDemArrList.get(i).add(j, "●");
                } else {
                    biDemArrList.get(i).add(j, "◯");
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                while (j < 8) {
                    System.out.print(biDemArrList.get(i).get(j) + " ");
                    j++;
                }
                System.out.println();
            }
        }
    }
}