package com.mwf.neo4j.service;

import com.mwf.neo4j.pojo.Page;
import com.mwf.neo4j.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date: 2019/4/6 13:56
 */
@Service
public class PageServiceImpl implements PageService{

    @Autowired
    private PageRepository pageRepository;

    @Override
    public void addPage(Page page) {
        pageRepository.save(page);
    }

    @Override
    public Page findPageById(Integer id) {
        return pageRepository.findPageById(id);
    }

}
