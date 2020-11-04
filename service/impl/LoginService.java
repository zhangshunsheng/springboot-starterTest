package com.dana.pig.demopractice.service.impl;

import com.dana.pig.demopractice.domain.LoginUser;
import com.dana.pig.demopractice.mapper.LocalTestMapper;
import com.dana.pig.demopractice.service.ILoginService;
import com.dana.pig.demopractice.utils.JsonContactData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: LoginService
 * Description:
 * date: 2020/10/29 14:39
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@Service
public class LoginService implements ILoginService {
    @Autowired
    LocalTestMapper localTestMapper;

    @Override
    public JsonContactData checkUser(LoginUser user) {
        List<LoginUser> allUsers = localTestMapper.getAllUsers();
        for(LoginUser userTemp : allUsers) {
            if(userTemp.getUsername().equals(user.getUsername()) &&
                    userTemp.getPassword().equals(user.getPassword())) {
                return JsonContactData.buildNormalSuccess(userTemp, "登录成功！");
            }
        }
        return JsonContactData.buildNormalFailure("登录失败，当前用户信息不存在！");
    }

    @Override
    public List<LoginUser> getAllUsers() {
        int i = 1/0;
        List<LoginUser> allUsers = localTestMapper.getAllUsers();
        return allUsers;
    }
}
