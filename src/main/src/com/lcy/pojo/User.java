package com.lcy.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 用户表
 */
@Entity
@Table(name = "User")
public class User {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    /**
     * 用户名
     */
    @Column(unique = true,length = 50,name = "UserName")
    private String userName;
    /**
     * 密码
     */
    @Column(unique = true,length = 50,name = "Password")
    private String password;

}
