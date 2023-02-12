package com.xinchan.test.pattern.proxy;

/**
 * @author xinchan
 * @version 1.0.1 2023-02-11
 */
public class UserDAOProxy implements UserDAO{
    private UserDAOImpl userDAOImpl;

    public UserDAOProxy(UserDAOImpl userDAOImpl) {
        this.userDAOImpl = userDAOImpl;
    }

    @Override
    public void save() {
        System.out.println("open transaction......");
        userDAOImpl.save();
        System.out.println("close transaction......");
    }

    public static void main(String[] args) {
        UserDAOImpl userDAOImpl = new UserDAOImpl();
        userDAOImpl.save();

        UserDAOProxy userDAOProxy = new UserDAOProxy(userDAOImpl);
        userDAOProxy.save();
    }
}
