package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "TEST")
public class Test {
    public Test(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Test() {

    }



    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
