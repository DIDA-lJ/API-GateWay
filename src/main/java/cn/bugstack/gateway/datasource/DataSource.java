package cn.bugstack.gateway.datasource;

/**
 * @InterfaceName DataSource
 * @Description 数据源接口，RPC、HTTP 都当做连接的数据资源使用
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2024/02/13
 */
public interface DataSource {

    Connection getConnection();

}
