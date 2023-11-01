import task1.MyArrayList;
import task2.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("One");
        myLinkedList.add("Two");
        myLinkedList.add("Three");
        myLinkedList.add("Four");
        System.out.println(myLinkedList);
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));
        myLinkedList.remove(1);
        System.out.println("myLinkedList = " + myLinkedList.get(2));


        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("jeden");
        myArrayList.add("dwa");
        myArrayList.add("trzy");
        myArrayList.add("cztery");

        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(2) = " + myArrayList.get(2));

        System.out.println("myArrayList.remove(1) = " + myArrayList.remove(1));
        System.out.println("myArrayList.get(2) = " + myArrayList.get(2));

    }
}
