package cn.learn.bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * ${DESCRIPTION}
 *
 * @author liyufan
 * @date 2018/01/16 16:13
 **/
@Configuration
@ComponentScan(excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
})
public class TestConfiguration {

    @Bean
    public Demo crateDemoBean() {
        return new Demo();
    }

}