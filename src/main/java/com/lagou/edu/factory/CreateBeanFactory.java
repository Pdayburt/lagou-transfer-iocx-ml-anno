package com.lagou.edu.factory;

import com.lagou.edu.utils.ConnectionUtils;

public class CreateBeanFactory {

    public static ConnectionUtils getConnectionUtils(){
        return new ConnectionUtils();
    }

    public  ConnectionUtils getInstance(){
        return new ConnectionUtils();
    }
}
