/**
 * Copyright (C), 2015-2018, XXX有限公司
 * <p>
 * FileName: User
 * <p>
 * Author:   cjs
 * <p>
 * Date:     2018/11/27 19:26
 * <p>
 * Description: cjs
 * <p>
 * History:
 *
 * <author>          <time>          <version>          <desc>
 * <p>
 * 作者姓名           修改时间           版本号              描述
 */


package com.juneto.model;


import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈cjs〉
 *
 * @author cjs

 * @create 2018/11/27

 * @since 1.0.0

 */

public class User {

    private long id;
    private String email;
    private String password;
    private String username;
    private String role;
    private int status;
    private Date regTime;
    private String regIp;

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }



}