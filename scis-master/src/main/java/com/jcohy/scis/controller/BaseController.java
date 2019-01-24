package com.jcohy.scis.controller;

import com.jcohy.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xbl on 2018/5/26.
 * Description  :
 */
public class BaseController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HttpServletResponse response;

    protected PageRequest getPageRequest(){
        Integer pageNumber = 0;
        String pageNumberStr = request.getParameter("page");
        System.out.println(pageNumberStr);
        if(!StringUtils.isBlank(pageNumberStr)){
            pageNumber = Integer.parseInt(pageNumberStr)-1;
        }
        Integer pageSize = 10;
        String pageSizeStr = request.getParameter("limit");
        if(!StringUtils.isBlank(pageSizeStr)){
            pageSize = Integer.parseInt(pageSizeStr);
        }

        return new PageRequest(pageNumber, pageSize);
    }
}
