package cn.bugstack.xfg.dev.tech;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 启动应用
 * @create 2023-07-22 08:39
 */
@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args) {

        /*
         * 指定使用的日志框架，否则将会告警
         * RocketMQLog:WARN No appenders could be found for logger (io.netty.util.internal.InternalThreadLocalMap).
         * RocketMQLog:WARN Please initialize the logger system properly.
         */
        System.setProperty("rocketmq.client.logUseSlf4j", "true");

        SpringApplication.run(Application.class, args);
    }

}
