package cn.bugstack.gateway.session;

import cn.bugstack.gateway.bind.IGenericReference;

/**
 * @author linqi
 * @version 1.0.0
 * @description
 */

public interface GatewaySession {

    Object get(String uri, Object parameter);

    IGenericReference getMapper(String uri);

    Configuration getConfiguration();
}
