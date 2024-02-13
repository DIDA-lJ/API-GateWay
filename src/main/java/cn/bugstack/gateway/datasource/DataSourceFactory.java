package cn.bugstack.gateway.datasource;

import cn.bugstack.gateway.mapping.HttpStatement;
import cn.bugstack.gateway.session.Configuration;

/**
 * @InterfaceName DataSourceFactory
 * @Description 数据源工厂
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2024/02/13
 */
public interface DataSourceFactory {

    void setProperties(Configuration configuration, String uri);

    DataSource getDataSource();

}