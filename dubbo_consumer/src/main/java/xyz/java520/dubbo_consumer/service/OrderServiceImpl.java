package xyz.java520.dubbo_consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import xyz.java520.dubbo_api.bean.UserInfo;
import xyz.java520.dubbo_api.service.IUserService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class OrderServiceImpl {

    @Reference
    private IUserService userService;

    public List<UserInfo> getInfo(Integer userId){
        if (userId != null){
            return Stream.of(userService.getUserInfo(userId)).collect(Collectors.toList());
        }
        return userService.getAllUser();
    }

}
