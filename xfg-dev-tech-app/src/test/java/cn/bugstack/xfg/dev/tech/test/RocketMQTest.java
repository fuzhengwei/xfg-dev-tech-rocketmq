package cn.bugstack.xfg.dev.tech.test;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RocketMQTest {

    @Setter(onMethod_ = @Autowired)
    private RocketMQTemplate rocketmqTemplate;

    @Test
    public void test() throws InterruptedException {
        while (true) {
            rocketmqTemplate.convertAndSend("xfg-mq", "我是测试消息");
            Thread.sleep(3000);
        }
    }

}
