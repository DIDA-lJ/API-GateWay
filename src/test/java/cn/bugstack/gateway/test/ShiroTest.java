package cn.bugstack.gateway.test;

import cn.bugstack.gateway.authorization.IAuth;
import cn.bugstack.gateway.authorization.JwtUtil;
import cn.bugstack.gateway.authorization.auth.AuthService;
import io.jsonwebtoken.Claims;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linqi
 * @version 1.0.0
 * @description
 */

public class ShiroTest {

    private final static Logger logger = LoggerFactory.getLogger(ShiroTest.class);

    @Test
    public void test_auth_service() {
        IAuth auth = new AuthService();
        boolean validate = auth.validate("DPij8iUY", "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ4aWFvZnVnZSIsImV4cCI6MTcwODY4Nzc3OCwiaWF0IjoxNzA4MDgyOTc4LCJrZXkiOiJ4aWFvZnVnZSJ9.xWfgUA_DYHdPwTyxCk1sQwLqN0rGRD4b0fyKADj2Vmo");
        System.out.println(validate ? "验证成功" : "验证失败");
    }

    @Test
    public void test_awt() {
        String issuer = "xiaofuge";
        long ttlMillis = 7 * 24 * 60 * 60 * 1000L;
        Map<String, Object> claims = new HashMap<>();
        claims.put("key", "xiaofuge");

        // 编码
        String token = JwtUtil.encode(issuer, ttlMillis, claims);
        System.out.println(token);

        // 解码
        Claims parser = JwtUtil.decode(token);
        System.out.println(parser.getSubject());
    }

    @Test
    public void test_shiro() {
        // 1. 获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
        Factory<org.apache.shiro.mgt.SecurityManager> factory =
                new IniSecurityManagerFactory("classpath:test-shiro.ini");

        // 2. 得到SecurityManager实例 并绑定给SecurityUtils
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        // 3. 得到Subject及创建用户名/密码身份验证Token（即用户身份/凭证）
        Subject subject = SecurityUtils.getSubject();

        // 4. 默认提供的验证方式；UsernamePasswordToken
        UsernamePasswordToken token = new UsernamePasswordToken("linqi", "123456");

        try {
            //5.1、登录，即身份验证
            subject.login(token);
        } catch (AuthenticationException e) {
            //5.2、身份验证失败
            System.out.println("身份验证失败");
        }

        System.out.println(subject.isAuthenticated() ? "验证成功" : "验证失败");

        // 6. 退出
        subject.logout();
    }

}
