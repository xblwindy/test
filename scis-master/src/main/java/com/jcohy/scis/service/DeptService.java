package com.jcohy.scis.service;

import com.jcohy.scis.model.Dept;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface DeptService {

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<Dept> findAll(Pageable pageable);

    List<Dept> findAll();

    Dept findById(Integer id);

    Dept save(Dept dept) throws Exception;

    void delete(Integer id);

    List<Dept> findByName(String name);

    List<Dept> findByNum(Long num);
}
