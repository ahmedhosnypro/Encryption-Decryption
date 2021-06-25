import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void changeHeadsAndTails(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        String l1 = linkedList.getFirst();
        String l2 = linkedList.getLast();
        String a1 = arrayList.get(0);
        String a2 = arrayList.get(arrayList.size()-1);

        linkedList.set(0, a1);
        linkedList.set(linkedList.size()-1, a2);
        arrayList.set(0, l1);
        arrayList.set(arrayList.size()-1, l2);
    }
}