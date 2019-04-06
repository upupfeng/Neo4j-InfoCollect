package com.mwf.neo4j.pojo;

import org.neo4j.ogm.annotation.*;

import java.util.Date;

/**
 * @Date: 2019/4/6 15:02
 */
@RelationshipEntity
public class View {

    @Id@GeneratedValue
    private Long nodeId ;

    @StartNode
    private BlobUser blobUser;

    @EndNode
    private Base base ;

    @Property(value = "created_time")
    private Date date;

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

    public View(BlobUser blobUser, Base base, Date date) {
        this.blobUser = blobUser;
        this.base = base;
        this.date = date;
    }

    public View() {
    }

    public Base getBase() {
        return base;

    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
