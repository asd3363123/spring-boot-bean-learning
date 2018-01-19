package cn.learn.bean.configurationProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * EnableConfigurationProperties
 * 没有学习明白的注解
 *
 * @author Qianlu
 * @date 2018/01/18 16:49
 **/
@Configuration
@EnableConfigurationProperties(TestConfigurationProperties.class)
public class TestEnableConfigurationProperties {

    @Autowired
    private TestConfigurationProperties testConfigurationProperties;

    public void test() {
        System.out.println(testConfigurationProperties.getHost());
        System.out.println(testConfigurationProperties.getPort());
        System.out.println(testConfigurationProperties.getMail().getSmtp());
    }

}
