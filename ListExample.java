import java.util.*;
import java.io.*;

public class ListExample {

    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");

        linkedList.add("Car");
        linkedList.add("Bike");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.remove("Banana");
        linkedList.remove(1);

        System.out.println("\nAfter removing");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        
        FileWriter positive = new FileWriter("Positive.txt");
        FileWriter negative = new FileWriter("Negative.txt");

        positive.write("Positive Example Data\n");
        negative.write("Negative Example Data\n");

        positive.close();
        negative.close();

        System.out.println("\nData written to files successfully");
    }
}
