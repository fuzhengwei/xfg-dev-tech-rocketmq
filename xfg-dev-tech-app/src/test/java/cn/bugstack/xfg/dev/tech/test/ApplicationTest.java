package cn.bugstack.xfg.dev.tech.test;

import cn.bugstack.xfg.dev.tech.mq.RocketMQProducer;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private RocketMQProducer rocketMQProducer;

    @Test
    public void test() throws InterruptedException {
        while (true) {
            rocketMQProducer.sendMessage("xfg-mq", "我是测试消息");
            Thread.sleep(3000);
        }
    }
}
