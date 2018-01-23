package cn.learn;

import cn.learn.bean.conditional.TestConditional;
import cn.learn.bean.conditional.springboot.TestSpringBootConditional;
import cn.learn.bean.configuration.Demo;
import cn.learn.bean.configuration.Demo2;
import cn.learn.bean.configurationProperties.TestConfigurationProperties;
import cn.learn.bean.configurationProperties.TestEnableConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * A Class.
 *
 * @author liyufan
 * @date 2018/1/5
 */
@SpringBootApplication
public class MainApplication {

    private static ApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(MainApplication.class, args);
//        test4ConfigurationProperties();
//        test4EnableConfigurationProperties();
        test4Conditional();
        test4SpringBootConditional();

    }

    private static void test4ConfigurationProperties() {
        System.out.println("-- -- -- ConfigurationProperties 注解测试 -- -- --");
        TestConfigurationProperties testConfigurationProperties = context.getBean(TestConfigurationProperties.class);
        System.out.println(testConfigurationProperties.getHost());
        System.out.println(testConfigurationProperties.getPort());
        System.out.println(testConfigurationProperties.getMail().getSmtp());
        System.out.println("-- -- -- ConfigurationProperties 注解测试 -- -- --");
    }

    private static void test4EnableConfigurationProperties() {
        System.out.println("-- -- -- EnableConfigurationProperties 注解测试 -- -- --");
        TestEnableConfigurationProperties testEnableConfigurationProperties = context.getBean(TestEnableConfigurationProperties.class);
        testEnableConfigurationProperties.test();
        System.out.println("-- -- -- EnableConfigurationProperties 注解测试 -- -- --");
    }

    private static void test4Conditional() {
        System.out.println("-- -- -- Conditional 注解测试 -- -- --");
        TestConditional conditional = context.getBean(TestConditional.class);
        conditional.test();
        System.out.println("-- -- -- Conditional 注解测试 -- -- --");
    }

    private static void test4SpringBootConditional() {
        System.out.println("-- -- -- SpringBootConditional 注解测试 -- -- --");
        TestSpringBootConditional testSpringBootConditional = context.getBean(TestSpringBootConditional.class);
        testSpringBootConditional.test();
        System.out.println("-- -- -- SpringBootConditional 注解测试 -- -- --");
    }

}


