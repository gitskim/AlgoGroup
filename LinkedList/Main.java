/**
 * Created by kimsuh on 5/30/16.
 */
public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList(0);
        list.addToHead(1);
        list.addToHead(2);

        list.printList();

        LinkedList newList;
        newList = list.reverseList();
        newList.printList();

    }

    public String convertNumbersFromLinkedListToString(LinkedList list) {
        StringBuilder stringBuilder = new StringBuilder();
        while (!list.isEmpty()) {
            stringBuilder.append(list.getDataFromHead());
            list.getNextToHead();
        }

        return stringBuilder.toString();
    }
}
