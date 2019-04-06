package com.mwf.neo4j.pojo;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * Page
 * 1.首页  2.博客  3.问答  4. 搜索  5.活动
 * @Date: 2019/4/6 13:49
 */
@NodeEntity(label = "Page")
public class Page {

    @Id@GeneratedValue
    private Long nodeId ;

    @Property
    private Integer pageId;

    @Property
    private String pageName ;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
}
