package com.jcohy.scis.repository;

import com.jcohy.scis.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public interface BookRepository extends JpaRepository<Book,Integer> {
}
