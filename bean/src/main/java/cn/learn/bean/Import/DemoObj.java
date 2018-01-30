package cn.learn.bean.Import;

/**
 * Import注解的测试用例
 *
 * @author liyufan
 * @date 2018/1/19
 */
public class DemoObj {

    private String name = "qianlu";

    public DemoObj() {
    }

    public DemoObj(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
