package cn.bdqn.dao;

import cn.bdqn.pojo.User;

public interface UserDao {

    User login(String userName, String password);
}
