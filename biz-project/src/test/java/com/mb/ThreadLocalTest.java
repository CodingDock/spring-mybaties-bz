package com.mb;

/**
 * Created by Administrator on 2017/2/17.
 */
public class ThreadLocalTest {

    private ThreadLocal<String> tl=new ThreadLocal();
    
    
    public void set(int i){
        tl.set(i+"");
        
    }
    
    public String get(){
        return tl.get();
    }

    public static void main(String[] args) {

        ThreadLocalTest tt=new ThreadLocalTest();
        tt.set(1);
        tt.set(2);
        tt.set(3);
        tt.set(4);
        Thread t=Thread.currentThread();
        System.out.println(tt.get());
        
    }
}
