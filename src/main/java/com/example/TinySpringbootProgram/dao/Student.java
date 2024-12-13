package com.example.TinySpringbootProgram.dao;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity //这是一个Jpa注解，也就是把这个类整个标记成了实体类，所以interface中不用注入就可以找到Student类。
@Table(name="student")//也是Jpa的一种注解，表示实体类和数据库中Table的映射关系。
public class Student { //定义了一个Student类，然后这个类可以映射到MySQL数据库中的一个名为student的Table
    @Id //表示这是这个table的主键
    @Column(name="id")
    @GeneratedValue(strategy = IDENTITY)
    //上面三个都是Jpa提供的注解，也是用于映射数据库中的Table
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="age")
    private int age;

    //在数据库中定义方法。
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
