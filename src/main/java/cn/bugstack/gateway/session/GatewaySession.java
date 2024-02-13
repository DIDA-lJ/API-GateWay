package cn.bugstack.gateway.session;

import cn.bugstack.gateway.bind.IGenericReference;

/**
 * @author linqi
 * @version 1.0.0
 * @description 用户处理网关 HTTP 请求
 */

public interface GatewaySession {

    Object get(String methodName, Object parameter);

    IGenericReference getMapper();

    Configuration getConfiguration();

}
