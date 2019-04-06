package com.mwf.neo4j.controller;

import com.mwf.neo4j.pojo.*;
import com.mwf.neo4j.repository.ViewRepository;
import com.mwf.neo4j.repository.VisitRepository;
import com.mwf.neo4j.service.ArticleService;
import com.mwf.neo4j.service.BlobUserService;
import com.mwf.neo4j.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Date: 2019/4/6 12:19
 */
@RestController
public class TestController {

    @Autowired
    private PageService pageService;

    @Autowired
    private BlobUserService blobUserService;

    @Autowired
    private ArticleService articleService;
    @Autowired
    private VisitRepository visitRepository;
    @Autowired
    private ViewRepository viewRepository;


    @RequestMapping("/add")
    public String add(BlobUser user){
        blobUserService.addUser(user);

        return "";
    }


    @RequestMapping("visit")
    public String visit(Integer pageId ,String pageName , String userId , String username){

        BlobUser user = blobUserService.isExist(userId) ? blobUserService.findBlobUserByUserId(userId) : new BlobUser(userId,username);
        Page page = pageService.findPageById(pageId);
        visitRepository.save(new Visit(new Date(),user,page));
        return "visit success";
    }

    //view?baseId=1&title=a&typeName=1&typeId=1&userId=888&username=mwf
    @RequestMapping("view")
    public String view(String baseId ,String title ,String typeName, Integer typeId,String userId ,String userName){
        if(!blobUserService.isExist(userId)) blobUserService.addUser(new BlobUser(userId,userName));
        if(!articleService.isExists(baseId)) articleService.addArticle(new Article(typeId,typeName,baseId,title));

        viewRepository.save(new View(blobUserService.findBlobUserByUserId(userId),articleService.findArticleByBaseId(baseId),new Date()));

        return "view success";
    }





}

