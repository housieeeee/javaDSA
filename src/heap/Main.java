package heap;

public class Main {
    public static void main(String[] args) {
        Heap myheap = new Heap();
        myheap.insert(99);
        myheap.insert(72);
        myheap.insert(61);
        myheap.insert(58);
        myheap.insert(69);

        System.out.println(myheap.getHeap());

        myheap.insert(100);
        System.out.println(myheap.getHeap());
    }
}
