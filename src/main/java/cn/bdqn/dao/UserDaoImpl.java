package cn.bdqn.dao;

import cn.bdqn.pojo.User;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public User login(String userName, String password) {

        System.out.println("调用登录方法！");

        return null;
    }
}
