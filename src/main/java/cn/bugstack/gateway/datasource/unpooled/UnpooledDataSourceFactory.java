package cn.bugstack.gateway.datasource.unpooled;

import cn.bugstack.gateway.datasource.DataSource;
import cn.bugstack.gateway.datasource.DataSourceFactory;
import cn.bugstack.gateway.datasource.DataSourceType;
import cn.bugstack.gateway.session.Configuration;
/**
 * @author linqi
 * @version 1.0.0
 * @description 无池化的连接池工厂
 */

public class UnpooledDataSourceFactory implements DataSourceFactory {

    protected UnpooledDataSource dataSource;

    public UnpooledDataSourceFactory() {
        this.dataSource = new UnpooledDataSource();
    }

    @Override
    public void setProperties(Configuration configuration, String uri) {
        this.dataSource.setConfiguration(configuration);
        this.dataSource.setDataSourceType(DataSourceType.Dubbo);
        this.dataSource.setHttpStatement(configuration.getHttpStatement(uri));
    }

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

}
