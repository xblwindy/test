package com.jcohy.scis.repository;

import com.jcohy.scis.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface StudentRepository  extends JpaRepository<Student,Integer> {

    Student findAdminByNum(Long num);

    Student findAdminByName(String name);


}
