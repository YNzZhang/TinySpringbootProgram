package com.example.TinySpringbootProgram.service;

import com.example.TinySpringbootProgram.dao.Student;

public interface StudentService {
    public Student GetStudentById(long id);
}
/*
接口类和实现类是面向对象编程OOP（Object-Oriented Programming 对象指向编程）的一部分，他们是实现业务逻辑的组件
服务接口类定义了一组方法，这些方法声明了服务的操作，然后实现类实现了这些接口，提供了具体的业务逻辑
接口和实现类的分离有助于降低代码之间的耦合度，提高代码的可维护性和可测试性。
 */