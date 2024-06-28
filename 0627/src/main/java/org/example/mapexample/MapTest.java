package org.example.mapexample;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) {

        HashMap<String, Person> users = new HashMap<String, Person>();
        users.put("1", new Person("jung","myPassword","jj@naver.com","안녕"));
        users.put("2", new Person("Lee","1234","Lee@google.com","반가워"));
        users.put("3", new Person("Park","1111","Park@hanmail.net","좋은 아침"));

        Person p3 = users.get("3");
        System.out.println("id:" + p3.id);
        System.out.println("pw:" + p3.pw);

        for (String key : users.keySet()) {
            Person person = users.get(key);
            System.out.println("key:" + person.id + " pw:" + person.pw);
        }

    }
}


