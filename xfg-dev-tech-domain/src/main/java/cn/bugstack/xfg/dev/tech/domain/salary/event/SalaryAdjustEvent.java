package cn.bugstack.xfg.dev.tech.domain.salary.event;

import cn.bugstack.xfg.dev.tech.domain.salary.model.aggreate.AdjustSalaryApplyOrderAggregate;
import cn.bugstack.xfg.frame.types.BaseEvent;
import lombok.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 消息
 * @create 2023-07-29 10:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SalaryAdjustEvent extends BaseEvent<AdjustSalaryApplyOrderAggregate> {

    public static String TOPIC = "xfg-mq";

    public static SalaryAdjustEvent create(AdjustSalaryApplyOrderAggregate adjustSalaryApplyOrderAggregate) {
        SalaryAdjustEvent event = new SalaryAdjustEvent();
        event.setId(RandomStringUtils.randomNumeric(11));
        event.setTimestamp(new Date());
        event.setData(adjustSalaryApplyOrderAggregate);
        return event;
    }

}
