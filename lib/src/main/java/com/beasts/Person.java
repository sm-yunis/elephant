package com.beasts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;

    @Column(nullable = true)
    private boolean otaku;

    public Person() {
    }

    public boolean isOtaku() {
        return otaku;
    }

    public void setOtaku(boolean otaku) {
        this.otaku = otaku;
    }

    public Person(String name, int age,boolean isOtaku) {
        this.name = name;
        this.age = age;
        this.otaku = isOtaku;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
