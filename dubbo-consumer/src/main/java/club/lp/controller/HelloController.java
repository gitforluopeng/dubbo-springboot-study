package club.lp.controller;

import club.lp.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @DubboReference(check = false)
    private HelloService helloService;

    @GetMapping("/m1")
    public String m1() {
        return "m1";
    }

    @GetMapping("/hello")
    public String hello() {
        return helloService.sayHi("baby");
    }
}
