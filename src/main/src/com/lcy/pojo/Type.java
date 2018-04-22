package com.lcy.pojo;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import pojo.ActiveAndDisplayOrder;

import javax.persistence.*;
import java.util.Set;

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
    /**一对多那方:设置懒加载*/
    @OneToMany(mappedBy="parent",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OrderBy(value = "id ASC")/**指明加载OrderItem 时按id 的升序排序*/
    private Set<Type> types;
    @Column(name = "ParentId")
    private String parentId;
    /**级联刷新*/
    /**optional表示该对象可有可无，它的值为true表示该外键可以为null，它的值为false表示该外键为not null*/
    @ManyToOne(cascade=CascadeType.REFRESH,optional=false,fetch = FetchType.LAZY)
    /**指定外键列(这也表示为所在对象为“关系被维护端”)*/
    @JoinColumn(name = "parentId")
    private Type parent;

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
        return parentId;
    }

    public void setParentId(String parentId) {
        parentId = parentId;
    }

    public Set<Type> getTypes() {
        return types;
    }

    public void setTypes(Set<Type> types) {
        this.types = types;
    }

    public Type getParent() {
        return parent;
    }

    public void setParent(Type parent) {
        this.parent = parent;
    }
}
