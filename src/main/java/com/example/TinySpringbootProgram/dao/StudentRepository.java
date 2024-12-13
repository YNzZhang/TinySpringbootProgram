package com.example.TinySpringbootProgram.dao;

import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {//写完类之后，在Repository里再写一个泛式，直接就写完了Jpa了
}//通过指定Student作为第一个泛型参数，你就告诉了Spring Data JPA这个接口是为了操作Student实体的
/*创建一个Repository接口，表示一个仓库Repository，用于访问student实体
public interface StudentRepository用于表示一个公共接口，这个接口继承了JpaRepository接口，这个接口是Spring JPA编程范式的一个核心接口，提供了很多CRDA操作的实现
其中，Student表示实体类，表示数据库中的一个表，Long表示实体类主键的数据类型。在这里，实体类主键类型被指定为Lone
当我们继承了JpaRepository类后，我们就不用自己编写这个Repository的实现类了，就可以直接在服务层注入并使用了。

 */