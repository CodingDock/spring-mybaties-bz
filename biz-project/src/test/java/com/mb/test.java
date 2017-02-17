package com.mb;

import com.test.user.bean.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/11/30.
 */
public class test extends AbstractTest{

    @Autowired
    UserService userService;
    
    @Test
    public void ss(){
        int a=userService.addUser("李四","aaa");
        System.out.println(a);
    }

    public static void main(String[] args) {
        
        
        
        
        
    }
    
    
}
