package guru.qa.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Contact> addressBook = (Map.of(
                "John Doe", new Contact("+79998887766"),
                "Jane Doe", new Contact("+79991112233")
        ));

        Set<String> keySet = addressBook.keySet();
        Collection<Contact> values = addressBook.values();
        Set<Map.Entry<String, Contact>> entries = addressBook.entrySet();
        for (Map.Entry<String, Contact> entry : entries) {
            entry.getKey();
            entry.getValue();
        }
    }
}
