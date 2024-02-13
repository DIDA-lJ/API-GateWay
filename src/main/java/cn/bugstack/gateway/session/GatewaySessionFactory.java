package cn.bugstack.gateway.session;

/**
 * @author linqi
 * @version 1.0.0
 * @description 网关会话工厂接口
 */

public interface GatewaySessionFactory {

    GatewaySession openSession(String uri);
}
