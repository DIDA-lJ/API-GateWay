package cn.bugstack.gateway.mapping;

import org.omg.CORBA.UNKNOWN;

/**
 * @author linqi
 * @description HTTP 调用方式指令
 */
public enum HttpCommandType {
    /**
     * 除了 Get、Post、Put、Delete 以外的 HTTP 请求方式，如 Head,Patch 等
     */
    UNKNOWN,
    /**
     * Get 请求
     */
    GET,
    /**
     * Post 请求
     */
    POST,
    /**
     * Put 请求
     */
    PUT,
    /**
     * Delete 请求
     */
    DELETE

}
