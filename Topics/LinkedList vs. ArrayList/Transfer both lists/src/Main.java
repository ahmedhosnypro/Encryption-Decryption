import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

class ListOperations {
    public static void transferAllElements(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            String l = linkedList.get(i);
            String a = arrayList.get(i);
            arrayList.set(i, l);
            linkedList.set(i, a);
        }
    }
}
