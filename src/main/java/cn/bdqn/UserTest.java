package cn.bdqn;

import cn.bdqn.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    public static void main(String[] args) {

        ApplicationContext ctx=new
                ClassPathXmlApplicationContext("applicationContext-service.xml");

        UserService userService = (UserService) ctx.getBean("userService");

        userService.login("123","123");

    }
}
