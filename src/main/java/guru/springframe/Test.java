package guru.springframe;

import guru.springframe.model.User;

public class Test {
    public static void main(String[] args) {
        User u = User.builder().firstName("Mike").lastName("Joden").email("m.j@gmail.com").build();
        System.out.println(u.toString());
    }
}
