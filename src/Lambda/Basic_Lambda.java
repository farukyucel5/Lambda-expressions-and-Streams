package Lambda;


import java.util.ArrayList;

@FunctionalInterface
interface Lmd1{
    void yaz();
}
@FunctionalInterface
interface Lmd2{
    void yaz(String s);

}

interface Lmd3 {
    int sum(int a,int b);
}

public class Basic_Lambda {

    public static void main(String[] args) {

        Lmd1 l1=()-> System.out.println("welcome lambda");
        l1.yaz();

        Lmd2 l2=(s)-> System.out.println("Welcome  "+s);
        l2.yaz("Faruk");

        Lmd3 l3=(a,b)->a+b;
        System.out.println("The result: "+l3.sum(8,34));


        ArrayList<Integer> list_lambda=new ArrayList<>();

        list_lambda.add(2);
        list_lambda.add(3);
        list_lambda.add(4);
        list_lambda.add(5);

        list_lambda.forEach(each-> System.out.println(each));

        System.out.println("===========================");

        ArrayList<Integer>doubling=new ArrayList<>();

        list_lambda.forEach(each->doubling.add(each*2));

        System.out.println(doubling);


    }


}
