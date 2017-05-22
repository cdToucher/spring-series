package me.codebase.jpa.entity;

import org.springframework.stereotype.Component;

/**
 * Created by chendong on 2017/5/19.
 */
@Component
public class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    private String id;

    private int age;

}
