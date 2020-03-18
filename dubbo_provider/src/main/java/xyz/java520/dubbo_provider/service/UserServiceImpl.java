package xyz.java520.dubbo_provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import xyz.java520.dubbo_api.bean.UserInfo;
import xyz.java520.dubbo_api.service.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl implements IUserService {

    private List<UserInfo> list = new ArrayList<>();

    {
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            UserInfo userInfo = new UserInfo(i, "用户" + i, random.nextInt(30));
            list.add(userInfo);
        }
    }

    @Override
    public UserInfo getUserInfo(Integer userId) {
        for (UserInfo userInfo : list) {
            if (userInfo.getId().equals(userId)){
                return userInfo;
            }
        }
        return new UserInfo();
    }

    @Override
    public List<UserInfo> getAllUser() {
        return list;
    }
}
