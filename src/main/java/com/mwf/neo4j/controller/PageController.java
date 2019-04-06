package com.mwf.neo4j.controller;

import com.mwf.neo4j.pojo.Page;
import com.mwf.neo4j.repository.PageRepository;
import com.mwf.neo4j.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/4/6 13:57
 */
@RestController
public class PageController {
    @Autowired
    private PageService pageService;

    @RequestMapping("/addPage")
    public String addPage(Page page){
        pageService.addPage(page);
        return "ok";
    }

    @RequestMapping("/findPageById")
    public Page findPageById(Integer pageId){
       return  pageService.findPageById(pageId);
    }
}
