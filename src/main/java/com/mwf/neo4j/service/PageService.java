package com.mwf.neo4j.service;

import com.mwf.neo4j.pojo.Page;

/**
 * @Date: 2019/4/6 13:55
 */
public interface PageService {
    void addPage(Page page);

    Page findPageById(Integer id);

}
