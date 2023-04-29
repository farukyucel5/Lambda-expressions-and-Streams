package Lambda_Stream_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class New_features {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Harun"));
        users.add(new User(2,"Ahmet"));
        users.add(new User(3,"Ayşe"));
        users.add(new User(4,"Murat"));
        users.add(new User(5,"Faruk"));
        users.add(new User(6,"ismail"));
        users.add(new User(7,"Ayşegül"));
        users.add(new User(8,"Nahide"));
        users.add(new User(9,"Şüheda"));
        users.add(new User(10,"Elif"));
        users.add(new User(11,"Azra"));


        //users.stream().forEach(user -> user.talk());
        users.forEach(User::talk);//method reference

        List<User> filteredList = users.stream().filter(user -> user.id>5)
                .collect(Collectors.toList());
        System.out.println("========Filtered list========");
        filteredList.forEach(User::talk);

        List<User> mappedList = users.stream()
                .map(user -> new User(user.id+100,user.name))
                .collect(Collectors.toList());
        mappedList.forEach(user -> System.out.println(user.toString()));

        System.out.println("==============================================");

        Map<Integer, String> userMap = users.stream().collect(Collectors
                .toMap(user -> user.id, user -> user.name));

        System.out.println(userMap);

        System.out.println("==================================================");

        userMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }


}
