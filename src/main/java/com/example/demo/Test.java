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

    public static final String SEQ_NAME ="TEST_SEQ";

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, allocationSize = 1, sequenceName = SEQ_NAME)
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
