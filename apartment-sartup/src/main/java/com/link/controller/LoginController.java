package com.link.controller;

import com.link.remote.LoginRemote;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController implements LoginRemote {
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model){
        if (!StringUtils.isEmpty(username)&&"123456".equals(password)){
            return "web/apartment";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            return "web/index";
        }

    }

    @Override
    public String index() {
        return "web/index";
    }
}
