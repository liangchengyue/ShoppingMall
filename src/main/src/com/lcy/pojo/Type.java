package com.lcy.pojo;

import org.hibernate.annotations.GenericGenerator;
import pojo.ActiveAndDisplayOrder;

import javax.persistence.*;

/**
 * 类型、字典
 */
@Entity
@Table(name = "Type")
public class Type extends ActiveAndDisplayOrder {
    /**
     * 类型id
     */
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "Id")
    private String id;
    /**
     * 类型名称
     */
    @Column(name = "Name",length = 50,nullable = true)
    private String name;
    /**
     * 是否是叶子
     */
    @Column(name = "IsLeaf")
    private boolean isLeaf;
    private String ParentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String parentId) {
        ParentId = parentId;
    }
}
