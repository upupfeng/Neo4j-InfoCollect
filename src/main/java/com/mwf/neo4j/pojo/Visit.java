package com.mwf.neo4j.pojo;

import org.neo4j.ogm.annotation.*;

import java.util.Date;

/**
 * @Date: 2019/4/6 14:31
 */
@RelationshipEntity(type = "VISIT")
public class Visit {

    @Id@GeneratedValue
    private Long nodeId ;

    @Property
    private Date created_time ;

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    @StartNode
    private BlobUser blobUser;

    @EndNode
    private Page page ;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public BlobUser getBlobUser() {
        return blobUser;
    }

    public void setBlobUser(BlobUser blobUser) {
        this.blobUser = blobUser;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Visit(Date created_time, BlobUser blobUser, Page page) {
        this.created_time = created_time;
        this.blobUser = blobUser;
        this.page = page;
    }

    public Visit() {
    }
}
