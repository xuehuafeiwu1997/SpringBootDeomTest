package com.xmy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
class FreeMarkerIndexController {
//    @RequestMapping("/freemarkerIndex")
//    public String freemarkerIndex(Map<String,String> result, HttpServletRequest request) {
//        //转发到页面展示数据 name  value
//        result.put("name","许明洋");
//        return "freemarkerIndex";
//    }
    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "springboot-thymeleaf") String name) {
        request.setAttribute("name", name);
        return "freemarkerIndex";
    }
}
