package com.lagou.edu.service;

/**
 * @author 应癫
 */
public interface TransferService {

    void transfer(String fromCardNo,String toCardNo,Integer money) throws Exception;
}
