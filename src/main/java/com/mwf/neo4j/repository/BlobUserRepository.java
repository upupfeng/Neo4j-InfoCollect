package com.mwf.neo4j.repository;

import com.mwf.neo4j.pojo.BlobUser;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Date: 2019/4/5 16:14
 */
public interface BlobUserRepository extends Neo4jRepository<BlobUser,Long> {

    @Query(value = "match (n:BlobUser) where n.userId = {0} return count(n)")
    Integer countByUserId(String userId) ;

    @Query(value = "match (n:BlobUser) where n.userId = {0} return n limit 1")
    BlobUser findBlobUserByUserId(String userId);


}
