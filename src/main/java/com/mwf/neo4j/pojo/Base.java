package com.mwf.neo4j.pojo;


import org.neo4j.ogm.annotation.Property;

/**
 * @Date: 2019/4/6 14:04
 */

public class Base {

    @Property(value = "typeId")
    private Integer typeId ;

    @Property(value = "typeName")
    private String typeName ;

    @Property(value = "baseId")
    private String baseId ;

    @Property(value = "title")
    private String title;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getBaseId() {
        return baseId;
    }

    public void setBaseId(String baseId) {
        this.baseId = baseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Base(Integer typeId, String typeName, String baseId, String title) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.baseId = baseId;
        this.title = title;
    }

    public Base() {
    }
}
