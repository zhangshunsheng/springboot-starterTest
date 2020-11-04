package com.dana.pig.demopractice.controller;

import com.dana.pig.demopractice.utils.JsonContactData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: GrobleExceptionController
 * Description:
 * date: 2020/10/29 19:35
 *
 * @author ZhangShunsheng
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/dana/v1/pri/grobleException")
public class GrobleExceptionController {

    @GetMapping("testDivileException")
    public JsonContactData testDivileException() {
        int i = 1/0;
        return JsonContactData.buildNormalSuccess("");
    }
}
