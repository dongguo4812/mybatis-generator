package com.dongguo.entity;

import javax.persistence.*;

@Table(name = "t_user")
public class User {
    /**
     * 主键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 余额（无符号）
     */
    private Integer balance;

    /**
     * 获取主键
     *
     * @return user_id - 主键
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取余额（无符号）
     *
     * @return balance - 余额（无符号）
     */
    public Integer getBalance() {
        return balance;
    }

    /**
     * 设置余额（无符号）
     *
     * @param balance 余额（无符号）
     */
    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}