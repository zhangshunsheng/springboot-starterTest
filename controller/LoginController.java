package com.dana.pig.demopractice.controller;

import com.dana.pig.demopractice.domain.LoginUser;
import com.dana.pig.demopractice.service.ILoginService;
import com.dana.pig.demopractice.utils.JsonContactData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: LoginController
 * Description:
 * date: 2020/10/29 14:32
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/dana/v1/pri/login")
@PropertySource(value="classpath:pay.properties")
public class LoginController {

    @Value("${name}")
    private String name;

    @Autowired
    private ILoginService loginService;

    @PostMapping("checkUser")
    public JsonContactData checkLoginUser(@RequestBody LoginUser user) {
        if(user == null) {
            return JsonContactData.buildNormalFailure("查询值为空！");
        }
        return loginService.checkUser(user);
    }

    @GetMapping("getAllData")
    public JsonContactData getAllData() {
        List<LoginUser> users = loginService.getAllUsers();
        return JsonContactData.buildNormalSuccess(users,"获取信息成功");
    }

    @GetMapping("getConfigureMessage")
    public JsonContactData getConfigureMessage() {
        return JsonContactData.buildNormalSuccess(this.name, "获取配置信息成功");
    }
}
