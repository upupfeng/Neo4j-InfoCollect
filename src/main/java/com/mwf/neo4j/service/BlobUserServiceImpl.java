package com.mwf.neo4j.service;

import com.mwf.neo4j.pojo.BlobUser;
import com.mwf.neo4j.repository.BlobUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date: 2019/4/5 16:17
 */
@Service
public class BlobUserServiceImpl implements BlobUserService {

    @Autowired
    private BlobUserRepository blobUserRepository;

    @Override
    public Boolean isExist(String userId) {
        return blobUserRepository.countByUserId(userId) >= 1 ;
    }

    @Override
    public void addUser(BlobUser blobUser) {
        blobUserRepository.save(blobUser);
    }

    @Override
    public BlobUser findBlobUserByUserId(String userId) {
        return blobUserRepository.findBlobUserByUserId(userId);
    }


}
