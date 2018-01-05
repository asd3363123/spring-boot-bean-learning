package cn.learn;

import cn.learn.bean.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

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
        Demo demo = context.getBean(Demo.class);
        System.out.println(demo == null ? null : demo.toString());
    }
}

@Configuration
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
class TestConfiguration {

    @Bean
    public Demo crateDemoBean() {
        return new Demo();
    }

}
