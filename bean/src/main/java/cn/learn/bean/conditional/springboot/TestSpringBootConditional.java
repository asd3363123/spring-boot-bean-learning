package cn.learn.bean.conditional.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

/**
 * SpringBoot对Condition注解功能做了拓展
 * 由 Condition 拓展成了 SpringBootCondition
 * 判断条件也从单纯的 true/false 变成了 ConditionOutcome
 * 若多个注解组合使用，则它们是 “且” 的关系
 * <p>
 * 比如：
 * ConditionalOnBean
 * ConditionalOnMissingBean
 * ConditionalOnClass
 * ConditionalOnMissingClass
 *
 * @author liyufan
 * @date 2018/1/23
 * @see org.springframework.boot.autoconfigure.condition.SpringBootCondition
 * @see org.springframework.boot.autoconfigure.condition.ConditionOutcome
 * @see org.springframework.boot.autoconfigure.condition.ConditionalOnBean
 * @see org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
 * @see org.springframework.boot.autoconfigure.condition.ConditionalOnClass
 * @see org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass
 */
@Component
@ConditionalOnBean(One.class)
@ConditionalOnMissingBean(Two.class)
public class TestSpringBootConditional {
    public void test() {
        System.out.println(" TestSpringBootConditional 装配成功 ");
    }
}
