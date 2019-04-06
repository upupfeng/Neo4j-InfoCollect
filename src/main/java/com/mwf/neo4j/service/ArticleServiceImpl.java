package com.mwf.neo4j.service;

import com.mwf.neo4j.pojo.Article;
import com.mwf.neo4j.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date: 2019/4/6 14:20
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository ;

    @Override
    public Boolean isExists(String baseId) {
        return articleRepository.countByBaseId(baseId) >= 1;
    }

    @Override
    public void addArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Article findArticleByBaseId(String baseId) {
        return articleRepository.findArticleByBaseId(baseId);
    }
}
