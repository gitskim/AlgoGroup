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
	
	System.out.println(addNumbersFromTwoLinkedLists(list, newList));
	
    }

    public int addNumbersFromTwoLinkedLists(LinkedList one, LinkedList two) {
        if (one.isEmpty() && two.isEmpty()) {
            return -1;
        } else if (two.isEmpty()) {
            return Integer.parseInt(convertNumbersFromLinkedListToString(one));
        }
        if (one.isEmpty()) {
            return Integer.parseInt(convertNumbersFromLinkedListToString(two));
        } else {
            return Integer.parseInt(convertNumbersFromLinkedListToString(one)) +
                    Integer.parseInt(convertNumbersFromLinkedListToString(two));
        }
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
