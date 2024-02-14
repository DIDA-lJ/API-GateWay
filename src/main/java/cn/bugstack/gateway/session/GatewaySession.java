package cn.bugstack.gateway.session;

import cn.bugstack.gateway.bind.IGenericReference;

import java.util.Map;

/**
 * @author linqi
 * @version 1.0.0
 * @description 用户处理网关 HTTP 请求
 */

public interface GatewaySession {

    Object get(String methodName, Map<String, Object> params);

    Object post(String methodName, Map<String, Object> params);

    IGenericReference getMapper();

    Configuration getConfiguration();
}
