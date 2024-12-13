package com.example.TinySpringbootProgram.service;

import com.example.TinySpringbootProgram.dao.Student;
import com.example.TinySpringbootProgram.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//Spring框架的一种注解，表示包含业务逻辑，只是Spring框架，这是一个bean，应该被注册为服务组件。这样Spring就可以管理这个类的生命周期并在需要时通过依赖注入将其注入到其他组件中。
//bean说的就是Spring框架管理的对象，Spring容器负责他们的生命周期，和组件（component）还是有区别的，区别在于，component是构成应用程序的基本组件，通过一些注解，可以在Spring框架中将组件注册为bean，bean是Spring管理的一个实例，可以实现依赖注入（也就是控制反转Ioc）等操作。
public class StudentServiceImpl implements StudentService { //因为加了implement也就是servic的实现类，所以，如果在service中定义一个方法，如果对应的impl类中没有这个方法，impl就会报错
    @Autowired //将Repository注入，表示可以使用Repository仓库接口了
    private StudentRepository studentRepository;//创建一个StudentRepository接口类 类型的变量studentRepository
    @Override//Override用于表示当前方法将要重写（Override）父类或者接口类中的方法
    //也就是说在Service接口类中定义了一个方法，然后我们直接直接在实现类中overide（重写）
    public Student GetStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(RuntimeException::new);//studentRepository继承了JpaRepository中的findById方法
        //我们在service的实现类中对studentRepository的方法进行了一个包装，包装成为了一个函数，这个函数接受long类型的id参数，然后去到Repository中对应的数据类，获得数据
    }
}
