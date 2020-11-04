package com.dana.pig.demopractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 接口测试controller
 */
@RestController
@RequestMapping("/api/vedio")
public class VideoController {
    @RequestMapping("/test")
    public Map test() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "test");
        map.put("2", "test");
        map.put("3", "test");
        map.put("4", "test");
        return map;
    }


}
