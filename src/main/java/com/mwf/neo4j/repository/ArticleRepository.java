package com.mwf.neo4j.repository;

import com.mwf.neo4j.pojo.Article;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @Date: 2019/4/6 14:17
 */
public interface ArticleRepository extends Neo4jRepository<Article,Long> {
    @Query(value = "match (n:Article) where n.baseId = {0} return count(n)")
    Integer countByBaseId(String baseId);

    @Query(value = "match (n:Article) where n.baseId = {0} return n limit 1")
    Article findArticleByBaseId(String baseId);
}
