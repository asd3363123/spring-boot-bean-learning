package cn.learn.bean.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * ConfigurationProperties主要用于获取配置文件
 * 1.  springboot新版本中移除了ConfigurationProperties注解扫描指定配置文件源的功能
 * 2.  需要使用PropertySource注解指定配置文件数据源
 * 3.  ConfigurationProperties注解本身不产生Bean，需要使用@Component或者@Configuration生产Bean
 *
 * @author Qianlu
 * @date 2018/01/18 14:50
 **/
//@Component
@Configuration
@ConfigurationProperties(
        ignoreUnknownFields = false,
        prefix = "qianlu.test"
)
@PropertySource("classpath:/config/test.properties")
public class TestConfigurationProperties {

    private String host;

    /**
     * 进行配置文件校验
     */
    @NotNull
    @Min(0)
    @Max(9000)
    private Integer port;

    private Mail mail;

    public static class Mail {

        private String smtp;

        public String getSmtp() {
            return smtp;
        }

        public void setSmtp(String smtp) {
            this.smtp = smtp;
        }
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = (port == null ? 6379 : port);
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }
}
