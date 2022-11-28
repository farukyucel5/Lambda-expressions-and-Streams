package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streaming_Lambda {

    public static void main(String[] args) {

        ArrayList<Integer> list_lambda=new ArrayList<>();

        list_lambda.add(2);
        list_lambda.add(3);
        list_lambda.add(4);
        list_lambda.add(5);
        list_lambda.add(34);
        list_lambda.add(25);
        list_lambda.add(6);

        System.out.println(list_lambda);

        ArrayList<Integer>doubling=new ArrayList<>();

        list_lambda.forEach(each->doubling.add(each*2));

        System.out.println(doubling);

        //map

        List<Integer> lm=list_lambda.stream().map(p->p+2).collect(Collectors.toList());

        System.out.println("The map list: "+lm);

        //filter

        List<Integer> lf1=list_lambda.stream().filter(p->p%2==0).collect(Collectors.toList());

        System.out.println("The filter list: "+lf1);

        List<Integer> lf2=list_lambda.stream().filter(p->p>5).collect(Collectors.toList());

        System.out.println("The filter list2: "+lf2);

        //reduce

        Optional<Integer> sumation=list_lambda.stream().reduce((p1, p2)->p1+p2);

        System.out.println(sumation);


    }

}
