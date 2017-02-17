package com.test.user.bean;

import com.ApolloException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/2/16.
 */
@Service
public class UserServiceImpl implements UserService{
    
    
    @Autowired
    Dao dao;
    
    
    @Override
    @Transactional(rollbackFor= ApolloException.class)
    public int addUser(String userName, String passWord) {
        User u=dao.getUserByName(userName);
        if (u !=null) {
            System.out.println("exist user!!--");
            return dao.updateUserCreateTime(u.getId());
        }else{
            System.out.println("add new user!!--");
            return dao.addUser(userName,passWord);
        }
    }
    
}
