package xyz.java520.dubbo_api.service;

import xyz.java520.dubbo_api.bean.UserInfo;

import java.util.List;

public interface IUserService {

    UserInfo getUserInfo(Integer userId);


    List<UserInfo> getAllUser();

}
