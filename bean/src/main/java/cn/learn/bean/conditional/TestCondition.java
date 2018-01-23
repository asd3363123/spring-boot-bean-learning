package cn.learn.bean.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Condition 配置bean的注入条件
 *
 * @author liyufan
 * @date 2018/1/23
 */
class TestCondition implements Condition {

    /**
     * 配置条件
     *
     * @param conditionContext      Spring容器，各种内置对象
     * @param annotatedTypeMetadata Condition注解的配置信息
     * @see ConditionContext#getRegistry()          bean注册器，对bean的增减
     * @see ConditionContext#getBeanFactory()       bean工厂，对bean的查询
     * @see ConditionContext#getEnvironment()       环境，可以查看、获取配置
     * @see ConditionContext#getResourceLoader()    资源加载器，目前不知道做啥的
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println(conditionContext);
        System.out.println(annotatedTypeMetadata);
        return true;
    }
}
