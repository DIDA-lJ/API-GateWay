package cn.bugstack.gateway.session;

import io.netty.channel.Channel;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/**
 * @author linqi
 * @version 1.0.0
 * @description 泛化调用会话工厂接口
 */

public interface IGenericReferenceSessionFactory {

    Future<Channel> openSession() throws ExecutionException, InterruptedException;

}
