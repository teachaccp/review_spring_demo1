package cn.bdqn.service;

import cn.bdqn.dao.UserDao;
import cn.bdqn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User login(String userName, String passwrod) {

        User login = userDao.login(userName, passwrod);

        return login;
    }
}
