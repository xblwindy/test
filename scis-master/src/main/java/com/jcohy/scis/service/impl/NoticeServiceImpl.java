package com.jcohy.scis.service.impl;

import com.jcohy.scis.model.Notice;
import com.jcohy.scis.repository.NoticeRepository;
import com.jcohy.scis.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    private NoticeRepository noticeRepository;

    @Override
    public Page<Notice> findAll(Pageable pageable) {
        return noticeRepository.findAll(pageable);
    }

    @Override
    public List<Notice> findAll() {
        return noticeRepository.findAll();
    }

    @Override
    public Notice save(Notice notice) {
        return noticeRepository.save(notice);
    }

    @Override
    public void delete(Integer id) {
        noticeRepository.deleteById(id);
    }

    @Override
    public List<Notice> findbyNum(Long num) {
        return noticeRepository.findByStudentNum(num);
    }

    @Override
    public List<Notice> findByLevel(Integer level) {
        return noticeRepository.findByLevelBetween(level,level+1);
    }
}
