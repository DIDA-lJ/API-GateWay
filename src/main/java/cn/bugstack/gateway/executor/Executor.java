package cn.bugstack.gateway.executor;

import cn.bugstack.gateway.executor.result.SessionResult;
import cn.bugstack.gateway.mapping.HttpStatement;

import java.util.Map;

/**
 * @InterfaceName Executor
 * @Description 执行器
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2024/02/15
 */
public interface Executor {

    SessionResult exec(HttpStatement httpStatement, Map<String, Object> params) throws Exception;

}
