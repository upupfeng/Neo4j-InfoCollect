package com.mwf.neo4j.repository;

import com.mwf.neo4j.pojo.Visit;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Date: 2019/4/6 14:35
 */
public interface VisitRepository extends Neo4jRepository<Visit,Long> {

}
