package com.mwf.neo4j.pojo;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @Date: 2019/4/6 14:11
 */
@NodeEntity(label = "Article")
public class Article extends Base{

    @Id@GeneratedValue
    private Long nodeId ;

    public Article(Integer typeId, String typeName, String baseId, String title) {
        super(typeId, typeName, baseId, title);
    }

    public Article() {
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }
}

