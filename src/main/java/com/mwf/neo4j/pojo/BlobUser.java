package com.mwf.neo4j.pojo;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * @Date: 2019/4/6 12:11
 */
@NodeEntity(label = "BlobUser")
public class BlobUser {

    @Id
    @GeneratedValue
    private Long nodeId ;

    @Property
    private String userId ;

    @Property(value = "username")
    private String username;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BlobUser(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public BlobUser(){}
}
