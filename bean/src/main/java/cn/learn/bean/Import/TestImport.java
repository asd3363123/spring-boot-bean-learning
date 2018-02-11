package cn.learn.bean.Import;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * Import 注解
 * 1. import 注解进行依赖注入时，依赖当前类的含参构造器
 * 2. import 注解进行依赖注入时，无参构造器 与 setter 方法 均不能完成依赖注入操作
 * 3. import 本身提供bean
 *
 * @author liyufan
 * @date 2018/1/19
 */
@Component
@Import({DemoObj.class})
public class TestImport {

    private DemoObj demoObj;

    public TestImport(DemoObj demoObj) {
        this.demoObj = demoObj;
    }

    public void printDemoObj() {
        System.out.println("TestImport printDemoObj:" + demoObj.getName());
    }
}
