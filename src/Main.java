//import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        HashMap<String, Integer> map1 = new HashMap<>();
//        HashMap<String,Integer> map2 = new HashMap<>();
//
//        map1.put("value",11);
//        map2 = map1;
//
//        System.out.println(map1+""+map2);

        LinkedList myLinkedList = new LinkedList(3);
        myLinkedList.append(2);
        myLinkedList.append(23);
        myLinkedList.append(7);

        myLinkedList.set(1,4);

        myLinkedList.remove(2);

        myLinkedList.reverse();

        myLinkedList.insert(1,7);
        myLinkedList.prepend(1);


        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.get(2) + "\n");
        myLinkedList.printList();

    }
}

//LL - DLL - S&Q - Trees - Hash tables - Graphs - Heaps - Recursion - Tree Traversal - Basic Sorts - Merge Sort - Quick Sort - DP