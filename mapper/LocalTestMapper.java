package com.dana.pig.demopractice.mapper;

import com.dana.pig.demopractice.domain.LoginUser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: LocalTestMapper
 * Description:
 * date: 2020/10/29 14:40
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@Repository
public class LocalTestMapper {
    public List<LoginUser> getAllUsers() {
        List<LoginUser> users = new ArrayList<LoginUser>();
        users.add(new LoginUser("1","张三","123456"));
        users.add(new LoginUser("2","李四","123456"));
        users.add(new LoginUser("3","王五","123456"));
        users.add(new LoginUser("4","赵六","123456"));
        users.add(new LoginUser("5","孙七","123456"));
        return users;
    }
}
