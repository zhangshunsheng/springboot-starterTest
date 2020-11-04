package com.dana.pig.demopractice.service;

import com.dana.pig.demopractice.domain.LoginUser;
import com.dana.pig.demopractice.utils.JsonContactData;

import java.util.List;

/**
 * ClassName: ILoginService
 * Description:
 * date: 2020/10/29 14:38
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
public interface ILoginService {

    /**
     * 检查登录信息
     * @param user 用户信息
     * @return
     */
    JsonContactData checkUser(final LoginUser user);

    /**
     * 获取所有用户
     * @return
     */
    List<LoginUser> getAllUsers();
}
