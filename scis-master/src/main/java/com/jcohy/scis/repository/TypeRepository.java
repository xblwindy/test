package com.jcohy.scis.repository;

import com.jcohy.scis.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface TypeRepository extends JpaRepository<Type,Integer> {

    List<Type> findByNum(Long num);
}
