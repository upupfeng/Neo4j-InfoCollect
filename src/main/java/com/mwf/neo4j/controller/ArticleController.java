package com.mwf.neo4j.controller;

import com.mwf.neo4j.pojo.Article;
import com.mwf.neo4j.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/4/6 14:21
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService ;

    @RequestMapping("/addArticle")
    public String addArticle(Article article){
        articleService.addArticle(article);
        return "ok";
    }

    @RequestMapping("isArtEx")
    public Boolean isArtEx(String baseId){
        return articleService.isExists(baseId);
    }


}


