package Lambda_Stream_package.SORU2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {
    static void addList(List<Integer> list){
        // Return sum of list values
        int result = list.stream().mapToInt(x-> x*x).sum();
        System.out.println("Sum of list values: "+result);
    }
    public static void main(String[] args) {
        // Creating a list and adding values
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Referring method to String type Consumer interface
        Consumer<List<Integer>> consumer = ConsumerInterfaceExample::addList;
        consumer.accept(list);  // Calling Consumer method



    }
}
