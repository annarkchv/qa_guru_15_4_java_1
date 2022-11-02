package guru.qa;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> listElements = (List.of("1", "2", "3"));

        // Для листов обычно используется for each
        for (String listElement : listElements) {
            System.out.println("List element: " + listElement);
        }

        // For i
        for (int i = 0; i < listElements.size(); i++) {
            System.out.println("List element: " + listElements.get(i));
        }
    }
}
