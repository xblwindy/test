package com.jcohy.scis.service;

import com.jcohy.scis.model.Allot;
import com.jcohy.scis.model.Dept;
import com.jcohy.scis.model.Major;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface MajorService {

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<Major> findAll(Pageable pageable);

    List<Major> findAll();

    Major findById(Integer id);

    List<Major> findByDept(Dept dept);

    Major save(Major dept) throws Exception;

    void delete(Integer id);

    List<Major> findByName(String name);

    List<Major> findByNum(Long num);
}
