package com.jcohy.scis.repository;

import com.jcohy.scis.model.Allot;
import com.jcohy.scis.model.Expert;
import com.jcohy.scis.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface AllotRepository extends JpaRepository<Allot,Integer>{

    List<Allot> findByExpert(Expert expert);

    List<Allot> findByProject(Project project);
}
