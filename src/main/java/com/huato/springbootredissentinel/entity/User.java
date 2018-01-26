package com.huato.springbootredissentinel.entity;


import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String age;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
