package com.test.user.bean;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.InitContext;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/11/12.
 */
@Component
public class Dao {

    @Autowired
    private SqlSessionTemplate masterSqlSessionTemplate;

    public void hello(){
        System.out.println("hello");
    }

    public  int addUser(String userName,String passWord){
        Map u=new HashMap();
        u.put("userName",userName);
        u.put("passWord",passWord);
        u.put("gander",1);
        return masterSqlSessionTemplate.insert("com.mb2.dao.UserMapper.addUser",u);
    }
    
    public User getUserByName(String userName){
        return masterSqlSessionTemplate.selectOne("com.mb2.dao.UserMapper.getUserByName",userName);
    }

    public int updateUserCreateTime(int userId){
        return masterSqlSessionTemplate.update("com.mb2.dao.UserMapper.updateUserCreateTime",userId);
    }
    
}
