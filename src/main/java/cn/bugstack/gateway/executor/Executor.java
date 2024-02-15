package cn.bugstack.gateway.executor;

import cn.bugstack.gateway.executor.result.GatewayResult;
import cn.bugstack.gateway.mapping.HttpStatement;

/**
 * @InterfaceName Executor
 * @Description 执行器
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2024/02/15
 */
public interface Executor {

    GatewayResult exec(HttpStatement httpStatement, Map<String, Object> params) throws Exception;

}
