package com.lagou.edu.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component("transactionManager")
public class TransactionManager {
//    private TransactionManager(){}
    @Autowired
    private ConnectionUtils connectionUtils;


    public  void beginTransaction() throws SQLException {
//        ConnectionUtils.getCurrentThreadConn().setAutoCommit(false);
        connectionUtils.getCurrentThreadConn().setAutoCommit(false);
    }
    public  void commit() throws SQLException {
//        ConnectionUtils.getCurrentThreadConn().commit();
        connectionUtils.getCurrentThreadConn().commit();
    }
    public  void rollback() throws SQLException {
//        ConnectionUtils.getCurrentThreadConn().rollback();
        connectionUtils.getCurrentThreadConn().rollback();
    }
}
