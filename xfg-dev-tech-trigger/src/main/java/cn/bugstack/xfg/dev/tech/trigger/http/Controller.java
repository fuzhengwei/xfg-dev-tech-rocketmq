package cn.bugstack.xfg.dev.tech.trigger.http;

import cn.bugstack.xfg.frame.types.Constants;
import cn.bugstack.xfg.frame.types.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;

@Slf4j
@RestController
public class Controller {

    /**
     * http://localhost:8090/success
     */
    @RequestMapping("/success")
    public Response<String> success() {
        return Response.<String>builder()
                .code(Constants.ResponseCode.SUCCESS.getCode())
                .info(Constants.ResponseCode.SUCCESS.getInfo())
                .data("查询用户信息，小傅哥")
                .build();
    }

}
