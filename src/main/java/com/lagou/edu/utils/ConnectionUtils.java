package com.lagou.edu.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
@Component("connectionUtils")
public class ConnectionUtils {

    @Autowired
    private DataSource dataSource;

    private static ThreadLocal<Connection> connectionThreadLocal;
    public  Connection getCurrentThreadConn() throws SQLException {

        if (connectionThreadLocal == null) {
            synchronized (ConnectionUtils.class){
                if (connectionThreadLocal == null) {
                    connectionThreadLocal = new ThreadLocal<>();
                    connectionThreadLocal.set(dataSource.getConnection());
                }
            }
        }
        return connectionThreadLocal.get();
    }


}
