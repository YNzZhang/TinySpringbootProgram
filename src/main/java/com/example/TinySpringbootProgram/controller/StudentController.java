package com.example.TinySpringbootProgram.controller;

import com.example.TinySpringbootProgram.dao.Student;
import com.example.TinySpringbootProgram.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //这是Spring框架的一个注解，用于定义RESTful web服务的控制器类
public class StudentController {
    @Autowired //注入这个service的接口类，我们就能用service中的方法了，使用@Autowired和直接import还有点区别，概括来说就是@Autowired更高级
    private StudentService studentService;//注意：此时是私有的，注入后只能在这个类中进行使用。
    @GetMapping("/student/{id}")//接受到http传来的参数，里面包括id参数，使用这个id参数，运行我们定义的方法。
    public Student getStudentById(@PathVariable long id){ //@PathVariable注解的意思是对应一个路径变量id
        return studentService.GetStudentById(id);//通过上面的依赖注入@Autowired，编译器在编译的时候就会把这两个类都编译进Bean中，这样我们就在Controller中可以使用Studentservice中的方法了。
    }
}
