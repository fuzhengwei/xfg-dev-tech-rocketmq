package cn.bugstack.xfg.dev.tech.trigger.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 接收消息
 * @create 2023-07-29 11:22
 */
@Component
@Slf4j
@RocketMQMessageListener(topic = "xfg-mq", consumerGroup = "xfg-group")
public class SalaryAdjustMQListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {
        log.info("接收到MQ消息 {}", s);
    }

}
