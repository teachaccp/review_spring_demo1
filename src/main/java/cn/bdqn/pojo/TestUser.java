package cn.bdqn.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {


    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");


        User user= (User) ctx.getBean("user3");


        System.out.println(user.getUserName()+","+user.getPassword());

    }

}
