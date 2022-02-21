package club.lp.service.impl;

import club.lp.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHi(String obj) {
        return "Hi~," + obj +".";
    }
}
