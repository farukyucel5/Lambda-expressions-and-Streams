package Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Streaming_Lambda {

    public static void main(String[] args) {

       // ArrayList<Integer> list_lambda=new ArrayList<>();
//
       // list_lambda.add(2);
       // list_lambda.add(3);
       // list_lambda.add(4);
       // list_lambda.add(5);
       // list_lambda.add(34);
       // list_lambda.add(25);
       // list_lambda.add(6);
//
       // System.out.println(list_lambda);
//
       // ArrayList<Integer>doubling=new ArrayList<>();
//
       // list_lambda.forEach(each->doubling.add(each*2));
//
       // System.out.println(doubling);
//
       // //map
//
       // List<Integer> lm=list_lambda.stream().map(p->p+2).toList();
//
       // System.out.println("The map list: "+lm);
//
       // //filter
//
       // List<Integer> lf1=list_lambda.stream().filter(p->p%2==0).toList();
//
       // System.out.println("The filter list: "+lf1);
//
       // List<Integer> lf2=list_lambda.stream().filter(p->p>5).toList();
//
       // System.out.println("The filter list2: "+lf2);
//
       // //reduce
//
       // Optional<Integer> summation=list_lambda.stream().reduce(Integer::sum);
       // System.out.println(summation.stream().toList());
//
       // List<Integer> summation1=list_lambda.stream().reduce(Integer::sum).stream().toList();
       // System.out.println(summation1);
///////////=======================================================================
        List<Integer> numbersX = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        Set<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> nonDuplicateNumbers = new ArrayList<>();

        for (Integer number : numbersX) {
            if (uniqueNumbers.add(number)) {
                nonDuplicateNumbers.add(number);
            }
        }

        System.out.println(nonDuplicateNumbers); // prints [1, 2, 3, 4, 5]

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3);

        List<Integer> distinctNumbers = numbers.stream().distinct().toList();

        System.out.println(distinctNumbers);

        //=======================================================================
        List<Integer> numbersMax = Arrays.asList(1, 3, 2, 5, 4);

        int maxNumber1 = Integer.MIN_VALUE;

        for (Integer number : numbers) {
            if (number > maxNumber1) {
                maxNumber1 = number;
            }
        }

        System.out.println("Max number: " + maxNumber1); // prints "Max number: 5"

        int maxNumber2 = numbers.stream().max(Integer::compare).orElseThrow();
        System.out.println(maxNumber2);

        int maxNumber3 = numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println(maxNumber3);
//===========================================================================================
        int min = numbers.stream().reduce(Integer.MAX_VALUE, Integer::min);

        System.out.println(min);


        int sum = numbers.stream().reduce(0, Integer::sum);

        //=================================================0000


        List<Integer> myList = Arrays.asList(1, 3, 2, 5, 4);

        int maxNumber = myList.stream().max(Integer::compare).orElseThrow();
        int minNumber = myList.stream().min(Integer::compare).orElseThrow();

        System.out.println("Max number: " + maxNumber); // prints "Max number: 5"
        System.out.println("Min number: " + minNumber); // prints "Min number: 1"


    //===============================================0

        List<String> stringList = Arrays.asList("apple", "banana", "orange", "pear", "fig", "grape");

        List<String> filteredList = new ArrayList<>();
        for (String s : stringList) {
            if (s.startsWith("f")) {
                filteredList.add(s);
            }
        }

        System.out.println("Filtered List: " + filteredList); // prints "Filtered List: [fig]"



        List<String> filteredList1 = stringList.stream().filter(s -> s.startsWith("f")).toList();


        System.out.println("Filtered List: " + filteredList1); // prints "Filtered List: [fig]"










    }

}
