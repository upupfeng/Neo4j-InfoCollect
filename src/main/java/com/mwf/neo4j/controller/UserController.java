package com.mwf.neo4j.controller;

import com.mwf.neo4j.pojo.BlobUser;
import com.mwf.neo4j.service.BlobUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/4/6 13:42
 */
@RestController
public class UserController {
    @Autowired
    private BlobUserService blobUserService;

    @RequestMapping("isEx")
    public Boolean isEx(String userId){
        return blobUserService.isExist(userId);
    }

    @RequestMapping("/findUserById")
    public BlobUser findUserById(String userId){
        return blobUserService.findBlobUserByUserId(userId);
    }

}
