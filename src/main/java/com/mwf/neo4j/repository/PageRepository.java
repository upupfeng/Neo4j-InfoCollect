package com.mwf.neo4j.repository;

import com.mwf.neo4j.pojo.Page;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Date: 2019/4/6 13:53
 */
public interface PageRepository extends Neo4jRepository<Page,Long> {

    @Query(value = "match (n:Page) where n.pageId = {0} return n limit 1")
    Page findPageById(Integer pageId);

}
