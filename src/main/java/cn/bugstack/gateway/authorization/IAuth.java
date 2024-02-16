package cn.bugstack.gateway.authorization;

/**
 * @InterfaceName IAuth
 * @Description 认证服务接口
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2024/02/16
 */
public interface IAuth {

    boolean validate(String id, String token);

}