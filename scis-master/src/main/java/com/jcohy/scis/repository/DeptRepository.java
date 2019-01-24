package com.jcohy.scis.repository;

import com.jcohy.scis.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xbl on 2018/5/26.
         * Description  :
         */
public interface DeptRepository  extends JpaRepository<Dept,Integer> {

    List<Dept> findByName(String name);

    List<Dept> findByNum(Long num);
}
