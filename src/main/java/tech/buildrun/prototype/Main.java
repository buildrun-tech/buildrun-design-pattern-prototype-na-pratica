package tech.buildrun.prototype;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        var user1 = new User();
        user1.setId(UUID.randomUUID());
        user1.setEmail("bruno@email.com");
        user1.setPassword("123456");
        user1.setUsername("myUsername");

        var userClone = user1.clone();


        System.out.println(user1);
        System.out.println(userClone);



    }
}
