package cn.learn.bean.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

/**
 * Conditional 指定bean的注入条件
 * 若参数对象的match方法返回true,则此bean有效；若返回false，此bean无效；
 * 若参数有多个，则它们是 “且” 的关系
 * 若存在false，则后面的match方法不再执行
 * <p>
 * 作用：
 * 1、类级别可以放在注标识有@Component（包含@Configuration）的类上
 * 2、作为一个meta-annotation,组成自定义注解
 * 3、方法级别可以放在标识由@Bean的方法上
 * 4、此注解不产生bean
 * 拓展：
 *
 *
 * @author liyufan
 * @date 2018/1/23
 */
@Component
@Conditional(TestCondition.class)   //单个参数
//@Conditional({TestMatch.class, TestCondition.class})  //多个参数
public class TestConditional {
    public void test() {
        System.out.println(" TestConditional 装配成功");
    }
}

