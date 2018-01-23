package cn.learn.bean.Import;

import org.springframework.context.annotation.Import;

/**
 * Import 注解，应该就是 SpringBoot 的关键
 *
 * @author liyufan
 * @date 2018/1/19
 */
@Import({TestImportDemo.class})
public class TestImport {

}
