package com.xmy.Controller;

import com.xmy.Entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class MyThymeleafController {
    @RequestMapping("/myThymeleaf")
    public String myThymeleaf(HttpServletRequest request, Map<String,Object> result) {
        result.put("user",new UserEntity("许明洋",22));
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity("许明洋1",22));
        userEntities.add(new UserEntity("许明洋2",22));
        userEntities.add(new UserEntity("许明洋3",22));
        //将集合转发到页面
        result.put("userList",userEntities);
        return "myThymeleaf";
    }
}
