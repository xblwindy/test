package com.jcohy.scis.repository;

import com.jcohy.scis.model.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface ExpertsRepository extends JpaRepository<Expert,Integer> {

    Expert findByNum(Long num);

    Expert findByName(String name);
}
