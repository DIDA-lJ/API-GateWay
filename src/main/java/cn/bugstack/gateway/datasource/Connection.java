package cn.bugstack.gateway.datasource;

/**
 * @author linqi
 * @version 1.0.0
 * @description 连接接口
 */

public interface Connection {

    Object execute(String method, String[] parameterTypes, String[] parameterNames, Object[] args);

}
