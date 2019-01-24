package com.jcohy.scis.repository;

import com.jcohy.scis.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface TeacherRepository  extends JpaRepository<Teacher,Integer> {

    Teacher findTeacherByNum(Long num);

    Teacher findTeacherByName(String name);
}
