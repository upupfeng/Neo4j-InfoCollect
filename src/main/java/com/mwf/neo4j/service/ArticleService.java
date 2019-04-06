package com.mwf.neo4j.service;

import com.mwf.neo4j.pojo.Article;

/**
 * @Date: 2019/4/6 14:19
 */
public interface ArticleService {

    Boolean isExists(String baseId);

    void addArticle(Article article);

    Article findArticleByBaseId(String baseId);

}
