package com.xinchan.test.pattern.proxy;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class UserDAOImpl implements UserDAO{
    @Override
    public void save() {
        System.out.println("save() running......");
    }
}
