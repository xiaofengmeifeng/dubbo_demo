package xyz.java520.dubbo_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.java520.dubbo_api.bean.UserInfo;
import xyz.java520.dubbo_consumer.service.OrderServiceImpl;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/info")
    public List<UserInfo> getInfo(Integer userId){
        return orderService.getInfo(userId);
    }

}
