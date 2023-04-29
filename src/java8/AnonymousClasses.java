package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.Math.max;

@FunctionalInterface
interface ComparingTheNumbers {
    void comparing(int a, int b);

    static void yaz() {
        System.out.println("yazdım");
    }

    default void reading() {
        System.out.println("reading");
    }
}

@FunctionalInterface
interface Summing{
    void summingTheNumbers(int num1,int num2);
}
@FunctionalInterface
interface SortingList {
    void sorting(List<Integer> products);
}


public class AnonymousClasses{

    static Boolean checkAge(int age){
        return age > 17;
    }


    public static void main(String[] args) {

        Summing summing=new Summing() {
            @Override
            public void summingTheNumbers(int num1, int num2) {
                System.out.println(num1+num2);
            }
        };

        summing.summingTheNumbers(2,56);
       ComparingTheNumbers cmp=new ComparingTheNumbers() {
           @Override
           public void comparing(int a, int b) {
               int maxNumber = max(a, b);
               System.out.println(maxNumber);
           }
       };
       List<Integer> elements=new ArrayList<>();
       elements.add(8);
       elements.add(3);
       elements.add(4);
       SortingList srt= new SortingList() {
           @Override
           public void sorting(List<Integer> products) {
               Collections.sort(elements);
           }
       };
       srt.sorting(elements);
       cmp.comparing(7,8);
       System.out.println(elements);

        Function<Integer,Integer> sum=new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };

        System.out.println(sum.apply(9));

        Consumer<String> talk=new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello I am "+name);
            }
        };

        talk.accept("Faruk");

       Predicate<Integer> isTrue=new Predicate<Integer>() {
           @Override
           public boolean test(Integer integer) {
               return integer>10;
           }
       };
        System.out.println(isTrue.test(20));

        Predicate<Integer> isTrue2=AnonymousClasses::checkAge;
        System.out.println(isTrue2.test(30));

        Predicate<Integer> isTrue1=each->each>18;

        System.out.println(isTrue1.test(16));

    }



}
