package com.mwf.neo4j.service;


import com.mwf.neo4j.pojo.BlobUser;

/**
 * @Date: 2019/4/5 16:17
 */
public interface BlobUserService {

    Boolean isExist(String userId);

    void addUser(BlobUser blobUser);

    BlobUser findBlobUserByUserId(String userId);

}
