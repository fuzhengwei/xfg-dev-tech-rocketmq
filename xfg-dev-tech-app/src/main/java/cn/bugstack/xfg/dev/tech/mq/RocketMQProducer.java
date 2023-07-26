package cn.bugstack.xfg.dev.tech.mq;

import lombok.Setter;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RocketMQProducer {

    @Setter(onMethod_ = @Autowired)
    private RocketMQTemplate rocketmqTemplate;

    public void sendMessage(String topic, String message) {
        rocketmqTemplate.convertAndSend(topic, message);
    }

}

