package com.demo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson();
        // serialization and deserialization
        Person xiaoMing = new Person("xiao ming", 6);
        String xiaoMing_Json = gson.toJson(xiaoMing);

        System.out.println("java obj: " + xiaoMing.hashCode() + " ==> json: " + xiaoMing_Json);

        Person xiaoMing2 = gson.fromJson(xiaoMing_Json, Person.class);

        System.out.println("json: " + xiaoMing_Json + " ==> java obj: " + xiaoMing2.hashCode());

        // array

        ArrayList<Person> people = new ArrayList<>();

        people.add(xiaoMing );
        people.add(new Person("huahua", 30));
        String people_Json = gson.toJson(people);
        System.out.println("java list: " + people + " ==> json: " + people_Json);

        ArrayList<Person> people2 = gson.fromJson(people_Json, new TypeToken<ArrayList<Person>>(){}.getType() );

        System.out.println("json: " + people_Json + " ==> java list: " + people2);


        // map
        HashMap<String, Person> map = new HashMap<>();
        map.put("k1", xiaoMing);
        map.put("k2", new Person("huahua", 30));

        String mapJson = gson.toJson(map);
        System.out.println("map: " + map + " ==> json: " + mapJson);

    }
}
