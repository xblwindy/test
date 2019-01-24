package com.jcohy.scis.repository;

import com.jcohy.scis.model.Circular;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface CircularRepository extends JpaRepository<Circular,Integer> {


    /**
     * 查询所有可见
     * @param visible
     * @return
     */
    List<Circular> findAllByVisible(int visible);
}
