package com.gson;

import com.bean.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloJson {

    @Test
    public void test1() {
        Person person = new Person(1, 18, "小明", 'M');
        //创建Gson对象实例
        Gson gson = new Gson();
        String personJSONStr = gson.toJson(person);
//        System.out.println(personJSONStr);
        Person p = gson.fromJson(personJSONStr, Person.class);
        System.out.println(p);
    }

    //    1.2.2、List 和json 的互转
    @Test
    public void test2() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, 18, "小明", 'M'));
        personList.add(new Person(2, 19, "小红", 'F'));
        Gson gson = new Gson();
        // 把List 转换为json 字符串
        String personListJsonString = gson.toJson(personList);
        System.out.println(personListJsonString);
        List<Person> list = gson.fromJson(personListJsonString, new TypeToken<List<Person>>() {
        }.getType());
        System.out.println(list);
        Person person = list.get(0);
        System.out.println(person);
    }

    @Test
    public void test3() {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person(1, 18, "小明", 'M'));
        personMap.put(2, new Person(2, 19, "小红", 'F'));
        Gson gson = new Gson();
        // 把 map 集合转换成为 json 字符串
        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);
        Map<Integer, Person> personMap2 = gson.fromJson(personMapJsonString, new
                TypeToken<HashMap<Integer, Person>>() {
                }.getType());
        System.out.println(personMap2);
        Person p = personMap2.get(1);
        System.out.println(p);
    }
}
