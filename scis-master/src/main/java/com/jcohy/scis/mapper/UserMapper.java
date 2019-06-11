package com.jcohy.scis.mapper;

import com.jcohy.scis.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select num,name,password,sex,birth,sclass,phone,major_id as majorId from student where num = #{num}")
    Student getStudentInfo(@Param("num") String num);

}
