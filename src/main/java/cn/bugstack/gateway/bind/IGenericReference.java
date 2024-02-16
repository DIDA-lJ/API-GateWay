package cn.bugstack.gateway.bind;

import cn.bugstack.gateway.executor.result.SessionResult;
import java.util.Map;

/**
 * @InterfaceName IGenericReference
 * @Description 统一泛化调用接口
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2024/02/03
 */
public interface IGenericReference {
    /**
     * 提供一个标准的 String 的入参和出参类型的泛化调用接口
     * @param params 传入参数，以 map 的方式传入执行调用
     * @return 执行结果的串
     */
    SessionResult $invoke(Map<String, Object> params);
}
