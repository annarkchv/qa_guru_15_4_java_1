package guru.qa;

import java.util.Set;

public class SetExample {

    // Set - это набор уникальных элементов
    public static void main(String[] args) {
        Set<String> setElements = (Set.of("1", "2", "3"));

        // set не поддерживает работу с индексами. Есть несколько случаев, когда поддерживает, но пока не рассматриваем
        for (String setElement : setElements) {
            System.out.println("Set element: " + setElement);
        }
    }
}
